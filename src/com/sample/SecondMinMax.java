package com.sample;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.IntStream;

import java.util.stream.Stream;

 

public class SecondMinMax {

 

	public static void main(String[] args) {

	
		List<Integer> myList=new ArrayList<Integer>();
	    
		myList.add(1);
    	myList.add(2);
    	myList.add(3);
    	myList.add(4);
    	
    	int min=  myList.stream().sorted()
                .skip(1) 
                .findFirst()
                .orElse(null);
    	System.out.println(min);
    	
    	int max=  myList.stream().sorted((a, b) -> Integer.compare(b, a))
                .skip(1) 
                .findFirst()
                .orElse(null);
    	System.out.println(max);
    	
    	
    	
	}
}