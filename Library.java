package Javaweek2;

public class Library {

    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }
    
    public void issueBook() {
        System.out.println("Book issued successfully");
	}

    

    public static void main(String[] args) {
  
        Library library = new Library();
        
   
        String book = library.addBook("Java Program");
        library.issueBook();
        
     
        System.out.println("The book '" + book + "' was added.");
    }
}

