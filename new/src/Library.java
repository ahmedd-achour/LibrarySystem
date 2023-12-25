import java.util.Scanner;
public class Library implements BookMethods {
    Book[] books;
    private int idOfActiveBook=0;
    Library(Book[] books){
        this.books=books;
   }
   public void addBook(Book book){
      for( int i=0;i<books.length;i++){
          if(books[i] == null){
              books[i]= book;
              break;
          }
      }
   }
   public void openBook(Book book){
        if(idOfActiveBook==0){
            idOfActiveBook=book.id;
            System.out.println("book opened !");
            System.out.println("the id of the active book is now "+idOfActiveBook);
        }
        else {
            System.out.println("you need to close the previous book to open new one ");
        }
   }
   public void closeBook(Book book){
        if(book.id==idOfActiveBook){
            idOfActiveBook=0;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.println("please enter the last page you read !");
                book.last_viewed_page =scanner.nextInt();
            }while(book.last_viewed_page> book.pages);

            System.out.println("book is now closed");


        }
        else{
            System.out.println("book is already closed !");
        }
   }
    public void showBooks(){
        for (Book book : books) {
            if (book != null) {
                book.detailOfBook();
            }
        }
   }

    public static void main(String[] args){
        String contentOfBook1="there is no such a thing like a book whether it is likely supported or not supported it will be just fine ";
        String contentOfBook2="this is the content of the second book hoê you all love it ! ";
        String contentOfBook3="this book is the lasted book i made its likely a work that you will appreciate !";
        String contentOfBook4="i already new that you are not making another step to this place because its boring well its not its just " +
                "a mindset tat you are not willing to have in your life ;)";
        //Book cons class variables ordered as follows int id ,String title ,int pages ,String content ,int last_viewed_page
        Book book1= new Book(1000,"UglyLove",77,contentOfBook1,0);
        Book book2= new Book(1001,"LoveAgain",121,contentOfBook2,0);
        Book book3= new Book(1002,"BothOfUS",120,contentOfBook3,0);
        Book book4= new Book(1003,"WeAreHere",127,contentOfBook4,0);
        Book[] books1= new Book[100];
        Library objOfLib = new Library(books1);
        objOfLib.addBook(book1);
        objOfLib.addBook(book2);
        objOfLib.addBook(book3);
        objOfLib.addBook(book4);
        objOfLib.openBook(book1);
        objOfLib.openBook(book2);
        objOfLib.closeBook(book1);
        objOfLib.openBook(book2);
        objOfLib.closeBook(book1);
        objOfLib.closeBook(book2);
        objOfLib.openBook(book3);
        objOfLib.closeBook(book3);
        objOfLib.openBook(book4);
        objOfLib.closeBook(book4);
        objOfLib.showBooks();
    }
}
