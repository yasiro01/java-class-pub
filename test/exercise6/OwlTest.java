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
public class OwlTest {
    private Owl owl1;
    private Owl owl2;
        
    @Before
    public void setUp() {
        owl1 = new Owl("Hedwig", 7);
        owl2 = new Owl("Pigwidgeon", 2);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test that all data members are private
     */
//    @Test
//    public void testPrivate() throws Error {
//        String errorMessage = "";
//        try {
//            String name = owl1.name;
//            int age = owl1.age;
//            String wisdom = owl1.wisdom;
//        } catch(Error e){
//            System.out.println("Error Caught");
//        }
//        
//    }
//    Above test doesn't work -- is there a way to test access that I'm just
//    completely forgetting?

    /**
     * Test of getName method, of class Owl.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Hedwig";
        String result = owl1.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Owl.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Pig";
        owl2.setName(name);
        assertEquals(name, owl2.getName());
    }

    /**
     * Test of getAge method, of class Owl.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        int expResult = 7;
        int result = owl1.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAge method, of class Owl.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 3;
        owl2.setAge(age);
        assertEquals(age, owl2.getAge());
    }

    /**
     * Test of getWisdom method, of class Owl.
     */
    @Test
    public void testGetWisdom() {
        System.out.println("getWisdom");
        String expResult = "medium";
        String result = owl1.getWisdom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWisdom method, of class Owl.
     */
    @Test
    public void testSetWisdom() {
        System.out.println("setWisdom");
        String wisdom = "low";
        owl2.setWisdom(wisdom);
        assertEquals(wisdom, owl2.getWisdom());
    }

    /**
     * Test of hashCode method, of class Owl.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 2099889141;
        int result = owl1.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Owl.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        // Two different Owls
        boolean expResult = false;
        boolean result = owl1.equals(owl2);
        assertEquals(expResult, result);
        // Same Owl
        expResult = true;
        result = owl1.equals(owl1);
        assertEquals(expResult, result);
        // Different Objects, same data
        Owl instance = new Owl("Hedwig", 7);
        assert(owl1.equals(instance));
    }

    /**
     * Test of toString method, of class Owl.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Owl{name=Hedwig, age=7, wisdom=medium}";
        String result = owl1.toString();
        assertEquals(expResult, result);
    }
    
}
