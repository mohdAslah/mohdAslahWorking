package basic;

public class Returnp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returnp obj= new Returnp();
		System.out.println(obj.sum());
		Returnp.sub();
		int c= obj.Multi(5, 7);
		
		System.out.println(c);


	}

	public int sum()
	{
		int a=90;
		int b= 10;
		
		int c= a+b;
		
       return c;		
		
	}
	
	public static void sub()
	{
		int a=90;
		int b= 10;
		
		int c= a-b;
		
System.out.println("Sub is "+c);		
	}
	
	
	public int Multi(int a, int b)
	{
			int c= a*b;
		
              return c;		
		
	}
	
	
}
