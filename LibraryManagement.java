package Javaweek2;

public class LibraryManagement {

    public static void main(String[] args) {
        
        Library library = new Library();
        
  
        String book = library.addBook("Selenium Basics");
        library.issueBook();
        
    
        System.out.println("The book '" + book + "' was added and issued.");
    }
}