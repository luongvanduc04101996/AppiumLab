package Lab7;

import java.util.*;

public class Lab7 {
    public static void main(String[] args) {
        System.out.println("-----------------MENU------------------");
        System.out.println("1. Input book\n" + "2. Find book by ISBN\n" + "3. Exit");
        Scanner scanner = new Scanner(System.in);
        Set<Book> listBook = new HashSet<>();
        int yourOption;
        do {
            System.out.print("Please choose your option: ");
            yourOption = scanner.nextInt();
            switch (yourOption) {
                case 1:
                    System.out.print("Input ISBN: ");
                    scanner.nextLine();
                    String ISBN = scanner.nextLine();
                    System.out.print("Input title: ");
                    String title = scanner.nextLine();
                    System.out.print("Input authorName: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Input year: ");
                    String year = scanner.nextLine();
                    listBook.add(inputBook(ISBN, title, authorName, year));
                    System.out.println("Input successful!!!");
                    break;
                case 2:
                    System.out.print("Input ISBN: ");
                    scanner.nextLine();
                    ISBN = scanner.nextLine();
                    System.out.println(findBookByISBN(listBook, ISBN));
                    break;
                case 3:
                    System.out.print("Goodbye!");
                    break;
                default:
                    System.out.println("Please enter the correct the type input!!!!");
                    break;
            }
        } while (yourOption != 3);
    }

    private static Book inputBook(String ISBN, String title, String authorName, String year) {
        return new Book(ISBN, title, authorName, year);
    }

    private static Book findBookByISBN(Set<Book> listBook, String ISBN) {
        Book bookFined = new Book();
        for (Book book : listBook) {
            if (book.getISBN().equals(ISBN)) {
                bookFined = book;
            }
        }
        if (bookFined.getISBN() == null)
        {
            System.out.println("The ISBN is not found!\nPlease choose option 1 to add book before");
            return bookFined;
        }
        return bookFined;
    }
}
