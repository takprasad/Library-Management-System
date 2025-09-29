public class Teacher extends Person {

    //Teacher constructor
    public Teacher(String firstName, String lastName, String regNumber) {
        super(firstName, lastName, regNumber);
    }

    //Modifying issue books for Teacher
    @Override
    public void issueBook(String title, Library library, Librarian librarian){
        if(booksIssued.size()==5) System.out.println("You can only issue at max 5 books as a Teacher\n");
        else super.issueBook(title,library,librarian);
    }

    //Modifying get details for Teacher
    @Override
    public void getDetails(){
        System.out.println("Designation: Teacher");
        super.getDetails();
    }
}

