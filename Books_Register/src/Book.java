public class Book {

    String name = "default";
    String author = "default";
    String publisher = "default";
    String city = "default";
    int publishingYear = 0;
    int editionNumber = 0;

    public Book() {}
    public Book(String name, String author, String publisher, String city, int publishingYear, int editionNumber) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.publishingYear = publishingYear;
        this.editionNumber = editionNumber;
    }

    @Override
    public String toString() {
        return String.format("Book \nname: %s\nauthor: %s\npublisher: %s\ncity: %s\npublishing year: %d\nedition: %d",
                              name, author, publisher, city, publishingYear, editionNumber);
    }

    public void printBookInfo() {
        System.out.println(this);
    }

}