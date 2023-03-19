public class Main {
    public static void main(String[] args) {

        Author author = new Author("JNeto", 21, "Rio de Janeiro", "male", Author.Formation.Specialist);
        Book book = new Book("How to Get Rich", author, "Livrinhos", "Lisbon", 2023, 3);

        System.out.println("\nCSV version: \n" + book.generateCSV());
        System.out.println("\nAttributes Version: ");
        book.printBookInfo();
    }
}

