import Staff.TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before () {
        developer = new Developer("man",100,1000);
    }

    @Test
    public void canGetProperties () {
        assertEquals("man",developer.getName());
        assertEquals(100,developer.getNiNumber());
        assertEquals(1000,developer.getSalary(),0.01);
    }

    @Test
    public void canRaiseSalary () {
        developer.raiseSalary(1.0);
        assertEquals(1001,developer.getSalary(),0.01);
    }

    @Test
    public void canGetPayBonus () {
        assertEquals(10, developer.payBonus(),0.01);
    }
}
