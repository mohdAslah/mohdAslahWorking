package thisDemo;

public class thisClassd {

	
	int a= 8;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisClassd tc= new thisClassd();
		tc.getData();
	
		
	}
	
	
	public void getData()

	{
		int a= 9;
		int c= a+ this.a;
		System.out.println(c);
		
	}
}
