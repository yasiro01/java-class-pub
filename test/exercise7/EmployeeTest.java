package exercise7;

/*
 * Implement the constructor of the class Employee that takes 2 parameters (name and ssn)
 * Implement getters and setters for all data members of the class Employee
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoffka04
 */
public class EmployeeTest {
    private Employee employee1;
    
    @Before
    public void setUp() {
        employee1 = new Employee("Jim Halpert", "123-45-6789");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Jim Halpert";
        String result = employee1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Pam Beesly";
        employee1.setName(name);
        assertEquals(name, employee1.getName());
    }

    /**
     * Test of getSsn method, of class Employee.
     */
    @Test
    public void testGetSsn() {
        System.out.println("getSsn");
        String expResult = "123-45-6789";
        String result = employee1.getSsn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSsn method, of class Employee.
     */
    @Test
    public void testSetSsn() {
        System.out.println("setSsn");
        String ssn = "987-65-4321";
        employee1.setSsn(ssn);
        assertEquals(ssn, employee1.getSsn());
    }
}
