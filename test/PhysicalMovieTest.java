/*
 * Implement the constructor that calls a constructor of the superclass
 * Implement method move() that changes the location of a movie
 * Implement method getInfo() that returns detailed description of a physical movie
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoffka04
 */
public class PhysicalMovieTest {
    private PhysicalMovie movie1;
    
    @Before
    public void setUp() {
        movie1 = new PhysicalMovie("Blu-ray", "History", 
                        "Theodore Melfi", 2016, 
                        23057239L, "Hidden Figures", 1);
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of getId method, of superclass Item
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Long expResult = 23057239L;
        Long result = movie1.getId();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTitle method, of superclass Item
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Hidden Figures";
        String result = movie1.getTitle();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getQuantity method, of superclass Item
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 1;
        int result = movie1.getQuantity();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setQuantity method, of superclass Item
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int qty = 2;
        movie1.setQuantity(qty);
        assertEquals(qty, movie1.getQuantity());
    }
    
    /**
     * Test of isAvailable method, of superclass Item
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        // Test Available
        boolean expResult = true;
        boolean result = movie1.isAvailable();
        assertEquals(expResult, result);
        // Test Not Available
        movie1.checkout();
        expResult = false;
        result = movie1.isAvailable();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkout method, of superclass Item
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        // Item available
        // Item unavailable
    }
    
    /**
     * Test of checkin method, of superclass Item
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        int originalQty = movie1.getQuantity();
        // Qty should be one more
        movie1.checkin();
        int newQty = movie1.getQuantity();
        assertEquals(newQty-originalQty, 1);
    }
    
    /**
     * Test of toString method, of superclass Item
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "We have a copy of Hidden Figures";
        String result = movie1.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getDirector method, of superclass Movie
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        String expResult = "Theodore Melfi";
        String result = movie1.getDirector();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getReleaseYear method, of superclass Movie
     */
    @Test
    public void testGetReleaseYear() {
        System.out.println("getReleaseYear");
        int expResult = 2016;
        int result = movie1.getReleaseYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedium method, of class PhysicalMovie.
     */
    @Test
    public void testGetMedium() {
        System.out.println("getMedium");
        String expResult = "Blu-ray";
        String result = movie1.getMedium();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocation method, of class PhysicalMovie.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        String expResult = "History";
        String result = movie1.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class PhysicalMovie.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        String newLocation = "US History";
        movie1.move(newLocation);
        assertEquals(newLocation, movie1.getLocation());
    }

    /**
     * Test of getInfo method, of class PhysicalMovie.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        String expResult = "Hidden Figures (2016) by Theodore Melfi is located at History";
        String result = movie1.getInfo();
        assertEquals(expResult, result);
    }
    
}
