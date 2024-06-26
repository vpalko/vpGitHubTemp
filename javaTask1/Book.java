public class Book extends Product {

    private String author;

    /**
     * Book constructor
     * 
     * @param author  the author of the book
     * @param price   the price of the book
     * @param name    the book's title
     * @param inStock number of copies in stock
     */
    public Book(String author, double price, String name, int inStock, int id) {
        super(price, name, inStock, id);
        this.author = author;
    }

    /**
     * Getter for author field
     * 
     * @return the author as a String
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Setter for author field
     * 
     * @param author the author as a String
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.getProductID() + ". " + this.getName() + " by " + this.getAuthor() + ": " + this.getPrice()
                + " (BOOK)";
    }

}