import java.util.Scanner;

class Book {
    private int bookNo;
    private String title;
    private String author;
    private float price;

    
    public Book(int bookNo, String title, String author, float price) {
        if (title.length() < 4) {
            throw new IllegalArgumentException("Title must have at least 4 characters.");
        }
        if (price < 1.0f || price > 5000.0f) {
            throw new IllegalArgumentException("Price must be in the range 1 to 5000.");
        }

        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.price = price;
    }

   


    public String toString() {
        return "Book Number: " + bookNo +
               "\nTitle: " + title +
               "\nAuthor: " + author +
               "\nPrice: " + price;
    }
}



    


    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

  
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class  BookDetails{
    public static void main(String[] args) {
        Book info = new Book(475, "Programming Java", "klm", 200.0f);
        
       int bNo= info.getBookNo();
       System.out.println(bNo);
       
       String t=info.getTitle();
       System.out.println(t);
    
       String a=info.getAuthor();
       System.out.println(a);
      
       float p=info.getPrice();
       System.out.println(p);
       
        
    }
}
