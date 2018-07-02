/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ex1Driver.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task1 method, of class Ex1Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        System.setOut(new PrintStream(outContent));
        Ex1Driver.task1();
        String expectedResult = "Hello World"; //works for print & printf, but NOT println!
        assertEquals(expectedResult, outContent.toString());
        System.setOut(System.out);
    }

    /**
     * Test of task2 method, of class Ex1Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        Ex1Driver.task2();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task3 method, of class Ex1Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Ex1Driver.task3();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task4 method, of class Ex1Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        Ex1Driver.task4();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task5 method, of class Ex1Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Ex1Driver.task5();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task6 method, of class Ex1Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        Ex1Driver.task6();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task7 method, of class Ex1Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Ex1Driver.task7();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task8 method, of class Ex1Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        int[] numbers = null;
        int expResult = 0;
        int result = Ex1Driver.task8(numbers);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task9 method, of class Ex1Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        boolean expResult = false;
        boolean result = Ex1Driver.task9();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of task10 method, of class Ex1Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        Ex1Driver.task10();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
