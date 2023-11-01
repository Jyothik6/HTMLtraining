import java.util.Scanner;  
public class SumOfDigits   
{  
public static void main(String args[])  
{  
int num, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number ");  
num = sc.nextInt();  
while(num > 0)  {
 digit = num % 10;  
sum = sum + digit;  
num = num / 10;  
}  

System.out.println("Sum of Digits "+sum);  
}  
}  