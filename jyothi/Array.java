import java.util.Scanner;
public class Array{
public static void main(String args[]){
Scanner sc =new Scanner(System.in);
int sum=0;
float avg=0;
int [] a= new int[10];
int n=a.length;
for (int i = 0; i <n; i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=(float)sum/n;
System.out.println("sum of array of 10 numbers is "+ sum);
		System.out.println("avg of array of 10 numbers is "+avg);
}

}
