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
public class FrogTest {
    private Frog frog1;
    private Frog frog2;

    @Before
    public void setUp() {
        frog1 = new Frog("Kermit", 3);
        frog2 = new Frog("Frogger", 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class Frog.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        String expResult = "Green";
        String result = frog1.getColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setColor method, of class Frog.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "Brown";
        frog2.setColor(color);
        assertEquals(color, frog2.getColor());
    }

    /**
     * Test of getAge method, of class Frog.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 3;
        int result = frog1.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Frog.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 2;
        frog2.setAge(age);
        assertEquals(age, frog2.getAge());
    }

    /**
     * Test of getName method, of class Frog.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Kermit";
        String result = frog1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Frog.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Lollihops";
        frog2.setName(name);
        assertEquals(name, frog2.getName());
    }

    /**
     * Test of hashCode method, of class Frog.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = -507244853;
        int result = frog1.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Frog.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        // Two different Frogs
        boolean expResult = false;
        boolean result = frog1.equals(frog2);
        assertEquals(expResult, result);
        // Same Frog
        expResult = true;
        result = frog1.equals(frog1);
        assertEquals(expResult, result);
        // Two different Frog objects, same data
        Frog instance = new Frog("Kermit", 3);
        result = frog1.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Frog.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Frog{name=Kermit, age=3, color=Green}";
        String result = frog1.toString();
        assertEquals(expResult, result);
    }
    
}
