package practice1;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			try{
				int a= 7;
			
			int b= 0;
			int k= a/b;
			System.out.println(k);
			}
			
			catch(ArithmeticException e)
			{
				
				
				System.out.println("Hey I cath Arithmetic exception");
			}
			catch(Exception e)
			{
				
				
				System.out.println("Hey I cath exception");
			}
			finally
			{
				System.out.println("Hey I am in finally block");

				
			}

	}

}
