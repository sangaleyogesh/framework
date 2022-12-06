package logicalprogramme;

public class primenumber1 {
	
	public static void main(String[]args) {
		
int i;

int j;

for( i=1; i<10; i++) {
	
	for(j=2; j<i; j++) {
		
		if(i%j==0) 
			
			break;
		}
		
	if(i==j) {
		
		System.out.print(j+" ");
	}

}
}

	
	}
		
	


