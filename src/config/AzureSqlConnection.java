package config;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/** as per Hibernate convention one instance of this class is created at program startup
* sessions can be requested as needed throughout the entire lifetime of the program
* NOTE: sessions should be closed when transaction is completed as they are not thread-safe
 */
public class AzureSqlConnection {
    private static final SessionFactory sessionFactory;

    static {
        try {

            Configuration configuration = new Configuration();
            // env variables setup through RUN->EDIT CONFIG
            String databaseURL = System.getenv("AZURE_SQL_URL");

            configuration.setProperty("hibernate.connection.driver_class", "com.microsoft.sqlserver.jdbc.SQLServerDriver");
            configuration.setProperty("hibernate.connection.url", databaseURL);

            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }

    // this method used only for: testing and initialising SessionFactory at program startup
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}

