/*
 * Implement the constructor that calls a constructor of the superclass
 * Override methods checkin and checkout. They should do nothing
 * Implement method getInfo that returns detailed description of a digital movie
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoffka04
 */
public class DigitalMovieTest {
    private DigitalMovie digitalMovie1;
    
    @Before
    public void setUp() {
        digitalMovie1 = new DigitalMovie("Prime Video", 
                        "John Lee Hancock", 2013, 
                        133097248L, "Saving Mr. Banks");
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
        Long expResult = 133097248L;
        Long result = digitalMovie1.getId();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTitle method, of superclass Item
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Saving Mr. Banks";
        String result = digitalMovie1.getTitle();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getQuantity method, of superclass Item
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 1;
        int result = digitalMovie1.getQuantity();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setQuantity method, of superclass Item
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int qty = 2;
        digitalMovie1.setQuantity(qty);
        assertEquals(qty, digitalMovie1.getQuantity());
    }
    
    /**
     * Test of isAvailable method, of superclass Item
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        // Test Available
        boolean expResult = true;
        boolean result = digitalMovie1.isAvailable();
        assertEquals(expResult, result);
        // Should always be available
        digitalMovie1.checkout();
        expResult = true;
        result = digitalMovie1.isAvailable();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkout method, of superclass Item
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        // Checkout should have no effect on the quantity
        int originalQty = digitalMovie1.getQuantity();
        digitalMovie1.checkout();
        int newQty = digitalMovie1.getQuantity();
        assertEquals(originalQty, newQty);
    }
    
    /**
     * Test of checkin method, of superclass Item
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        // Checkin should have no effect on the quantity
        int originalQty = digitalMovie1.getQuantity();
        digitalMovie1.checkin();
        int newQty = digitalMovie1.getQuantity();
        assertEquals(originalQty, newQty);
    }
    
    /**
     * Test of toString method, of superclass Item
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "We have a copy of Saving Mr. Banks";
        String result = digitalMovie1.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getDirector method, of superclass Movie
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        String expResult = "John Lee Hancock";
        String result = digitalMovie1.getDirector();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getReleaseYear method, of superclass Movie
     */
    @Test
    public void testGetReleaseYear() {
        System.out.println("getReleaseYear");
        int expResult = 2013;
        int result = digitalMovie1.getReleaseYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getService method, of class DigitalMovie.
     */
    @Test
    public void testGetService() {
        System.out.println("getService");
        String expResult = "Prime Video";
        String result = digitalMovie1.getService();
        assertEquals(expResult, result);
    }

    /**
     * Test of setService method, of class DigitalMovie.
     */
    @Test
    public void testSetService() {
        System.out.println("setService");
        String service = "Hulu";
        digitalMovie1.setService(service);
        assertEquals(service, digitalMovie1.getService());
    }

    /**
     * Test of getInfo method, of class DigitalMovie.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        String expResult = "Saving Mr. Banks (2013) by John Lee Hancock is available via Prime Video";
        String result = digitalMovie1.getInfo();
        assertEquals(expResult, result);
    }
    
}
