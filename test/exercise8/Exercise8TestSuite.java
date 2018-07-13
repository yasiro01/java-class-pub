package exercise8;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author yasiro01
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({exercise8.Ex8DriverTest.class, exercise8.PhysicalMovieTest.class, exercise8.EBookTest.class, exercise8.PaperBookTest.class, exercise8.DigitalMovieTest.class})
public class Exercise8TestSuite {

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }
  
}
