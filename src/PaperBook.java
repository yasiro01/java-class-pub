/**
 * Exercise 8: Class PaperBook
 * MediaLibrary code 3
 * 
 * 1. Implement the constructor that calls a constructor of the superclass
 * 2. Implement method move() that changes the location of a book
 * 3. Implement method getInfo() that returns detailed description of a paper book
 * 
 * @author yasiro01
 */
public class PaperBook extends Book {
  private final int pages;
  private String location;

  /**
   * Get the number of pages
   * @return the value of pages
   */
  public int getPages() {
    return pages;
  }
  
  /**
   * Get the value of location
   * @return the value of location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Set the value of location
   * @param location new value of location
   */
  private void setLocation(String location) {
    this.location = location;
  }

  /**
   * Move an item to a new location
   * @param newLocation 
   */
  public void move(String newLocation) {
    throw new UnsupportedOperationException();
  }
  
}
