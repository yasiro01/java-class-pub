package exercise5;

/**
 * Class Laptop
 * Task 6: Create a class Laptop with the following private data members: String manufacturer, double price, String color. Implement setters for color and price.
 * @author Teboho Samuel Nteso
 * Assignment: Exercise5
 */
public class Laptop {
    String manufacturer;
    Double price;
    String color;
    
    // Constructor
    public Laptop (String manufacturer,Double price,String color) {
        this.manufacturer = manufacturer;
        this.color = color;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
}
