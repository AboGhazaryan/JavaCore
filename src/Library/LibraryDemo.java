package Library;

import java.util.Scanner;


public class LibraryDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();


    public static void main(String[] args) {


        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOK_BY_TITLE:
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case PRINT_EXPENSIVE_BOOK:
                        System.out.println(bookStorage.getBookByMaxPrice());
                    break;
                case DELETE_BOOK_ID:
                    System.out.println("Please enter the ID to delete.");
                    int id = Integer.parseInt(scanner.nextLine());
                    bookStorage.deletebookid(id);
                    break;
                case SEARCH_PRICE_RANGE:
                    System.out.println("Please enter the minPrice");
                    double min = scanner.nextDouble();
                    System.out.println("Please enter the maxPrice");
                    double max = scanner.nextDouble();
                    bookStorage.searchByPriceRange(min, max);
                    break;
                default:
                    System.err.println("Wrong command! try again");


            }
        }
    }

    private static void addBook() {
        System.out.println("Please input book's title");
        String bookTitle = scanner.nextLine();
        System.out.println("Please input book's authorName");
        String authorname = scanner.nextLine();
        System.out.println("Please input book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input book's id");
        int setid = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input book's quantity");
        int setQuantity = Integer.parseInt(scanner.nextLine());



        // Book book = new Book(bookTitle, authorname, price);
        Book book = new Book();
        book.setTitle(bookTitle);
        book.setAutorName(authorname);
        book.setPrice(price);
        book.setId(setid);
        book.setQuantity(setQuantity);


        bookStorage.add(book);
        System.out.println("Book added successfully ");
    }


}
