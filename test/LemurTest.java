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
public class LemurTest {
    private Lemur lemur1;
    private Lemur lemur2;
            
    @Before
    public void setUp() {
        lemur1 = new Lemur("Aye-Aye", 4);
        lemur2 = new Lemur("Sifakas", 6);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTailLength method, of class Lemur.
     */
    @Test
    public void testGetTailLength() {
        System.out.println("getTailLength");
        int expResult = 20;
        int result = lemur1.getTailLength();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTailLength method, of class Lemur.
     */
    @Test
    public void testSetTailLength() {
        System.out.println("setTailLength");
        int tailLength = 0;
        lemur2.setTailLength(tailLength);
        assertEquals(tailLength, lemur2.getTailLength());
    }

    /**
     * Test of getAge method, of class Lemur.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 4;
        int result = lemur1.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Lemur.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 7;
        lemur2.setAge(age);
        assertEquals(age, lemur2.getAge());
    }

    /**
     * Test of getName method, of class Lemur.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Aye-Aye";
        String result = lemur1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Lemur.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Lemuridae";
        lemur2.setName(name);
        assertEquals(name, lemur2.getName());
    }

    /**
     * Test of hashCode method, of class Lemur.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 174376382;
        int result = lemur1.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Lemur.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        // Two different Lemurs
        boolean expResult = false;
        boolean result = lemur1.equals(lemur2);
        assertEquals(expResult, result);
        // Same Lemur
        expResult = true;
        result = lemur1.equals(lemur1);
        assertEquals(expResult, result);
        // Different Lemur Obj, same data
        Lemur instance = new Lemur("Aye-Aye", 4);
        result = lemur1.equals(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Lemur.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Lemur{name=Aye-Aye, age=4, tailLength=20}";
        String result = lemur1.toString();
        assertEquals(expResult, result);
    }
    
}
