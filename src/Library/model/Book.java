package Library.model;

import java.util.Objects;

public class Book {
    private Author autor;
    private String title;
    private double price;
    private int quantity;
    private int id;

    public Book(String title, Author autor, double price) {
        this.title = title;
        this.price = price;
        this.autor = autor;
    }

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAutor() {
        return autor;
    }

    public void setAutor(Author autor) {
        this.autor = autor;
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
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && id == book.id && Objects.equals(autor, book.autor) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, title, price, quantity, id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor=" + autor +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", id=" + id +
                '}';
    }
}
