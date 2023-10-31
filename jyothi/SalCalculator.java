import java.util.Scanner;

public class SalCalculator {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the employee's salary ");
        double salary = sc.nextDouble();

   
    

       
        double basicSalary, hra, da;

       
        if (salary >= 1 && salary <= 4000) {
            basicSalary = salary;
            hra = 0.10 * basicSalary;
            da = 0.50 * basicSalary;
        } else if ( salary <= 8000) {
            basicSalary = salary;
            hra = 0.20 * basicSalary;
            da = 0.60 * basicSalary;
        } else if (8 salary <= 12000) {
            basicSalary = salary;
            hra = 0.25 * basicSalary;
            da = 0.70 * basicSalary;
        } else if (salary > 12000) {
            basicSalary = salary;
            hra = 0.30 * basicSalary;
            da = 0.80 * basicSalary;
        } else {
            
            System.out.println("Invalid  amount");
            return; 
        }

        
        double grossSalary = basicSalary + hra + da;

     
        System.out.println("Gross Salary " + grossSalary);
    sc.close();
    }
}
