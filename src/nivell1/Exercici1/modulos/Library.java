package nivell1.Exercici1.modulos;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
Scanner teclado = new Scanner(System.in);

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(){

        System.out.println("Enter the title");
        String title = teclado.nextLine();

        System.out.println("Enter the author");
        String author = teclado.nextLine();

        System.out.println("Enter the year of publication");
        int publicationYear = teclado.nextInt();
        teclado.nextLine();

        Book book = new Book(title, author, publicationYear);
        books.add(book);
    }

    public void getBooks(){

        for(int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
    }

    public void getBookByIndex(){

        System.out.println("Enter the index of the book to add");
        int index = teclado.nextInt();

        if(index < 0 || index > books.size() -1){
            System.out.println("Invalid index number error");
        }else {
            System.out.println(books.get(index));
        }
    }

    public void addBookAtIndex(){

        System.out.println("Enter the index of the book to add");
        int index = teclado.nextInt();

        if(index < 0 || index > books.size()){
            System.out.println("Invalid index number error");
        }else {
            System.out.println("Enter the title");
            String title = teclado.nextLine();

            System.out.println("Enter the author");
            String author = teclado.nextLine();

            System.out.println("Enter the year of publication");
            int publicationYear = teclado.nextInt();
            teclado.nextLine();

            Book book = new Book(title, author, publicationYear);
            books.add(index, book);
        }
    }

    public void removeBookByTitle(String title){

        System.out.println("Enter the title of the book to remove");
        title = teclado.nextLine();

        for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            if(book.getTittle().equalsIgnoreCase(title)){
                books.remove(i);
                break;
            }
        }
        System.out.println("Sorry the book " +title+ " is not in the list");
    }
}
