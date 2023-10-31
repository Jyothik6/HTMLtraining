package sample;
class Box {
	private int size;
	public Box() {
		size=0;
	}
	public Box(int size) {
		this.size=size;
		
	}
	
	}
public String toString()
{
	return "size of box"+ size;
			}

public boolean equals (Box b) {
	if(this.size==b.size) return true;
	return false;
}
public int hashCode() {
	return this.size;
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Box b1=new Box();
Box b2=new Box(5);
System.out.println("Box1 "+b1.toString());
System.out.println("Box2 "+b2.toString());
	if() {
		
	}
	}

}
