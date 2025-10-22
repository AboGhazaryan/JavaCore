package Library;

public interface Commands {
     String EXIT = "0";
     String ADD_BOOK = "1";
     String PRINT_ALL_BOOKS = "2";
     String SEARCH_BOOK_BY_TITLE = "3";
     String PRINT_EXPENSIVE_BOOK = "4";
     String DELETE_BOOK_ID = "5";
     String SEARCH_PRICE_RANGE = "6";

     static void printCommands() {
        System.out.println("Please input " + EXIT + " FOR EXIT");
        System.out.println("Please input " + ADD_BOOK + " FOR ADD BOOK");
        System.out.println("Please input " + PRINT_ALL_BOOKS + " FOR PRINT ALL BOOKS");
        System.out.println("Please input " + SEARCH_BOOK_BY_TITLE + " FOR SEARCH BOOK BY TITLE");
        System.out.println("Please input " + PRINT_EXPENSIVE_BOOK + " FOR PRINT EXPENSIVE BOOK");
        System.out.println("Please input " + DELETE_BOOK_ID + " DELETE ANY OF YOUR BOOKS");
        System.out.println("Please input " + SEARCH_PRICE_RANGE + " SEARCH PRICE RANGE");


    }
}
