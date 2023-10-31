package com.sample;

import java.util.ArrayList;
import java.util.List;

public class Sum{
    public static void main(String[] args) {
    	List<Integer> myList=new ArrayList<Integer>();
    
		myList.add(1);
    	myList.add(2);
    	myList.add(3);
    	myList.add(4);
    	int sum=  myList.stream().filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    	System.out.println(sum);
    	int sum1 =myList.stream().filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    	System.out.println(sum1);
    }
  
}

