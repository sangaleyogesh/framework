package Array;
public class min_array{

public static void main(String [] args){

int a [] = {2,4,6,8,10,0};

int min= a[0];

for(int i=0; i<a.length; i++){

   if(min>a[i]){
     
     min=a[i];

}
}
    System.out.println(min);
}
}