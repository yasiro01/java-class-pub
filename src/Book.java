/**
 * Exercise 10: Class Book
 * 
 * Create a class Book with the following data members
 * - final String title
 * - final String author
 * - Double price
 * - final Integer year
 * Implement two class constructors
 * - One that takes 4 parameters
 * - A copy constructor that takes an another Book object and creates its copy
 * Implement the following methods of the class Book
 * - Getters for all data members
 * - Price setter
 * - equals (2 books are equal if their titles, authors, and years are equal. Do not use price for comparison)
 * - hash (generated default is fine)
 * - toString (see unittest for the expected result)
 * 
 * @author yasiro01
 */
public class Book {
}

/**
 * Create class ByTitle that implements Comparator<Book>.
 * This class should compare two books by the value of the title field.
 */
class ByTitle implements Comparator<Book> {
}

/**
 * Create class ByAuthor that implements Comparator<Book>.
 * This class should compare two books by the value of the author field.
 */
class ByAuthor implements Comparator<Book> {
}

/**
 * Create class ByPrice that implements Comparator<Book>.
 * This class should compare two books by the value of the price field.
 */
class ByPrice implements Comparator<Book> {
}

/**
 * Create class ByYear that implements Comparator<Book>.
 * This class should compare two books by the value of the year field.
 */
class ByYear implements Comparator<Book> {
}
