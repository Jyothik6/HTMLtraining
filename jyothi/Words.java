import java.util.Scanner;

 

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        String[] s = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
        };

        System.out.print("Enter a positive integer ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Zero");
            return;
        }

        String result = "";

 

        while (n > 0) {
            int digit = n % 10;
            result = s[digit] + " " + result;
            n /= 10;
        }

 

        System.out.println(result);

 

        sc.close();
    }
}