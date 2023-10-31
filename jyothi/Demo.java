 class Pen{
	private String color;
	private int siza;
	public void setColor(String color){
		this.color=color;

	}
	public String getColor(){
		return color;
	}
	public void writeText(String msg){
		System.out.println(msg);
	}
	public int add(int a, int b){
		return a+b;
	}
	public int add(int a, int b, int c){
		return a+b+c;
	}

 

 

}

 

public class Demo{
	public static void main(String arg[]){
	Pen redPen = new Pen();
	redPen.setColor("RED");
	redPen.getColor();
	//redPen.color="blue";
	redPen.writeText("Hello word");


 

	}
}

 