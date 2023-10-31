package sample;



public class EngineeringBook extends Book {
	private String category;
	
	public String getCategory() {
		return category;
	}
public void setCategory(String category) {
	this.category=category;
	
}
public String toString() {
	return super.tostring()+"Category:"+category;
}
}
