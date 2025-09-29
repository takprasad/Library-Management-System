import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String regNumber;
    protected final Set<String> booksIssued = new HashSet<>();

    //Constructor to initialize person
    public Person(String firstName,String lastName, String regNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.regNumber=regNumber;
    }

    //Issues book of title
    public void issueBook(String title, Library library, Librarian librarian){
        System.out.println("Issuing "+title);
        if(!librarian.checkAvailability(title,library)) System.out.println("The book is not Available\n");
        else{
            if(librarian.issueBookFromLibrary(title,library)) {
                booksIssued.add(title);
                System.out.println("Successfully Issued");
            }

            System.out.println();

        }

    }
    //Returns issued book
   public void returnBook(String title, Library library, Librarian librarian){
        librarian.takeReturns(title,library);
        booksIssued.remove(title);
       System.out.println("Successfully returned: "+title);
       System.out.println();
    }

    //Checks all available books in the library
    public void checkBooks(Librarian librarian, Library library){
        librarian.printAll(library);
    }

    //Display person details
    public void getDetails(){
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Registration Number: "+regNumber);
        System.out.println("Books Issued: ");
        for(String title:booksIssued){
            System.out.println(title);
        }
        System.out.println();
    }
}
