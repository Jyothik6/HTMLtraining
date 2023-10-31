package sample;
import java.util.Scanner;
public class Frequency{
	public static void main(String agr[]){
		Scanner sc= new Scanner(System.in);
		int  arr[] = new int[10];
		int freq[]= new int[12];
		for(int i=0; i<10;i++){

 

			arr[i] =sc.nextInt();
			if(arr[i]>0 && arr[i]<10){
				freq[0]++;
			}
			if(arr[i]>=10 &&  arr[i]<20){
				freq[1]++;}
			else if(arr[i]>=20 && arr[i]<30){
				freq[2]++;}
			else if(arr[i]>=30 && arr[i]<40){
				freq[3]++;}
			else if(arr[i]>=40 && arr[i]<50){
				freq[4]++;}
			else if(arr[i]>=50 && arr[i]<60){
				freq[5]++;}
			else if(arr[i]>=70 && arr[i]<80){
				freq[6]++;}
			else if(arr[i]>=80 && arr[i]<90){
				freq[7]++;}
			else if(arr[i]>=90 && arr[i]<100){
				freq[8]++;}
			else{
				freq[9]++;}	
		}


		for(int i =0; i<10;i++){
			System.out.println( i * 10 + "-" + (i*10+9) +"\t\t"+ freq[i]);
		}

}
}
