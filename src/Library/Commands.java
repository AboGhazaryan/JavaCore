package Library;

public interface Commands {
     String EXIT = "0";
     String ADD_AUTHOR = "1";
     String ADD_BOOK = "2";
     String PRINT_ALL_AUTHORS = "3";
     String PRINT_ALL_BOOKS = "4";
     String SEARCH_BOOK_BY_TITLE = "5";
     String SEARCH_BOOK_BY_AUTHOR = "6";
     String PRINT_EXPENSIVE_BOOK = "7";
     String DELETE_BOOK_ID = "8";
     String SEARCH_PRICE_RANGE = "9";

     static void printCommands() {
        System.out.println("Please input " + EXIT + " FOR EXIT");
        System.out.println("Please input " + ADD_AUTHOR + " FOR ADD AUTHOR");
        System.out.println("Please input " + ADD_BOOK + " FOR ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_AUTHORS + " FOR PRINT ALL AUTHORS");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " FOR PRINT ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " FOR SEARCH BOOK BY TITLE");
        System.out.println("Please input " + SEARCH_BOOK_BY_AUTHOR + " FOR SEARCH BOOK BY AUTHOR");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " FOR PRINT EXPENSIVE BOOK");
        System.out.println("Please input " + DELETE_BOOK_ID + " DELETE ANY OF YOUR BOOKS");
        System.out.println("Please input " + SEARCH_PRICE_RANGE + " SEARCH BY PRICE RANGE");


    }
}
