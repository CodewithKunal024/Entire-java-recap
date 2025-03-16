public class Bookrevise {
    String title;
    String author;
    String bookno;

    static int totalNofBooks;
    Boolean isborrowed=false;
    static {
        totalNofBooks=0;
    }
    {
        totalNofBooks++;
    }
    Bookrevise(String title, String author, String bookno) {
        this.title = title;
            this.author = author;
            this.bookno = bookno;
    }
    Bookrevise(String bookno){
        this("Unknown","unknown",bookno);
    }
     static int getTotalBooks(){
        return totalNofBooks;
    }
    void BorrowBook(){
      if(isborrowed){
          System.out.println("Book is already borrowed!");
      }
      else
          isborrowed=true;
      totalNofBooks--;
      System.out.println("Borowing the book"+title);
    }
    void ReturnBook(){
if(isborrowed) {
    isborrowed = false;
    System.out.println("Returning the book" + title);
    totalNofBooks++;
}else {
    System.out.println("Book is not borrowed!");
}
}
public static void main(String[] args) {
        Bookrevise book1 = new Bookrevise("Harry Potter", "JK ROWLING","1234");
        Bookrevise book2=new Bookrevise(null,null,"1214");
System.out.println(getTotalBooks());
book1.BorrowBook();
book2.BorrowBook();
book1.ReturnBook();
System.out.println(getTotalBooks());
book2.ReturnBook();
System.out.println(getTotalBooks());
    }
}
