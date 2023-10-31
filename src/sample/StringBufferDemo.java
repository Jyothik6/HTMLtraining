package sample;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//String result="";
	StringBuffer sb=new StringBuffer("");
	for(int i=0;i<20;i++) {
		sb.append(i);
		sb.append("");
		//result+=i+"";
		
	}
	//System.out.println(result);
	
	System.out.println(sb.toString());
	//sb.delete(2,5);
	//sb.replace(2,5,"hello");
	//sb.setCharAt(2,'x');
	sb.reverse();
	
	System.out.println(sb.toString());
	}

}
