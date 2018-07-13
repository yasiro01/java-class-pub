package exercise3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public static final String PATH = "data/";
    
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
     * Test of main method, of class Ex3DriverSolution.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Ex3Driver.main(args);
        // Not Written by Student
    }

    /**
     * Test of printMatrix method, of class Ex3DriverSolution.
     */
    @Test
    public void testPrintMatrix() {
        System.out.println("printMatrix");
        int[][] matrix = { {1, 8, 6, 1}, {2, 0, 1, 8} };
        Ex3Driver.printMatrix(matrix);
        // Not Written by Student
    }

    /**
     * Test of writeMatrix method, of class Ex3DriverSolution.
     */
    @Test
    public void testWriteMatrix() throws Exception {
        System.out.println("writeMatrix");
        
        // Read the result matrix to make sure it is written correctly
        String filename = PATH + "testWrite.txt";
        
        int[][] matrix = { {1, 8, 6, 1}, {2, 0, 1, 8} };
        Ex3Driver.writeMatrix(matrix, PATH + "testWrite.txt");
        
        // Now Read the result Matrix
        Scanner inputFile = new Scanner(new File(filename));
        Scanner inputLine = new Scanner(inputFile.nextLine());
        String fileContents = "";
        while (inputFile.hasNextLine()) {
            fileContents += inputFile.nextLine();
            fileContents += "\n";
        }
        // View File Contents
        System.out.print("File Contents\n" + fileContents + "\n");
        // What should be in the File
        System.out.println("Original Matrix");
        Ex3Driver.printMatrix(matrix);
        
        String expContents = "    1    8    6    1\n" +
                             "    2    0    1    8\n";
        // Compare Expected and Result
        assertEquals(expContents, fileContents);
    }

    /**
     * Test of readFile method, of class Ex3DriverSolution.
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println("readFile");
        
        // ReadFile returns a matrix
        String filename = PATH + "matrix1.txt";
        int[][] expResult = { {1, 8, 6, 1}, {2, 0, 1, 7} };
        int[][] result = Ex3Driver.readFile(filename);
        assertArrayEquals(expResult, result);
        
        filename = PATH + "matrix2.txt";
        int[][] expResult2 = { {0}, {2}, {5}, {2} };
        result = Ex3Driver.readFile(filename);
        assertArrayEquals(expResult2, result);
    }

    /**
     * Test of multiply method, of class Ex3DriverSolution.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int[][] matrix1 = { {1, 8, 6, 1}, {2, 0, 1, 7} };
        int[][] matrix2 = { {0}, {2}, {5}, {2} };
        int[][] expResult = { {48}, {19} };
        int[][] result = Ex3Driver.multiply(matrix1, matrix2);
        assertArrayEquals(expResult, result);
    }
    
}
