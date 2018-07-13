package exercise7;

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
public class HourlyEmployeeTest {
    private HourlyEmployee he;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
        he = new HourlyEmployee("Dwight Schrute", "777-77-7777", 10, 20);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWageRate method, of class HourlyEmployee.
     */
    @Test
    public void testGetWageRate() {
        System.out.println("getWageRate");
        double expResult = 10.0;
        double result = he.getWageRate();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setWageRate method, of class HourlyEmployee.
     */
    @Test
    public void testSetWageRate() {
        System.out.println("setWageRate");
        double wageRate = 12.0;
        he.setWageRate(wageRate);
        assertEquals(wageRate, he.getWageRate(), 0.0);
    }

    /**
     * Test of getHours method, of class HourlyEmployee.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        double expResult = 20.0;
        double result = he.getHours();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setHours method, of class HourlyEmployee.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        double hours = 40.0;
        he.setHours(hours);
        assertEquals(hours, he.getHours(), 0.0);
    }

    /**
     * Test of getNetPay method, of class HourlyEmployee.
     */
    @Test
    public void testGetNetPay() {
        System.out.println("getNetPay");
        double expResult = 10400.0;
        double result = he.getNetPay();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of printWeeklyCheck method, of class HourlyEmployee.
     */
    @Test
    public void testPrintWeeklyCheck() {
        System.out.println("printWeeklyCheck");
        System.setOut(new PrintStream(outContent));
        he.printWeeklyCheck();
        String expResult = "Weekly Check is: $200.00\n";
        assertEquals(expResult, outContent.toString());
    }

    /**
     * Test of toString method, of class HourlyEmployee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "HourlyEmployee{name=Dwight Schrute, ssn=777-77-7777, wageRate=10.0, hours=20.0}";
        String result = he.toString();
        assertEquals(expResult, result);
    }
    
}
