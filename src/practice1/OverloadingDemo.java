package practice1;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingDemo ol= new OverloadingDemo();
		ol.Sum(5, 8);
		ol.Sum(9, 98.2);
		System.out.println(ol.sum(89.45, 56.32));
		ol.Sum(5, 12, 3);
	}

	
	public void Sum(int a, int b)
	
	{
		
int c= a+ b;

System.out.println(c);
	}
	
	public void Sum(int a, int b, int c)
	{
		
		int d= a+b+c;
		System.out.println(c);

	}
	
	public double sum(double a, double b)
	{
		double c= a+b;
				return c;
	}
	
public void Sum(int b, double a)
	
	{
		
double c= a+ b;
System.out.println(c);

	
}
}

