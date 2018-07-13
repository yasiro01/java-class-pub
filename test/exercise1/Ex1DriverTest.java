package exercise1;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author hoffka04
 */
public class Ex1DriverTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//    private final ByteArrayInputStream inContent = new ByteArrayInputStream();
    
    public Ex1DriverTest() {
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
     * Test of main method, of class Ex1Driver.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Ex1Driver.main(args);
//    }

    /**
     * Test of task1 method, of class Ex1Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task1();
        String expectedResult = "Hello World\n";
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task2 method, of class Ex1Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task2();
        String expectedResult = "1\n" +
                                "2\n" +
                                "foo\n" +
                                "4\n" +
                                "bar\n" +
                                "foo\n" +
                                "7\n" +
                                "8\n" +
                                "foo\n" +
                                "bar\n" +
                                "11\n" +
                                "foo\n" +
                                "13\n" +
                                "14\n" +
                                "huh\n" +
                                "16\n" +
                                "17\n" +
                                "foo\n" +
                                "19\n" +
                                "bar\n" +
                                "foo\n" +
                                "22\n" +
                                "23\n" +
                                "foo\n" +
                                "bar\n" +
                                "26\n" +
                                "foo\n" +
                                "28\n" +
                                "29\n" +
                                "huh\n" +
                                "31\n" +
                                "32\n" +
                                "foo\n" +
                                "34\n" +
                                "bar\n" +
                                "foo\n" +
                                "37\n" +
                                "38\n" +
                                "foo\n" +
                                "bar\n" +
                                "41\n" +
                                "foo\n" +
                                "43\n" +
                                "44\n" +
                                "huh\n" +
                                "46\n" +
                                "47\n" +
                                "foo\n" +
                                "49\n" +
                                "bar\n" +
                                "foo\n" +
                                "52\n" +
                                "53\n" +
                                "foo\n" +
                                "bar\n" +
                                "56\n" +
                                "foo\n" +
                                "58\n" +
                                "59\n" +
                                "huh\n" +
                                "61\n" +
                                "62\n" +
                                "foo\n" +
                                "64\n" +
                                "bar\n" +
                                "foo\n" +
                                "67\n" +
                                "68\n" +
                                "foo\n" +
                                "bar\n" +
                                "71\n" +
                                "foo\n" +
                                "73\n" +
                                "74\n" +
                                "huh\n" +
                                "76\n" +
                                "77\n" +
                                "foo\n" +
                                "79\n" +
                                "bar\n" +
                                "foo\n" +
                                "82\n" +
                                "83\n" +
                                "foo\n" +
                                "bar\n" +
                                "86\n" +
                                "foo\n" +
                                "88\n" +
                                "89\n" +
                                "huh\n" +
                                "91\n" +
                                "92\n" +
                                "foo\n" +
                                "94\n" +
                                "bar\n" +
                                "foo\n" +
                                "97\n" +
                                "98\n" +
                                "foo\n" +
                                "bar\n";
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task3 method, of class Ex1Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task3();
        String expectedResult = "The sum of all multiples of 7 between 1 and 100 is 735\n";
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task4 method, of class Ex1Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task4();
        String expectedResult = "The sum of all numbers between 1 and 20 is 210\n" +
            "The product of all numbers between 1 and 20 is 2432902008176640000\n"; 
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task5 method, of class Ex1Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");

        // Test for a middle name
        // Hijack the Input
        String data1 = "John Q Doe";
        System.setIn(new ByteArrayInputStream(data1.getBytes()));
        
        //  Hijack the output
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task5();
        
        // Test without a middle name
        //  Hijack the Input
        String data2 = "Roman Yasinovskyy";
        System.setIn(new ByteArrayInputStream(data2.getBytes()));
        
        Ex1Driver.task5();
        
        String expectedResult = "Please enter your full name\n" + 
                                 "Your initials are JQD\n" + 
                                 "Please enter your full name\n" + 
                                 "Your initials are RY\n";
        
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
        
    }

    /**
     * Test of task6 method, of class Ex1Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task6();
        String expectedResult = "0 1 8 27 64 125 216 343 512 729 ";
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task7 method, of class Ex1Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        
        // Test for incorrect input/thrown exception
        
        // Hijack the Input
        String num1 = "42";
        System.setIn(new ByteArrayInputStream(num1.getBytes()));
        
        //Test 42 (should NOT be found)
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task7();
        
        // Hijack the Input
        String num2 = "24";
        System.setIn(new ByteArrayInputStream(num2.getBytes()));
        
        // Test 24 (should be found)
        Ex1Driver.task7();
        
        String expectedResult = "Enter a number\n" + 
                                "42 was NOT found in the array\n" +
                                "Enter a number\n" +
                                "24 was found in the array\n";
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task8 method, of class Ex1Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
          numbers[i] = rnd.nextInt(10);
        }
        int expectedResult = 31;
        int result = Ex1Driver.task8(numbers);
        assertEquals(expectedResult, result);
    }

    /**
     * Test of task9 method, of class Ex1Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        
        String data1 = "java";
        System.setIn(new ByteArrayInputStream(data1.getBytes()));
        boolean result = Ex1Driver.task9();
        
        boolean expectedResult = false;
        assertEquals(expectedResult, result);
        
        String data2 = "cpp";
        System.setIn(new ByteArrayInputStream(data2.getBytes()));
        result = Ex1Driver.task9();
        
        expectedResult = true;
        assertEquals(expectedResult, result);
    }

    /**
     * Test of task10 method, of class Ex1Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task10();
        String expectedResult = "Prime numbers between 1 and 100\n" +
            "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 \n";
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }
    
}
