package programme;
public class NumericAndNondecimal{   //class body
public static void main( String [] args){   // main method body

    //A. Numeric And Nondecimal data type
    //1. Byte  (size 1byte=8bit) 
 byte b= 10;
 byte b1= 127; //max limit
// byte b2= 128; //not allowed

 byte b3= -20;
 byte b4= -128;  //min limit
// byteb5= -129; //not allowed

System.out.println("Byte data type:"+b);
System.out.println("Byte data type max limit:"+b1);

System.out.println("Byte data type:"+b3);
System.out.println("Byte data type min limit:"+b4);
System.out.println();
System.out.println("***************************************************");

     //2. short (size 2byte=16bit)
short s= 150;
short s1= 32767; // max limit
//short s2= 32768; //not allowed

short s3= -150;
short s4= -32768;  // min limit
//short s5= -32769;  //not allowed

System.out.println("short data type:"+s);
System.out.println("short data type max limit:"+s1);

System.out.println("short data type:"+s3);
System.out.println("short data type min limit:"+s4);

System.out.println();
System.out.println("****************************************************");

    //3. int (size 4 byte=32 bit)
int i= 1500;
int i1= 2147483647;  //max limit
//int i2= 2147483648; //not allowed

int i3= -1500;
int i4= -2147483648;   //min limit
//int i5= -2147483649;   //not allowed

System.out.println("int data type:"+i);
System.out.println("int data type max limit:"+i1);

System.out.println("int data type:"+i3);
System.out.println("int data type:"+i4);

System.out.println();
System.out.println("*******************************************************");

   //4. long (size 8 byte=64 bit)
  //for large values,it is mandatory to give l after value.
long l= 155789;
long l1= 8605377846l;   //l is given after Mob.No.
//long l2= 1234567910;  // not allowed, because l not given after value

long l3= -123456;
long l4= -8605377846l;
//long l5= -8605377846;   //not allowed,because l not given after value

System.out.println("long data type:"+l);
System.out.println("long data type 1:"+l1);

System.out.println("long data type 2:"+l3);
System.out.println("long data type 3:"+l4);

System.out.println();
System.out.println("*********************************************************");

}
}


