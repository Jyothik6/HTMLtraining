import java.util.Scanner;
public class SumNo {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);  
    
int sum=0;
    
for(;;){
 int number =sc.nextInt();
                if (number == -999) {
                    break;
                }
 		sum += number;
            }
 System.out.println("Sum of numbers: " + sum);
    }
}