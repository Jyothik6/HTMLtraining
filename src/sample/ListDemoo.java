package sample;

 

import java.util.ArrayList;

import java.util.List;

 

public class ListDemoo {

 

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		list.add(5);

		list.add(2);

		list.add(4);

		//list.add("hello");

		list.add(6);

		int sum =0;

		//for(Object o :list)
		for(Integer o:list){
           sum+=o;
			//sum += (int)o;

			

		}
		System.out.println(sum);

		

 

	}

 

}

 