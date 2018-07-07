import java.util.ArrayList;

/**
 * Exercise 8: Class DigitalMovie
 * MediaLibrary code 2
 * 
 *  1. Implement the constructor that calls a constructor of the superclass
 *  2. Override methods checkin and checkout. ***They should do nothing***
 *  3. Implement method getInfo that returns detailed description of a digital movie
 * 
 * @author yasiro01
 */
public class DigitalMovie extends Movie {
  private String service;

  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
  }
  
}
