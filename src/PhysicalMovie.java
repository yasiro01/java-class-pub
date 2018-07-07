/**
 * Exercise 8: Class PhysicalMovie
 * MediaLibrary code 1
 * 
 * 1. Implement the constructor that calls a constructor of the superclass
 * 2. Implement method move() that changes the location of a movie
 * 3. Implement method getInfo() that returns detailed description of a physical movie
 * 
 * @author yasiro01
 */
public class PhysicalMovie extends Movie {
  private final String medium;
  private String location;

  /**
   * Get the value of medium
   * @return the value of medium
   */
  public String getMedium() {
    return medium;
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
