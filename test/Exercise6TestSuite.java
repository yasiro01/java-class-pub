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
  CrowTest.class,
  FrogTest.class,
  KangarooTest.class,
  LemurTest.class,
  OwlTest.class,
  CrowMurderTest.class,
  FrogArmyTest.class,
  KangarooMobTest.class,
  LemurConspiracyTest.class,
  OwlParliamentTest.class
})
public class Exercise6TestSuite {

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
