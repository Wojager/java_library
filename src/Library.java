public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.1";
        String title = "w pustynie i w puszczy";
        String author = "Henryk Sienkiewicz";
        int releaseDate = 1996;
        int pages = 297;
        String publisher = "Greg";
        String isbn = "1234567890123";

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        System.out.println(title);
        System.out.println(author);
        System.out.println(releaseDate);
        System.out.println(pages + " stron");
        System.out.println(publisher);
        System.out.println(isbn);
    }
}
