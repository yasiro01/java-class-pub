package exercise8;

/*
 * Implement the constructor that calls a constructor of the superclass
 * Implement method move() that changes the location of a book
 * Implement method getInfo() that returns detailed description of a paper book
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
public class PaperBookTest {
    private PaperBook book1;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    @Before
    public void setUp() {
        book1 = new PaperBook(480, "History", "Kate Moore", 2017, 2016040681L, "The Radium Girls", 1);
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
        Long expResult = 2016040681L;
        Long result = book1.getId();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getTitle method, of superclass Item
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "The Radium Girls";
        String result = book1.getTitle();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getQuantity method, of superclass Item
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 1;
        int result = book1.getQuantity();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setQuantity method, of superclass Item
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int qty = 2;
        book1.setQuantity(qty);
        assertEquals(qty, book1.getQuantity());
    }
    
    /**
     * Test of isAvailable method, of superclass Item
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        // Test Available
        boolean expResult = true;
        boolean result = book1.isAvailable();
        assertEquals(expResult, result);
        // Test Not Available
        book1.checkout();
        expResult = false;
        result = book1.isAvailable();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of checkout method, of superclass Item
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        // Item available
        int expResult = 0;
        book1.checkout();
        int result = book1.getQuantity();
        assertEquals(expResult, result);
        System.setOut(System.out);
    }

    @Test(expected = ArithmeticException.class)
    public void testCheckoutException() {
        // Item unavailable
        book1.setQuantity(0);
        book1.checkout();
    }

    /**
     * Test of checkin method, of superclass Item
     */
    @Test
    public void testCheckin() {
        System.out.println("checkin");
        int originalQty = book1.getQuantity();
        // Qty should be one more
        book1.checkin();
        int newQty = book1.getQuantity();
        assertEquals(newQty-originalQty, 1);
    }
    
    /**
     * Test of toString method, of superclass Item
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        // If the quantity is 1
        String expResult = "We have a copy of The Radium Girls";
        String result = book1.toString();
        assertEquals(expResult, result);
        // If the quantity is 0
        book1.checkout();
        expResult = "We don't have any The Radium Girls available";
        result = book1.toString();
        assertEquals(expResult, result);
        // If the quantity is more than 1
        book1.checkin();
        book1.checkin();
        expResult = "We have 2 copies of The Radium Girls";
        result = book1.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAuthor method, of superclass Book
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        String expResult = "Kate Moore";
        String result = book1.getAuthor();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getPublishingYear, of superclass Book
     */
    @Test
    public void testGetPublishingYear() {
        System.out.println("getPublishingYear");
        int expResult = 2017;
        int result = book1.getPublishingYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPages method, of class PaperBook.
     */
    @Test
    public void testGetPages() {
        System.out.println("getPages");
        int expResult = 480;
        int result = book1.getPages();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocation method, of class PaperBook.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        String expResult = "History";
        String result = book1.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class PaperBook.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        String newLocation = "US History";
        book1.move(newLocation);
        assertEquals(newLocation, book1.getLocation());
    }

    /**
     * Test of getInfo method, of class PaperBook.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        String expResult = "Kate Moore (2017). The Radium Girls is located at History";
        String result = book1.getInfo();
        assertEquals(expResult, result);
    }
    
}
