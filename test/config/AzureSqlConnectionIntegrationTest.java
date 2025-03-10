package config;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AzureSqlConnectionIntegrationTest {

    /**
     * Session factory should open session upon request.
     * This assumes unit test was passed already and factory connects to database successfully
     */
    @Test
    public void SessionFactoryShouldOpenSessionUponRequest() {
            Session session = AzureSqlConnection.getSession();
            System.out.println(session);
            assertNotNull(session);
    }
}