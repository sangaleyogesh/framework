package method;

public class method2 {
public static void main(String [] args) {
	//Non static regular method call from differnt class
	//here we use method1 program for execution
	
	//syntax- classname referncevariablename = new classname();
	          method1 obj = new method1();
	          obj.m1();
	          obj.m2();
//obj is not object name. obj is referencevariable name.
// new method1() is object name	          
		   
	   }
	
}
