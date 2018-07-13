package exercise8;

/*
 * Implement the constructo that calls a constructor of the superclass
 * Override methods checkin and checkout. ***They should do nothing***
 * Implement method getInfo that returns detailed description of an ebook
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
public class EBookTest {
    private EBook ebook1;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        ebook1 = new EBook("nook", 
                 "Sarah Lacy", 2008, 
                 1592404278L, "Once You're Lucky, Twice You're Good");
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
        Long expResult = 1592404278L;
        Long result = ebook1.getId();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTitle method, of superclass Item
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Once You're Lucky, Twice You're Good";
        String result = ebook1.getTitle();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getQuantity method, of superclass Item
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 1;
        int result = ebook1.getQuantity();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setQuantity method, of superclass Item
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int qty = 2;
        ebook1.setQuantity(qty);
        assertEquals(qty, ebook1.getQuantity());
    }
    
    /**
     * Test of isAvailable method, of superclass Item
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        // Test Available
        boolean expResult = true;
        boolean result = ebook1.isAvailable();
        assertEquals(expResult, result);
        // Should always be available, even after checkout
        ebook1.checkout();
        expResult = true;
        result = ebook1.isAvailable();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkout method, of superclass Item
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        // Checking out an ebook should not change the qty
        int originalQty = ebook1.getQuantity();
        ebook1.checkout();
        int newQty = ebook1.getQuantity();
        assertEquals(originalQty, newQty);
    }
    
    /**
     * Test of checkin method, of superclass Item
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        // Checking in an ebook should not change the qty
        int originalQty = ebook1.getQuantity();
        ebook1.checkin();
        int newQty = ebook1.getQuantity();
        assertEquals(originalQty, newQty);
    }
    
    /**
     * Test of toString method, of superclass Item
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "We have a copy of Once You're Lucky, Twice You're Good";
        String result = ebook1.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAuthor method, of superclass Book
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        String expResult = "Sarah Lacy";
        String result = ebook1.getAuthor();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getPublishingYear, of superclass Book
     */
    @Test
    public void testGetPublishingYear() {
        System.out.println("getPublishingYear");
        int expResult = 2008;
        int result = ebook1.getPublishingYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFormat method, of class EBook.
     */
    @Test
    public void testGetFormat() {
        System.out.println("getFormat");
        String expResult = "nook";
        String result = ebook1.getFormat();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInfo method, of class EBook.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        String expResult = "Sarah Lacy (2008). Once You're Lucky, Twice You're Good is available for nook";
        String result = ebook1.getInfo();
        assertEquals(expResult, result);
    }
    
}
