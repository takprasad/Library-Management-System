import java.util.Map;

public class Librarian
{
    // Add book to library
    public void addBook(Library library){
        library.addBook();
    }

    // Modified add books
    public void addBook(Library library, String title, String author, String isbn){
        library.addBook(title,author,isbn);
    }

    // Issue book from library
    public boolean issueBookFromLibrary(String title, Library library ){
        Book currBook = library.getBook(title);
        if(!currBook.checkAvailability()) {
            System.out.println("The book is not available");
            return false;
        }
        else{
            currBook.setAvailability();

            return true;
        }
    }

    // Return book
    public void takeReturns(String title, Library library){
        Book currBook = library.getBook(title);
        currBook.resetAvailability();
    }

    // Get book details
    public void getDetails(String title, Library library){
        Book currBook = library.getBook(title);
        currBook.getBookDetails();
    }

    //Check availability of a book
    public boolean checkAvailability(String title,Library library){
        return library.checkAvailability(title);
    }

    //Print all books
    public void printAll(Library library){
        library.printAll();
    }

    //Print complete details
    public void printAllDetails(Library library){
        library.printALLDetails();
    }
}
