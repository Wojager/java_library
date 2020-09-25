public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.2";

        Book book1 = new Book();
        book1.title = "w pustynie i w puszczy";
        book1.author = "Henryk Sienkiewicz";
        book1.releaseDate = 1996;
        book1.pages = 297;
        book1.publisher = "Greg";
        book1.isbn = "1234567890123";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDate);
        System.out.println(book1.pages + " stron");
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}
