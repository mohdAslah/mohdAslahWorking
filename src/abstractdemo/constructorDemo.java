package abstractdemo;

public class constructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructorDemo cc= new constructorDemo();
		
		constructorDemo cc1= new constructorDemo(5, 7);

		constructorDemo cc2= new constructorDemo("mohd");


	}
	
 public constructorDemo()
 {
	 
	 System.out.println("I am in default constructor");
 }
 
 public constructorDemo(int a, int b)
 {
	 int c= a+b;
	 
	 System.out.println("I am in 2 constructor "+c);
 }
 
 public constructorDemo(String str)
 {
	 
	 System.out.println("I am in 3 constructor "+str);
 }
}
