/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class Ex3DriverTest {
    
    public Ex3DriverTest() {
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
     * Test of main method, of class Ex3Driver.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ex3Driver.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMatrix method, of class Ex3Driver.
     */
    @Test
    public void testPrintMatrix() {
        System.out.println("printMatrix");
        int[][] matrix = null;
        Ex3Driver.printMatrix(matrix);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeMatrix method, of class Ex3Driver.
     */
    @Test
    public void testWriteMatrix() throws Exception {
        System.out.println("writeMatrix");
        int[][] matrix = null;
        String filename = "";
        Ex3Driver.writeMatrix(matrix, filename);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFile method, of class Ex3Driver.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        String filename = "";
        int[][] expResult = null;
        int[][] result = Ex3Driver.readFile(filename);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Ex3Driver.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int[][] matrix1 = null;
        int[][] matrix2 = null;
        int[][] expResult = null;
        int[][] result = Ex3Driver.multiply(matrix1, matrix2);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
