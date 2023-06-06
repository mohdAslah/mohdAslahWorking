package thisDemo;


public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try	{
		int a= 3;
		int b= 0;
		int c= a/b;
		
		System.out.println(c);
		}
	
	
catch(ArithmeticException et){
		
		
		System.out.println("I found Arithmetic Exception");
	}	
	catch(Exception e){
		
		
		System.out.println("I found exception");
	}
		finally
		{
			
			System.out.println("I am in finally block");
		}
		
		
	}

}
