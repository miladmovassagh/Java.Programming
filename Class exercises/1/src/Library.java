public class Library {
    private String bookName;
    private String customerName;
    private String authorName;
    private int membershipCode;

    public Library() {
        System.out.println("object is created.");
    }
    public Library(String a, String b) {
        setLibrary(a, b);
    }
    public Library(String a, String b, String c, int d) {
        setLibrary(a, b, c, d);
    }
    public void setLibrary(String a, String b) {
        bookName = a;
        authorName = b;
    }
    public void setLibrary(String a, String b, String c, int d) {
        bookName = a;
        authorName = b;
        customerName = c;
        membershipCode = d;
    }
    public void borrowingBook() {
        System.out.println("the " + bookName + " book was lent to the customer with the following specifications:");
        System.out.println("name of customer: " + customerName + ", membership code of customer: " + membershipCode);
    }
    public void returnBook() {
        System.out.println("the " + bookName + " book was returned by the customer with the following specifications:");
        System.out.println("name of customer: " + customerName + ", membership code of customer: " + membershipCode);
    }
    public void registerBook() {
        System.out.println("the book was registered in the library with the following specifications:");
        System.out.println("name of book: " + bookName + ", name of author: " + authorName);
    }
}