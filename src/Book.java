public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookReleaseDate, int bookPages, String boobPublisher, String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookReleaseDate;
        pages = bookPages;
        publisher = boobPublisher;
        isbn = bookIsbn;
    }

    void printInfo() {
        String info = title + ", " + author + ", " + releaseDate + ", " + pages + " stron, " + publisher + ", " + isbn;
        System.out.println(info);
    }
}
