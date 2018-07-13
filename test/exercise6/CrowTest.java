package exercise6;

/*
 * All data members are private
 * Each animal class has a constructor that takes name and age as parameters.
    Other constructors are optional.
 * Each animal class has properly implemented getters for its data members
 * Each animal class has the toString method
 * Each animal class has hashCode method
 * Each animal class has equals method
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoffka04
 */
public class CrowTest {
    private Crow crow1;
    private Crow crow2;
    
    @Before
    public void setUp() {
        crow1 = new Crow("Qrow", 38);
        crow2 = new Crow("Greenseer", 100);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIq method, of class Crow.
     */
    @Test
    public void testGetIq() {
        System.out.println("getIq");
        int expResult = 100;
        int result = crow2.getIq();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIq method, of class Crow.
     */
    @Test
    public void testSetIq() {
        System.out.println("setIq");
        int iq = 50;
        crow1.setIq(iq);
        assertEquals(iq, crow1.getIq());
    }

    /**
     * Test of getAge method, of class Crow.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 38;
        int result = crow1.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Crow.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 39;
        crow1.setAge(age);
        assertEquals(age, crow1.getAge());
    }

    /**
     * Test of getName method, of class Crow.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Qrow";
        String result = crow1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Crow.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Bran";
        crow2.setName(name);
        assertEquals(name, crow2.getName());
    }

    /**
     * Test of hashCode method, of class Crow.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 911974184;
        int result = crow1.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Crow.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        // Two different Crows
        boolean expResult = false;
        boolean result = crow1.equals(crow2);
        assertEquals(expResult, result);
        // Same Crow
        expResult = true;
        result = crow1.equals(crow1);
        assertEquals(expResult, result);
        // Two different Crow objects, same data
        Crow instance = new Crow("Qrow", 38);
        result = crow1.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Crow.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Crow{name=Qrow, age=38, iq=100}";
        String result = crow1.toString();
        assertEquals(expResult, result);
    }
    
}
