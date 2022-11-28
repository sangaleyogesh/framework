package constructor;

public class constructor5 {
	
	//user define constructor without parameter
	String name;
	int rollno;
	public constructor5() {
		
		 name="akshy";
		 rollno=50;
	}
	
	public static void main(String[]args) {
		
		
	constructor5 s1=new constructor5();	
		s1.m1();
	
	}


public void m1() {
	System.out.println(name);
	System.out.println(rollno);
	
	
}
}