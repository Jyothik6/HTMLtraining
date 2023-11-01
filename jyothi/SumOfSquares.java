import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        System.out.print("Enter the value of n ");
        int n = sc.nextInt();

    
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }

       
        System.out.println("The sum of squares of the first " + n + " natural numbers is " + sumOfSquares);

     
        sc.close();
    }
}
