package config;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AzureSqlConnectionUnitTest {
    /**
     * to pass this test env connection string
     * with valid user credential must be inserted
     */
    @Test
    public void testSessionFactoryInitialization() {
        assertNotNull(AzureSqlConnection.getSessionFactory(), "SessionFactory should not be null");
    }
}
