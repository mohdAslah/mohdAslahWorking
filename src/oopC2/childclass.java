package oopC2;

public class childclass extends Parentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parentclass cc= new Parentclass();
		
		cc.sub();
		cc.sum();
		cc.mult();

	}
	
	public void mult()
	{
		System.out.println("child mult");   //overiding : same method name same argument same data type of argument
	}
	
	
	

}
