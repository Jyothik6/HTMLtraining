package sample;

class Circle extends Shape implements Printable{
	
	public Circle() {
		//super("Blue");
		System.out.println("Circle Created");
	}
	public Circle(String color) {
		super(color);
		System.out.println("Circle created with Color");
	}
	public void draw() {
		System.out.println("Drawing a Circle");
	}
	
	public double area(int radius) {
		return 3.14*radius*radius;
	}
	public void print() {
		System.out.println("circle print");
	}
}

class Rectangle extends Shape implements Printable{
	public Rectangle() {
		System.out.println("Rectangle Created");
	}
	@Override
	public void draw() {
		
		System.out.println("Drawing a Rectangle"); 
	}
	public int area(int length,int breadth) {
		return length*breadth;
	}
	public void print() {
		System.out.println("rectangle print");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Printable[] shapes=new Printable[5];
		 shapes[0]=new Circle();
		 shapes[1]=new Rectangle();
		
	for(Printable s:shapes) {
		
	
		s.print();
	}
	}

}
