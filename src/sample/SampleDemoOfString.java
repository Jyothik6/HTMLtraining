package sample;
public class SampleDemoOfString {

 

	public static void main(String[] args) {

		
		String str ="Hello";

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());

		System.out.println(str.indexOf('l'));

		System.out.println(str.lastIndexOf('o'));

		System.out.println(str.substring(2,4));

		System.out.println(str.length());
		
 		System.out.println(str.concat("world"));
		System.out.println(str);
		System.out.println(str.replace('l','k'));
		str="    hel lo ";
		System.out.println(str.length());
    		str=str.trim();
		System.out.println(str+""+str.length());
		System.out.println(str.contains("ll"));
		
		char[] chars=str.toCharArray();
		for(char c:chars)System.out.println(c);
	}

 

}

 