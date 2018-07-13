package exercise6;

/*
 *Each group type has a constructor that takes file name as a parameter and reads 
 * respective animals from that file
 * Each group type has method size that returns size of the respective collection
 * Each group type has method getChief that returns the oldest animal in the group
*/

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing KangarooMob
 * @author yasiro01
 */
public class KangarooMobTest {
  KangarooMob instance1 = new KangarooMob("data/zoo1.txt");
  KangarooMob instance2 = new KangarooMob("data/zoo2.txt");
  
  public KangarooMobTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of size method, of class KangarooMob.
   */
  @Test
  public void testSize() {
    System.out.println("KangarooMob.size");
    int expResult = 4;
    int result = instance1.size();
    assertEquals(expResult, result);
    expResult = 5;
    result = instance2.size();
    assertEquals(expResult, result);
  }

  /**
   * Test of getChief method, of class KangarooMob.
   */
  @Test
  public void testGetChief() {
    System.out.println("KangarooMob.getChief");
    Kangaroo expResult = new Kangaroo("Wind", 99);
    Kangaroo result = instance1.getChief();
    assertEquals(expResult, result);
    expResult = new Kangaroo("Wild Axe", 93);
    result = instance2.getChief();
    assertEquals(expResult, result);
  }
  
}
