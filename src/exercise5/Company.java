package exercise5;

/**
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author Teboho Samuel Nteso
 * Assihnement: Excercise 5
 * */
public class Company {
    private String name;
    private Double stockPrice;
    
    //Constructor
    public Company(String name, Double stockPrice){
        this.name = name;
        this.stockPrice = stockPrice;
    }
    
    public String getName(){
        return this.name;
    }
    public Double getStockPrice(){
        return this.stockPrice;
    }
    public Double setStockPrice() {
        return this.stockPrice = stockPrice;
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", stockPrice=" + stockPrice + '}';
    }
    
}
