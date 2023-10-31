import java.util.Scanner;

class Employee {
    private int age;
    private String name;
    private double basic;
    private double hra;
    private double da;
    private double specialAllowance;

    
    public Employee( int age, String name,double basic, double hra, double da, double specialAllowance) {
        this.age = age;        
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.specialAllowance = specialAllowance;
    }

    
    public Employee( int age,String name, double basic, double hra, double da) {
        this( age, name,basic, hra, da, 0);
    }


    public double calculateSalary() {
        return basic + hra + da + specialAllowance;
    }

    
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "'s information deleted.");
        super.finalize();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter employee details for employee " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Basic Salary: ");
            double basic = scanner.nextDouble();
            System.out.print("HRA: ");
            double hra = scanner.nextDouble();
            System.out.print("DA: ");
            double da = scanner.nextDouble();
            System.out.print("Special Allowance: ");
            double specialAllowance = scanner.nextDouble();
            scanner.nextLine();  

            if (specialAllowance == 0) {
                employees[i] = new Employee( age,name, basic, hra, da);
            } else {
                employees[i] = new Employee(age,name, basic, hra, da, specialAllowance);
            }
        }

        System.out.println("\nEmployee Salaries:");
        for (int i = 0; i < 5; i++) {
            System.out.println(employees[i].calculateSalary());
        }

       
        for (int i = 0; i < 5; i++) {
            employees[i] = null;
        }
    }
}
