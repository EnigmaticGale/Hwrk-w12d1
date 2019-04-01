import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before () {
        director = new Director("man",100,1000, "department",10);
    }

    @Test
    public void canGetProperties () {
        assertEquals("man",director.getName());
        assertEquals(100,director.getNiNumber());
        assertEquals(1000,director.getSalary(),0.01);
        assertEquals("department",director.getDeptName());
        assertEquals(10, director.getBudget(),0.01);
    }

    @Test
    public void canRaiseSalary () {
        director.raiseSalary(1.0);
        assertEquals(1001,director.getSalary(),0.01);
    }

    @Test
    public void canGetPayBonus () {
        assertEquals(20, director.payBonus(),0.01);
    }
}

