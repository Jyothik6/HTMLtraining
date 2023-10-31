class Pen{
private String color;
private int size;
public void setColor(String color){
this.color=color;
}

public String getColor(){
return color;
}

public void writeText(String msg) {
System.out.println(msg+ "is written in"+color);
}

public int add(int a, int b){
return a+b;
}
public int add (int a, int b,int c){
return a+b+c;
}
}

public class Sample{
public static void main(String args[]){
pen.redPen=new Pen();
redPen.setColor("red");
redPen.writeText("hello");
}
}
