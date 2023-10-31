package com.sample;

 

import java.util.Scanner;

 

public class PizzaHut {

 

	public static void main(String[] args) {

		

		Customer cust = new Customer();

		cust.init();

		cust.display();

		cust.setCustNo(21);

		int custNo =cust.getCustNo();

		System.out.println(custNo);

		cust.setCustName("Jyothi");

		String custname =cust.getCustName();

		System.out.println(custname);

		cust.setCustAddress("Chennai");

		String address=cust.getCustAddress();

		System.out.println(address);

		System.out.println("----------------");

		CustomerReport report = new CustomerReport();

		Scanner sc = new Scanner(System.in);

		

		for(int i=0;i<5;i++ ) {

			System.out.println("enter customer number");

			int custNo1 = sc.nextInt();

			sc.nextLine();

			System.out.println("enter customer name");

			String custName1 = sc.nextLine();

			System.out.println("enter customer address");

			String custAddress1 = sc.nextLine();

			Customer customer = new Customer(custNo1, custName1, custAddress1);

			report.addCustomer(customer);

		}

		System.out.println("Customer Report:");

        report.printList();

		

		

		

 

	}

 

}