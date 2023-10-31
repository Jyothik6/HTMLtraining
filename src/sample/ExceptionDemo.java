package sample;

public class ExceptionDemo {
public static void main(String args[]){
	int a,b,c=0;
	try {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		c=a/b;
	}
catch(ArrayIndexOutOfBoundsException ex) {
	System.out.println("array element not found");
}
catch(ArithmeticException ex) {
	System.out.println("argument is 0");
	
	
}	
catch(Exception ex) {
	System.out.println(ex.getMessage());	
}
	System.out.println("process completed ");
try {
	Thread.sleep(2000);
	
}
catch(InterruptedException e) {
	e.printStackTrace();
}
	
}
}

