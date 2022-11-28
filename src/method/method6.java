package method;

public class method6{
	
	public static void main(String[]args){
		
		// non static regular method calling by same class
	method6 obj=new method6();
	obj.m1();
	
	}
	
	
	
	public void m1() {
		
		System.out.println("non static regular method calling from same class:m1");
		
	}
	
}