package method;

public class nonstaticmethod {
public static void main(String [] args) {
	System.out.println("main method started");
	//Non static regular method call from same class
	//direct calling by method name is not allowed
       	  //m1();
	     //m2();
	
	// calling by method name is not allowed
	//nonstaticmethod.m1();
	//nonstaticmethod.m2();
	
	//object creation
	//syntax- classname reference variable name= new classname();
	       nonstaticmethod obj= new nonstaticmethod();
	       //reference variable name.methodname();
	                obj.m1();
	                obj.m2();
	
	
	System.out.println("main method ended");
	
}
	
public void m1() {
	System.out.println("Non static regular method call from same class:m1");
}
	
public void m2() {
	System.out.println("Non static regular method call from same class:m2");
	
}
	
	
	
	
	
	
	
	
	
}
