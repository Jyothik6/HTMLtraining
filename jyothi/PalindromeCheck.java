import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a 4-digit number ");
        int n = sc.nextInt();
        
        if (n < 1000 || n > 9999) {
            System.out.println("Please enter a valid 4-digit number");
            return;
        }
        
        int orgNumber = n;
        int revNumber = 0;
        
        while (n != 0) {
            int digit = n % 10;
            revNumber = revNumber * 10 + digit;
            n /= 10;
        }
        
        if (orgNumber == revNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        
        sc.close();
    }
}
