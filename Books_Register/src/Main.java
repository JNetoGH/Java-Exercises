public class Main {
    public static void main(String[] args) {

        Author author = new Author("JNeto", 21, "Rio de Janeiro", "male", Author.Formation.Specialist);
        new Book("How to get some bitches", author, "Livrinhos", "Lisbon", 2023, 3).printBookInfo();
        
    }
}
