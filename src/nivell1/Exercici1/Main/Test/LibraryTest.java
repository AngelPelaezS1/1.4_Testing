package nivell1.Exercici1.Main.Test;

import nivell1.Exercici1.Main.Book;
import nivell1.Exercici1.Main.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library(new ArrayList<Book>());
    }

    @Test
    public void testLibraryNotNullAfterCreation() {
        assertNotNull(library, "The library should not be null after being created.");
    }

    @Test
    public void testAddBookIncreasesListSize() {
        library.addBook("Book 1", "Author 1", 2020);
        assertEquals(1, library.getBooks().size(), "The book list size should be 1 after adding a book.");
    }

    @Test
    public void testRetrieveBookByIndex() {
        library.addBook("Book 1", "Author 1", 2020);
        String expectedBook = library.getBooks().get(0).toString();
        assertEquals(expectedBook, library.getBooks().get(0).toString(), "The book at the specified index does not match.");
    }

    @Test
    public void testAddBookAtIndex() {
        library.addBook("Book 1", "Author 1", 2020);
        library.addBookAtIndex(0, "Book 2", "Author 2", 2021);
        assertEquals(2, library.getBooks().size(), "The book list size should be 2 after adding at a specific index.");
        assertEquals("Book 2", library.getBooks().get(0).getTittle(), "The book at index 0 should match the added book.");
    }

    @Test
    public void testRemoveBookByTitleDecreasesListSize() {
        library.addBook("Book to Remove", "Author 1", 2020);
        library.removeBookByTitle("Book to Remove");
        assertEquals(0, library.getBooks().size(), "The book list size should be 0 after removing the book.");
    }


    @Test
    public void testAddMultipleBooks() {
        library.addBook("Book A", "Author 1", 2020);
        library.addBook("Book B", "Author 2", 2021);
        library.addBook("Book C", "Author 3", 2022);
        assertEquals(3, library.getBooks().size(), "The book list size should be 3 after adding multiple books.");
    }

    @Test
    public void testNoDuplicateTitles() {
        library.addBook("Duplicate Book", "Author 1", 2020);
        library.addBook("Duplicate Book", "Author 2", 2021);
        assertEquals(1, library.getBooks().size(), "Duplicate titles should not be allowed in the book list.");
    }

    @Test
    public void testBookListIsAlphabetical() {
        library.addBook("Z Book", "Author 1", 2020);
        library.addBook("A Book", "Author 2", 2021);
        library.addBook("M Book", "Author 3", 2022);

        Collection<Object> sortedBooks = library.getBooks();
        assertEquals("A Book", sortedBooks.get(0).getTittle(), "The first book should be A Book.");
        assertEquals("M Book", sortedBooks.get(1).getTittle(), "The second book should be M Book.");
        assertEquals("Z Book", sortedBooks.get(2).getTittle(), "The third book should be Z Book.");
    }

}
