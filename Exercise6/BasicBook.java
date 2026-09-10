package tangavietanh_3289.Lec08_ObjectAndClass.Exercise6;

public class BasicBook {
    private String title;
    private String author;
    private double price;

    public BasicBook() {

    }

    public BasicBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println(title + " | " + author + " | " + price);
    }
}
