package thisDemo;

public class SuperdemoChild extends SuperdemoParent {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperdemoChild sp = new SuperdemoChild();
		
		sp.getName();
		sp.getmyName();

	}
	
	public void getName()
	
	{
		   String Name= "Aslah";
			System.out.println(Name);

		System.out.println(super.Name);
	}
	
	public void getmyName()
	{
		super.getmyName();
		System.out.println("child name ");
	}
	
	
	

}
