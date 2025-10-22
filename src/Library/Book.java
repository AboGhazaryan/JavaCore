package Library;
import java.util.Objects;
public class Book {
    private int id;
    private String title;
    private String autorName;
    private double price;
    private int quantity;

    public Book(String title, String autorName, double price) {
        this.title = title;
        this.autorName = autorName;
        this.price = price;
    }

    public Book(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutorName() {
        return autorName;
    }

    public void setAutorName(String autorName) {
        this.autorName = autorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && Objects.equals(title, book.title) && Objects.equals(autorName, book.autorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autorName, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title ='" + title + '\'' +
                ", autorName ='" + autorName + '\'' +
                ", price =" + price + ", id = " + id + ", quantity =" + quantity +
                '}';
    }


}
