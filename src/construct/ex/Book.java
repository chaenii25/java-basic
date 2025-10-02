package construct.ex;

public class Book {

    String title;
    String author;
    int page;

    Book() {
        this(null, null, 0);
    }

    Book(String title, String author) {
        this(title, author, 100);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page: " + page);
    }
}
