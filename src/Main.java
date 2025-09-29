//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create Library & Librarian
        Library library = new Library();
        Librarian librarian = new Librarian();

        // Add books to library
        librarian.addBook(library, "Harry Potter and the Philosopher's Stone", "J. K. Rowling", "12345678");
        librarian.addBook(library, "The Hobbit", "J. R. R. Tolkien", "22334455");
        librarian.addBook(library, "1984", "George Orwell", "33445566");
        librarian.addBook(library, "Pride and Prejudice", "Jane Austen", "44556677");
        librarian.addBook(library, "The Great Gatsby", "F. Scott Fitzgerald", "55667788");
        librarian.addBook(library, "To Kill a Mockingbird", "Harper Lee", "66778899");
        librarian.addBook(library, "The Catcher in the Rye", "J. D. Salinger", "77889900");
        librarian.addBook(library, "Moby Dick", "Herman Melville", "88990011");
        librarian.addBook(library, "War and Peace", "Leo Tolstoy", "99001122");
        librarian.addBook(library, "The Alchemist", "Paulo Coelho", "11122233");

        // Display all books in the Library
        librarian.printAll(library);
        librarian.printAllDetails(library);

        // Adding Student and Teacher
        Person student = new Student("Prasad", "Tak","205224016");
        Person teacher = new Teacher("Narendra","Modi","00000000");

        // Checking availability
        student.checkBooks(librarian,library);

        //Student Issue Books
        student.issueBook("Pride and Prejudice",library,librarian);
        student.issueBook("Harry Potter",library,librarian);
        student.issueBook("Moby Dick",library,librarian);
        student.issueBook("To Kill a Mockingbird",library,librarian);

        //Teacher Issue Books
        teacher.issueBook("Pride and Prejudice",library,librarian);
        teacher.issueBook("Harry Potter",library,librarian);
        teacher.issueBook("The Great Gatsby",library,librarian);
        teacher.issueBook("The Catcher in the Rye",library,librarian);
        teacher.issueBook("Harry Potter and the Philosopher's Stone",library,librarian);
        teacher.issueBook("The Hobbit",library,librarian);
        teacher.issueBook("1984",library,librarian);
        teacher.issueBook("The Alchemist",library,librarian);

        //Printing Student Details
        student.getDetails();

        //Printing Teacher Details
        teacher.getDetails();

        //Returning the books
        student.returnBook("Pride and Prejudice",library,librarian);
        student.returnBook("Moby Dick",library,librarian);

        teacher.returnBook("The Great Gatsby",library,librarian);
        teacher.returnBook("The Hobbit",library,librarian);

        //Reissuing other books
        student.issueBook("The Great Gatsby",library,librarian);
        student.issueBook("To Kill a Mockingbird",library,librarian);

        teacher.issueBook("Pride and Prejudice",library,librarian);
        teacher.issueBook("The Alchemist",library,librarian);

        //Printing Student Details
        student.getDetails();

        //Printing Teacher Details
        teacher.getDetails();

        //Printing book details
        librarian.printAllDetails(library);
    }
}