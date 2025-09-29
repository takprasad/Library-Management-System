public class Student extends Person{
    //Student constructor
    public Student(String firstName, String lastName, String regNumber) {
        super(firstName, lastName, regNumber);
    }

    //Modifying issueBook for Student
    @Override
    public void issueBook(String title, Library library, Librarian librarian){
        if(booksIssued.size()==2) System.out.println("You can only issue at max 2 books as a Student\n");
        else super.issueBook(title,library,librarian);
    }

    //Modifying getDetails for Student
    @Override
    public void getDetails(){
        System.out.println("Designation: Student");
        super.getDetails();
    }
}
