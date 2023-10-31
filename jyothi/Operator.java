

public class Operator{

	public static void main(String arg[]){

		int num1 = Integer.parseInt(arg[0]);
            String p = arg[1];
            int num2 = Integer.parseInt(arg[2]);
           

		switch(p){

		case("+"):

			System.out.println("(num1+num2) "+(num1+num2));

		case("-"):

			System.out.println("(num1-num2) "+(num1-num2));

		case("/"): 

			System.out.println("(num1/num2) "+(num1/num2));

		case("*"):

			System.out.println("(num1*num2) "+(num1*num2));

		default:

			System.out.println("only + ,- ,/ ,* accept");

			}

 

	}

}