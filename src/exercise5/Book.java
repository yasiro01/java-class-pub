package exercise5;

/**
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author Teboho Samuel Nteso
 */
public class Book {
    private String title;
    private String author;
    private Double price;
    
    //Constructor
    public Book(String title, String author, Double price) {
        this.author = author;
        this.title = title;
        this.price = price;            
    }
    
    public String getTitle(){
        return this.title;
    }
    public String setTitle(){
        return this.title = "harry potter";
    }
    public String getAuthor() {
        return this.author;
    }
    public String setAuthor() {
        return this.author = "J.K.Rowling";
    }
    public Double getPrice() {
        return this.price;
    }
    public Double setPrice(){
        return this.price = 2.3;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", price=" + price + '}';
    }
}
