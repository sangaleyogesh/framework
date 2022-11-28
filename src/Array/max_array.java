package Array;
public class max_array{

public static void main (String [] args){

int a [] = {1,3,5,7,9};

int max=a[0];

for(int i=0; i<a.length; i++){
  
   if(max<a[i]){

     max=a[i];
}

}
  System.out.println(max);
}

}

