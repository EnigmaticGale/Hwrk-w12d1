import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before () {
        databaseAdmin = new DatabaseAdmin("man",100,1000);
    }

    @Test
    public void canGetProperties () {
        assertEquals("man",databaseAdmin.getName());
        assertEquals(100,databaseAdmin.getNiNumber());
        assertEquals(1000,databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary () {
        databaseAdmin.raiseSalary(1.0);
        assertEquals(1001,databaseAdmin.getSalary(),0.01);
    }

    @Test
    public void canGetPayBonus () {
        assertEquals(10, databaseAdmin.payBonus(),0.01);
    }
}
