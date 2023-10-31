package com.sample;

import java.util.ArrayList;

import java.util.List;

import java.util.Map;

import java.util.stream.Collectors;

import java.util.stream.IntStream;

import java.util.stream.Stream;

 

public class ConvertList {

 

	public static void main(String[] args) {
		List<String> strings=new ArrayList<String>();

		strings.add("hello");

		strings.add("welcome");

		strings.add("world");

		strings.add("hi");

		List list= strings.stream().map(e->e.toUpperCase())

		.sorted().toList();

		//.findFirst().get();

		System.out.println(list);

	}

 

}
	