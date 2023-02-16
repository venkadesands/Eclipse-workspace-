package com.class_variable;
       
public class Class_variable {
				static int a;
				static int z;
	           int b = 200;  // Class variable //
	          static  String c = "1995";// Satic variable //
                public int Methods() {
					 a = 100;   // local variable //
             System.out.println(a);
             z=10;
             return a;
             
				}
                
//              public static void returning() {
//				
//            	  int u=38;
//            	  
//            	  int i=2;
//            	  
//            	  int sum = u+i;
//            	System.out.println(sum);
//            	return sum;
//			}
                
                public  void Methods2() {
                	
                	int y=98;
                	System.out.println(a+b);
					System.out.println(b);
					z=20;
                  System.out.println(z);
				}
                public  void  Methods3() {
					System.out.println(c);
				}
                
	public static void main(String[] args) {
		Class_variable zc = new Class_variable();
		zc.Methods();
		zc.Methods2();
		//Methods3(); // useage of static variable, it's call but not be create the object
System.out.println(c);
//returning();
	System.out.println(z);	
	
	System.out.println(a);
	}
	
	
	
	
}
