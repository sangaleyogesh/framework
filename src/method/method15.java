package method;

public class method15{
	public static void main(String [] args) {
		
		//static method
		//direct calling
		m1();
		
		//call by class name
		method15.m1();
	}
	public static void m1() {
		System.out.println("static method");
	}
}