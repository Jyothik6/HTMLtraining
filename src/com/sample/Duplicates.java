package com.sample;

import java.util.ArrayList;

import java.util.List;



import java.util.stream.IntStream;

import java.util.stream.Stream;

 

public class Duplicates {

 

	public static void main(String[] args) {

	

		int nums[]= {9,4,6,5,7,4};
		
		
		  IntStream.of(nums).distinct().forEach(i->System.out.println(i));;
	}
}