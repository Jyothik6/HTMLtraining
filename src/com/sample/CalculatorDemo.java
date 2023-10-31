package com.sample;
import com.demo.Calculator;
class ScientificCalculator extends Calculator{
	public int processData(int x ,int y ) {
		return multiply(x,y);
	}
}
public class CalculatorDemo{
	
public static void main(String args[]){
	Calculator c=new Calculator();
	System.out.println(c.add(7,8));
	System.out.println((new ScientificCalculator()).processData(3, 5));
}
 {

}
