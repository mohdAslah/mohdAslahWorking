package practice1;

public class ConstrctorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstrctorDemo cd= new ConstrctorDemo();
		ConstrctorDemo cd1= new ConstrctorDemo(7,8);


	}
	
	public ConstrctorDemo()
	{
		System.out.println("HEY I am default cons");
		
	}
	
	public ConstrctorDemo(int c, int d)
	{
		int a= c+d;
		System.out.println("HEY I am not cons "+a);
		
	}

}
