package constructor;

public class constructor1{
	
int i;

int j;


public constructor1(){
	
	 i=20;
	 j=30;
	
}	
	
public void m1() {
	
System.out.println(i+j);


}	
	
	public static void main(String[]args) {
		
constructor1 c1=new constructor1();		
		
		c1.m1();
	}
	
	
	
	
	
}