package method;

public class returntype {

	
	public static void main(String[]args) {
		
		returntype add=new returntype();
		
		int c=add.m1();
		System.out.println(c);
	}
	
	
	public int m1() {
		
		int a=10;
		
		int b=20;
		
		int c=a+b;
		
		return c;
	}
}
