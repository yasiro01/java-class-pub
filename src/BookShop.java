import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise 10: Class BookShop
 * 
 * Create a class BookShop that uses an ArrayList object catalog to store the 
 * book catalog.
 * This class must have three constructors:
 * - One that takes no parameters and initializes the catalog to an empty ArrayList
 * - One that takes a file name as a parameter, calls the 1st constructor to 
 *   initialize the catalog, and reads data from the file. This constructor 
 *   should throw FileNotFoundException.
 * - One that takes another object of type BookShop as a parameter and makes a
 *   copy of it. Use the 1st constructor to initialize the catalog.
 * Implement the following methods
 * - addNewTitle that takes a Book object and adds it to the catalog
 * - size that returns the size of the catalog
 * - discountAll that applies the provided discount (given as percentage to take
 *   off) to all books in the catalog
 * - printCatalog that prints all items in the catalog
 * - getCatalog that returns the catalog object
 * Implement method order of the class BookStore that takes a Comparator as a 
 *  parameter and orders the list based on that comparator.
 * 
 * @author yasiro01
 */
public class BookShop {

  public BookShop() {
  }
  
  public BookShop(String filename) throws FileNotFoundException {
  }
  
  public BookShop(BookShop anotherBookShop) {
  }
  
  public void addNewTitle(Book book) {
  }
  
  public int size() {
  }
  
  public void discountAll(Double discountPercent) {
  }
  
  public void printCatalog() {
  }
  
  public void order(Comparator<Book> comp) {
  }
  
  public ArrayList<Book> getCatalog() {
  }

}
