package constructor;

public class constructor4{
	
// default constructor	
	
	int i=10;
	
	
	public void m1() {
		
	System.out.println("default constructor");	
		
		
	}
	
	public static void main(String[]args) {
		
		constructor4 c4= new constructor4();
		
		c4.m1();
		System.out.println(c4.i);
		
		
	}
	
}