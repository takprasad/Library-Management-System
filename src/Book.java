import java.sql.SQLOutput;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isAvailable;
    private int noIssues;

    //Book Constructor
    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.noIssues = 0;
    }

    //Checks availability of the book
    public boolean checkAvailability(){
        return isAvailable;
    }
    //Resets book to available
    public void resetAvailability(){
        this.isAvailable = true;
    }
    //Sets book as issued and increment the number of issues
    public void setAvailability(){
        this.isAvailable = false;
        this.noIssues +=1;
    }
    //Gets book details
    public void getBookDetails(){
        System.out.println("Book Title: "+ title);
        System.out.println("Book Author: "+ author);
        System.out.println("ISBN: "+isbn);
        System.out.println("Number of Issues: "+ noIssues);
        if(isAvailable) System.out.println("Currently Available");
        else System.out.println("Currently Unavailable");
    }
}
