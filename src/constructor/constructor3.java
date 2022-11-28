package constructor;

public class constructor3 {
	
int i;
int k;

public constructor3(int x, int y) {
	
	i=x;
	k=y;
	
}
	
public void m1() {
	
	System.out.println(i);
	
	System.out.println(k);
	
}	
public static void main(String[]args) {
	
	constructor3 c3=new constructor3(40,80);
	c3.m1();
}	
	

}
