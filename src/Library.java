import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library
{
    private final Map<String,Book>books = new HashMap<>();

    //Function to add books
    public void addBook(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Book:");
        String title = scan.nextLine();
        System.out.println("Enter the name of the Author:");
        String author = scan.nextLine();
        System.out.println("Enter the ISBN number:");
        String isbn = scan.nextLine();
        Book newBook = new Book(title,author,isbn);
        books.put(title,newBook);
    }

    //Modified add books for quicker execution
    public void addBook(String title, String author, String isbn){
        Book newBook = new Book(title,author,isbn);
        books.put(title,newBook);
    }



    //Function to print all the books
    public void printAll(){
        System.out.println("The library currently contains the following books: ");
        for(String key: books.keySet()){
            System.out.println(key);

        }
        System.out.println();
    }

    public void printALLDetails(){
        System.out.println("The library currently contains the following books: ");
        for(String key: books.keySet()){
            Book currBook = books.get(key);
            currBook.getBookDetails();
            System.out.println();
        }
    }

    //Returns book by title
    public Book getBook(String title){
        return books.get(title);
    }

    //checks availability of a book
    public boolean checkAvailability(String title){
        return books.containsKey(title);
    }
}
