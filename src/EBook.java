/**
 * Class EBook
 * MediaLibrary code 4
 * 
 * 1. Implement the constructor that calls a constructor of the superclass
 * 2. Override methods checkin and checkout. They should do nothing
 * 3. Implement method getInfo that returns detailed description of an ebook
 * 
 * @author yasiro01
 */
public class EBook extends Book {
  private final String format;
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
}
