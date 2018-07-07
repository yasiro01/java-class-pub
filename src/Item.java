/**
 * Exercise 8: Class Item
 *  1. Implement constructor of the class Item
 *  2. Implement getters and setters (if applicable) for all data members
 *     (id, title, quantity)
 *  3. Implement methods checkout (decrement quantity, if possible) and checkin
 *     (increment quantity)
 *  4. Implement method toString that returns a meaningful string with the title
 *     and quantity (is possible). See the output file for example
 * 
 * @author yasiro01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    throw new UnsupportedOperationException();
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    throw new UnsupportedOperationException();
  }

  /**
   * Check in an item
   */
  public void checkin() {
      throw new UnsupportedOperationException();
  }
  
  @Override
  public String toString() {
    throw new UnsupportedOperationException();
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
