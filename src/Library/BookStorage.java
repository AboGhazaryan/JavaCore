package Library;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[size + 10];
        System.arraycopy(books, 0, temp, 0, size);
        books = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void search(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(books[i]);
            }
        }
    }


    public void searchByPriceRange(double minPrice,double maxPrice) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getPrice() >= minPrice && books[i].getPrice() <= maxPrice) {
                System.out.println(books[i]);
            }
        }
    }


    public Book getBookByMaxPrice() {
        double price = 0;
        int maxIndex = -1;
        for (int i = 0; i < size; i++) {
            if (books[i].getPrice() > price) {
                price = books[i].getPrice();
                maxIndex = i;
            }
        }
        return books[maxIndex];
    }

    public void deletebookid(int index) {
        if (index < 0 || index > books.length) {
            System.out.println("The library is empty.");
            return;
        }
        for (int i = index; i < books.length; i++) {
            books[i - 1] = books[i];
        }
        size--;
    }


}