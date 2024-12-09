package nivell1.Exercici1.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Comparator;

public class Library {
    Scanner teclado = new Scanner(System.in);

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String title, String author, int publicationYear) {
        for (Book book : books) {
            if (book.getTittle().equalsIgnoreCase(title)) {
                System.out.println("Duplicate title. Book not added.");
                return;
            }
        }
        books.add(new Book(title, author, publicationYear));

        books.sort(Comparator.comparing(Book::getTittle, String.CASE_INSENSITIVE_ORDER));
    }

    public void getBookByIndex() {

        System.out.println("Enter the index of the book to add");
        int index = teclado.nextInt();

        if (index < 0 || index > books.size() - 1) {
            System.out.println("Invalid index number error");
        } else {
            System.out.println(books.get(index));
        }
    }

    public void addBookAtIndex(int index, String title, String author, int publicationYear) {
        if (index < 0 || index > books.size()) {
            throw new IllegalArgumentException("Invalid index number");
        }
        books.add(index, new Book(title, author, publicationYear));
    }


    public void removeBookByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTittle().equalsIgnoreCase(title)) {
                books.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sorry, the book '" + title + "' is not in the list.");
        }
    }


    public Collection<Object> getBooks() {
        return null;
    }
}
