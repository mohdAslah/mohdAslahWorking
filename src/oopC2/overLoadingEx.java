package oopC2;

public class overLoadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overLoadingEx  ox= new overLoadingEx();
		ox.sum(78.9);
		ox.sum(34.5, 89);
		ox.sum(60, 40);

	}

	
	public void sum(int a)
	{
		
		System.out.println(a);
	}
	
	public void sum(double a)
	{
		
		System.out.println(a);
	}
	public void sum(int a, int b)
	{
		int c= a+ b;
		
		System.out.println(c);

	}
	public void sum(int a, double b)
	{
		
		System.out.println(a);
		System.out.println(b);

	}
	public void sum(double a, int b)
	{
		double c= a+b;
		System.out.println(c);

	}
}
