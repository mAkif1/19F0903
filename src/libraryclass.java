
import java.util.ArrayList;
   import java.util.List;

   public class libraryclass {
       private List<String> books = new ArrayList<>();

       public void addBook(String bookName) {
           books.add(bookName);
           System.out.println(bookName + " added to libraryclass.");
       }

       public void listBooks() {
           System.out.println("Books in libraryclass: " + books);
       }  
       public boolean searchBook(String bookName) {
           return books.contains(bookName);
       }

   }

