import java.util.Scanner;
public class BooK {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;

    boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }
    {
        totalNoOfBooks++;
    }
    BooK(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    BooK(String isbn){
        this(isbn,"unknown","unknown");
    }
static int getTotalNoOfBooks(){
        return totalNoOfBooks;
}
void borrowBook(){
    if(isBorrowed){
        System.out.println("The book is already borrowed");
    }else{
        this.isBorrowed=true;
        System.out.println("Enjoy the book"+this.title);
    }
}

void returnBook(){
      if(isBorrowed){
          this.isBorrowed=false;
          System.out.println("Hope you enjoyed the book");
      }else{
          System.out.println("The book is not borrowed");
      }

    }

    public static void main(String[] args) {
        BooK designOfThings = new BooK("1","Design","me");
        BooK designOfBooks = new BooK("2");
    System.out.println(getTotalNoOfBooks());
    designOfThings.borrowBook();
    designOfBooks.borrowBook();
    designOfBooks.borrowBook();
    designOfThings.borrowBook();
    designOfBooks.returnBook();
    designOfBooks.returnBook();
    }
}

