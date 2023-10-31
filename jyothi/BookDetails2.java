




class Book {

		private int bookNo;

		private String title;

		private String author;

		private float price ;

		private static int bookCount=0;


		public void setBookNo(int bookNo){

			this.bookNo=bookNo;

		}

		public int getBookNo(){

			return bookNo;

		}

		public void setTitle(String title){

			this.title=title;

		}

		public String getTitle(){

			return title;

		}

		public void setAuthor(String author){

			this.author=author;

		}

		public String getAuthor(){

			return author;

		}

		public void setPrice(float price){

			this.price=price;

		}

		public float getPrice(){

			return price;

		}

		Book(){

			title="";

			price=0.0f;

			bookCount++;}

		Book(int bookNo, String title,String author, float price){

			this.bookNo=bookNo;

			this.title=title;

			this.author=author;

			this.price=price;

			if(title.length()<4){

				System.out.println("Title of the book must have atleast 4 characters ");

			}

			if(price < 1 || price >5000){

				System.out.println("price must be in range of 1 to 5000");}

			this.title ="";

			this.price=0.0f;

			bookCount++;

		}

		@Override

		public String toString(){

			return " BookNo "+bookNo+" Title "+title+ " Author "+author+ "Price" + price;}

 

		public static int getBookCount(){

			return bookCount;

			}





}

public class BookDetails2{

	public static void main(String args[]){

		Book obj = new Book();

		Book obj1= new Book(123," Harry Potter "," J.K. Rowling " ,234.5f);

		System.out.println(obj1);

		obj.setBookNo(11);

		int bno=obj.getBookNo();

		System.out.println(bno);

		obj.setTitle("Advance JAVA");

		String titleName= obj.getTitle();

		System.out.println(titleName);

		obj.setAuthor("Bhargav");

		String AuthorName= obj.getAuthor();

		System.out.println(AuthorName);

		obj.setPrice(500.12f);

		float price = obj.getPrice();

		System.out.println(price);

		System.out.println("number of books : "+ Book.getBookCount());



 

			

}

}


 