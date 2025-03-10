import config.AzureSqlConnection;
import model.DTO.EBookDTO;
import org.hibernate.Session;

public class Main {
    public static void main(String[] args) {

        String dbConnectionString = System.getenv("AZURE_SQL_URL");
        dbConnectionString = dbConnectionString.replace("|", ";");

        // Now you can use dbConnectionString to connect to your database
        System.out.println(dbConnectionString);
    }
}
