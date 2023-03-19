public class Book {

    private String name = "default";
    private String author = "default";
    private String publisher = "default";
    private String city = "default";
    private int publishingYear = 0;
    private int editionNumber = 0;

    public Book() {}
    public Book(String name, String author, String publisher, String city, int publishingYear, int editionNumber) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.city = city;
        this.publishingYear = publishingYear;
        this.editionNumber = editionNumber;
    }

    public void printBookInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Book \nname: %s\nauthor: %s\npublisher: %s\ncity: %s\npublishing year: %d\nedition: %d",
                              name, author, publisher, city, publishingYear, editionNumber);
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getPublisher() {return publisher;}
    public void setPublisher(String publisher) {this.publisher = publisher;}
    public String getCity() {return city;}
    public void setCity(String city) {this.city = city;}
    public int getPublishingYear() {return publishingYear;}
    public void setPublishingYear(int publishingYear) {this.publishingYear = publishingYear;}
    public int getEditionNumber() {return editionNumber;}
    public void setEditionNumber(int editionNumber) {this.editionNumber = editionNumber;}

}