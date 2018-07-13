package exercise2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import static org.hamcrest.CoreMatchers.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hoffka04
 */
public class Ex2DriverTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public Ex2DriverTest() {
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
     * Test of main method, of class Ex2Driver.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Ex2Driver.main(args);
//    }

    /**
     * Test of task1 method, of class Ex2Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        System.setOut(new PrintStream(outContent));
        // Base Case: none
        int n = 0;
        Ex2Driver.task1(n);
        // (Output should be nothing)
        String expectedResult = "";
        assertEquals(expectedResult, outContent.toString());
        
        // Base Case: 1
        n = 1;
        Ex2Driver.task1(n);
        String expResult2 = "Heads\n";
        // (Output's last line should be 'Heads')
        String[] expectedResult2 = expResult2.split("\n");
        String result = outContent.toString();
        String[] resultArray = result.split("\n");
        int resultArraySize = resultArray.length;
        String[] lastNlines = Arrays.copyOfRange(resultArray, resultArraySize-n, resultArraySize);
        
        
        System.out.println(Arrays.toString(expectedResult2));
        System.out.println(Arrays.toString(lastNlines));
        
        Assert.assertArrayEquals(expectedResult2, lastNlines);
        
        // Base Case: 3
        n = 3;
        Ex2Driver.task1(n);
        String expResult3 = "Heads\n";
        // (Output's last line should be 'Heads')
        String[] expectedResult3 = expResult3.split("\n");
        String result3 = outContent.toString();
        String[] resultArray3 = result3.split("\n");
        int resultArraySize3 = resultArray3.length;
        String[] lastNlines3 = Arrays.copyOfRange(resultArray3, resultArraySize3-n, resultArraySize3);
        System.setOut(System.out);
        
        System.out.println(Arrays.toString(expectedResult3));
        System.out.println(Arrays.toString(lastNlines3));
        
        System.setOut(System.out);
    }

    /**
     * Test of task2 method, of class Ex2Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numberArr = new int[10];
        for (int i = 0; i < 10; i++) {
          numberArr[i] = rnd.nextInt(100);
        }
        
        int n = 75;
        boolean expResult = false;
        boolean result = Ex2Driver.task2(numberArr, n);
        assertEquals(expResult, result);
        
        n = 100;
        expResult = true;
        result = Ex2Driver.task2(numberArr, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task3 method, of class Ex2Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numberArr = new int[10];
        for (int i = 0; i < 10; i++) {
          numberArr[i] = rnd.nextInt(100);
        }
        
        int threshold = 75;
        int expResult = 8;
        int result = Ex2Driver.task3(numberArr, threshold);
        assertEquals(expResult, result);
    }

    /**
     * Test of task4 method, of class Ex2Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        System.setOut(new PrintStream(outContent));
        
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numberArr = new int[10];
        for (int i = 0; i < 10; i++) {
          numberArr[i] = rnd.nextInt(100);
        }
        
        String expResult = "[46, 19, 53, 47, 44, 36, 70, 100, 96, 60]";
        Ex2Driver.task4(numberArr);
        assertEquals(expResult, Arrays.toString(numberArr));
        
        System.setOut(System.out);
    }

    /**
     * Test of task5 method, of class Ex2Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        System.setOut(new PrintStream(outContent));
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numberArr = new int[10];
        for (int i = 0; i < 10; i++) {
          numberArr[i] = rnd.nextInt(100);
        }
        String expResult = "A: 2; B: 0, C: 0, D: 1, F: 7\n";
        Ex2Driver.task5(numberArr);
        assertEquals(expResult, outContent.toString());
        System.setOut(System.out);
        
    }

    /**
     * Test of task6 method, of class Ex2Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        
        //Hijack input & Output
        String input = "0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(outContent));
        
        Ex2Driver.task6();
        
        input = "5\n" + "3\n" + "4\n" + "0\n";
        //Hijack Input & Output
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        System.setOut(new PrintStream(outContent));
        Ex2Driver.task6();
        String expResult = "Please enter a number (0 to stop)\n" +
                            "[]\n" +
                           "Please enter a number (0 to stop)\n" +
                           "[5.0, 3.0, 4.0]\n";
        assertEquals(expResult, outContent.toString());
        
        //Reset Input & Output
        System.setIn(System.in);
        System.setOut(System.out);
    }

    /**
     * Test of task7 method, of class Ex2Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        // Check the size of the array
        Ex2Driver.task7();
        ArrayList result = Ex2Driver.task7();
        assertEquals(10, result.size());
        // Check that each element is above 50 and below 100
        for (int i = 0; i < result.size(); i++) {
            int num = (int) result.get(i);
            assert(num<=100);
            assert(num>=50);
        }
    }

    /**
     * Test of task8 method, of class Ex2Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        System.setOut(new PrintStream(outContent));
        // Create ArrayList
        Random rnd = new Random();
        rnd.setSeed(252);
        ArrayList<Integer> numberLst = new ArrayList();
        for (int i = 0; i < 10; i++) {
          numberLst.add(rnd.nextInt(100));
        }
        // Set up Test Case & Expected Result
        int threshold = 75;
        int expResult = 8;
        int result = Ex2Driver.task8(numberLst, threshold);
        assertEquals(expResult, result);
        String expOutput = "[40, 13, 47, 41, 38, 30, 64, 94, 90, 54]\n";
        assertEquals(expOutput, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task9 method, of class Ex2Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        int[][] expMatrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
            expMatrix[i][j] = (i+1)*(j+1);
          }
        }
        int[][] result = Ex2Driver.task9();
        assertArrayEquals(expMatrix, result);
    }

    /**
     * Test of task10 method, of class Ex2Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        System.setOut(new PrintStream(outContent));
        
        int[][] matrix = new int[10][10];
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
            matrix[i][j] = (i+1)*(j+1);
          }
        }
        
        String expResult = "    1    2    3    4    5    6    7    8    9   10   55\n" +
                           "    2    4    6    8   10   12   14   16   18   20  110\n" +
                           "    3    6    9   12   15   18   21   24   27   30  165\n" +
                           "    4    8   12   16   20   24   28   32   36   40  220\n" +
                           "    5   10   15   20   25   30   35   40   45   50  275\n" +
                           "    6   12   18   24   30   36   42   48   54   60  330\n" +
                           "    7   14   21   28   35   42   49   56   63   70  385\n" +
                           "    8   16   24   32   40   48   56   64   72   80  440\n" +
                           "    9   18   27   36   45   54   63   72   81   90  495\n" +
                           "   10   20   30   40   50   60   70   80   90  100  550\n" +
                           "   55  110  165  220  275  330  385  440  495  550\n";
        
        Ex2Driver.task10(matrix);
        assertEquals(expResult, outContent.toString());
        System.setOut(System.out);
    }
    
}
