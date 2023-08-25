/**
 * @author Akash Gautam
 * @version 2.0
 * @since 2023
 */
package javadocdemo;

/**
 * @author Akash Gautam
 * 
 * Class for library book
 */

public class Book {
    /**
     * @value 10 default value
     */
    static int val = 10;

    /**
     * Parameterised constructor
     * @param s Book name
     */
    public Book(String s) {}

    /**
     * Issue a book to a student
     * @param roll Roll number of a student
     * @throws Exception If book is not available, throws exception
     */
    public void issueBook(int roll) throws Exception {}

    /**
     * Check the availability of book
     * @param str Book name
     * @return If book is vaialable return true else false
     */
    public boolean available(String str) {
        return true;
    }

    /**
     * Get book name
     * @param id Book id
     * @return Return book name
     */
    public String getName(int id) {
        return "";
    }
} 