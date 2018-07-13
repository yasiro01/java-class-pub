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
public class KangarooTest {
    private Kangaroo kangaroo1;
    private Kangaroo kangaroo2;
    
    @Before
    public void setUp() {
        kangaroo1 = new Kangaroo("Kanga", 6);
        kangaroo2 = new Kangaroo("Baby", 1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Kangaroo.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Kanga";
        String result = kangaroo1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Kangaroo.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Roo";
        kangaroo2.setName(name);
        assertEquals(name, kangaroo2.getName());
    }

    /**
     * Test of getAge method, of class Kangaroo.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 6;
        int result = kangaroo1.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Kangaroo.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 2;
        kangaroo2.setAge(age);
        assertEquals(age, kangaroo2.getAge());
    }

    /**
     * Test of getBabies method, of class Kangaroo.
     */
    @Test
    public void testGetBabies() {
        System.out.println("getBabies");
        int expResult = 1;
        int result = kangaroo1.getBabies();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBabies method, of class Kangaroo.
     */
    @Test
    public void testSetBabies() {
        System.out.println("setBabies");
        int babies = 0;
        kangaroo2.setBabies(babies);
        assertEquals(babies, kangaroo2.getBabies());
    }

    /**
     * Test of hashCode method, of class Kangaroo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = -1855640210;
        int result = kangaroo1.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Kangaroo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        // Two different Kangaroos
        boolean expResult = false;
        boolean result = kangaroo1.equals(kangaroo2);
        assertEquals(expResult, result);
        // Same Kangaroo
        expResult = true;
        result = kangaroo1.equals(kangaroo1);
        // Two different Kangaroo objects, same data
        Kangaroo instance = new Kangaroo("Kanga", 6);
        result = kangaroo1.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Kangaroo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Kangaroo{name=Kanga, age=6, babies=1}";
        String result = kangaroo1.toString();
        assertEquals(expResult, result);
    }
    
}
