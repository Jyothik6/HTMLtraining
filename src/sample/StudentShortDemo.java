package sample;

 

import java.util.ArrayList;
import java.util.Collections;

 

class StudentTest implements Comparable<StudentTest>{
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	StudentTest(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;

	}
	public String toString() {
		return "["+"rollNo" +rollNo+ "name " +name+"]";
	}

	public int compareTo(StudentTest student) {
		return this.name.compareTo(student.getName());
	}

}
public class StudentShortDemo {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentTest> arr= new ArrayList<>();
		arr.add(new StudentTest(21,"Swati"));
		arr.add(new StudentTest(23,"Bhargav"));
		arr.add(new StudentTest(22,"Jyothi"));
		arr.add(new StudentTest(24,"Teja"));
		arr.add(new StudentTest(25,"Ravi"));
		for(StudentTest s :arr) {
			System.out.println(s.toString());
		}
		System.out.println("-------------------");
		Collections.sort(arr);
		System.out.println("-------------------");
		for(StudentTest s :arr) {
			System.out.println(s.toString());
		}
	}

 

}