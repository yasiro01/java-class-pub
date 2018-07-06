/*
 * Implement class HourlyEmployee that extends class Employee
 * Implement the constructor of the class HourlyEmployee that takes 4 parameters
    (name, ssn, wageRate, and hours). Name and ssn must be initialized by
    calling the constructor of the superclass (Employee).
 * Implement getters and setters for all data members of the class HourlyEmployee
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoffka04
 */
public class SalariedEmployeeTest {
    private SalariedEmployee se;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
        se = new SalariedEmployee ("Phyllis Lapin", "295-09-2578", 100000);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSalary method, of class SalariedEmployee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        double expResult = 100000.0;
        double result = se.getSalary();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setSalary method, of class SalariedEmployee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
        double salary = 100500.0;
        se.setSalary(salary);
        assertEquals(salary, se.getSalary(), 0.0);
    }

    /**
     * Test of getNetPay method, of class SalariedEmployee.
     */
    @Test
    public void testGetNetPay() {
        System.out.println("getNetPay");
        double expResult = 0.0;
        double result = se.getNetPay();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of printWeeklyCheck method, of class SalariedEmployee.
     */
    @Test
    public void testPrintWeeklyCheck() {
        System.out.println("printWeeklyCheck");
        System.setOut(new PrintStream(outContent));
        se.printWeeklyCheck();
    }

    /**
     * Test of toString method, of class SalariedEmployee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "SalariedEmployee{salary=100000.0}";
        String result = se.toString();
        assertEquals(expResult, result);
    }
    
}
