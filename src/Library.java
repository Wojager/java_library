public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.3";

        Book book1 = new Book("w pustyni i w puszczy", "Henryk Sienkiewicz", 1996, 297, "Greg", "1234567890123" );
        Book book2 = new Book("Diuna II", "John Doe", 1988, 199, "pwn", "9879879879" );
        Book book3 = new Book("John Wick I", "John Wick", 2018, 456, "MSI", "7657657657" );


        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");

        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}
