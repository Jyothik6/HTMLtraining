import java.util.Scanner;
public class ArrayList{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		int sum=0;
		float avg=0;
		int [] a= new int[10];
		int n=a.length;
	    	int max,min,secondMax;
		for (int i = 0; i <n; i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		avg=(float)sum/n;
		max =min=secondMax=a[0];
		for(int i =1;i<n;i++){
		    if(a[i]>max){
		        secondMax=max;
			max=a[i];
			}
		   else if(a[i]<min){
			min=a[i];
			}
		   else if(a[i]>secondMax && a[i]<max){
			    secondMax=a[i];
			}
		}
		System.out.println("sum of array of 10 numbers is "+ sum);
		System.out.println("avg of array of 10 numbers is "+avg);
		System.out.println("Larget number in array is "+max);
		System.out.println("smallest number in array is "+min);
		System.out.println("Second largest number is : " +secondMax);
	}
}