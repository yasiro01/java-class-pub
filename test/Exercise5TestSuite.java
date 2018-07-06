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
@Suite.SuiteClasses({
  RoomTest.class,
  BookTest.class,
  EmployeeTest.class,
  CompanyTest.class,
  CollegeTest.class,
  LaptopTest.class,
  SongTest.class,
  ChartTest.class,
  StudentTest.class,
  RosterTest.class
})
public class Exercise5TestSuite {

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
