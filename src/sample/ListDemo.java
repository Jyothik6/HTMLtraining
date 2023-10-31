package sample;

import java.util.Date;

import java.util.Iterator;

import java.util.ArrayList;

import java.util.List;

 

public class ListDemo {

 

	public static void main(String[] args) {

		List myList=new ArrayList();

		myList.add(5);

		myList.add("New");
		myList.add("Array");

		myList.add(new Date());

		System.out.println(myList);

		myList.add(3, "Added");//add and expand the list

		System.out.println(myList);

		System.out.println(myList.indexOf("Added"));//gives index no

		System.out.println(myList.contains("Array"));//checking and gives true or false

//		myList.remove(2);

		System.out.println(myList);

		myList.set(1, "New Element" );//replace

		System.out.println(myList);

		//Iterate with loop

		System.out.println("Print with loop");

		for(Object i:myList)

			System.out.println(i);//or

		System.out.println("Print with Iterator");

		Iterator it=myList.iterator();

		while(it.hasNext())

			System.out.println(it.next());

	}

 

}