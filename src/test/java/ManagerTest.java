import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before () {
        manager = new Manager("man",100,1000, "department");
    }

    @Test
    public void canGetProperties () {
        assertEquals("man",manager.getName());
        assertEquals(100,manager.getNiNumber());
        assertEquals(1000,manager.getSalary(),0.01);
        assertEquals("department",manager.getDeptName());
    }

    @Test
    public void canRaiseSalary () {
        manager.raiseSalary(1.0);
        assertEquals(1001,manager.getSalary(),0.01);
    }

    @Test
    public void salaryNegativeNoNo () {
        manager.raiseSalary(-1);
        assertEquals(1000,manager.getSalary(),0.01);
    }

    @Test
    public void canGetPayBonus () {
        assertEquals(10, manager.payBonus(),0.01);
    }

    @Test
    public void canChangeNameNotNull() {
        manager.setName("boy");
        assertEquals("boy",manager.getName());
        manager.setName(null);
        assertEquals("boy",manager.getName());
    }
}
