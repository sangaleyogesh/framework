package method;
class staticmethod {    //class body
public static void main (String [] args){
 System.out.println("main method started");
  //static regular method
  //1.Direct calling
   m1();
   m2();

  //calling by class name
//syntax==classname.method();
        staticmethod.m1();
        staticmethod.m2();
        
    System.out.println("main method ended");    
}

public static void m1(){

System.out.println("static regular method:m1");

} 

public static void m2(){

System.out.println("static regular method:m2");
}
}
