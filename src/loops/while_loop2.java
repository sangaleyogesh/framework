package loops;

public class while_loop2 {
public static void main(String [] args) {
	//substraction from 10 to 5
	
	
	int i= 10;
	int sub=0;
	while(i>=5) {
//		0= 10-0
//		10=9-10
//		-1=8-(-1)
//		9= 7-9
		
		sub = i-sub;
		i--;
	}
	System.out.println(i);           //program not completed yet
}
}
