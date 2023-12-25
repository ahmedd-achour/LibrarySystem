public class Book {
    public int id;
    public String title;
    public int pages;
    public String content;
    public int last_viewed_page;
    Book(int id,String title,int pages,String content,int last_viewed_page){
        this.content=content;
        this.id=id;
        this.pages=pages;
        this.title=title;
        this.last_viewed_page=last_viewed_page;
    }
    void detailOfBook(){
        System.out.println("this book is the book "+this.id+" titled "+this.title+" contains "+this.pages+" pages and the last viewed page is "+this.last_viewed_page
        );
    }


}
