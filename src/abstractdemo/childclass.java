package abstractdemo;

public class childclass extends Parentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclass cc= new childclass();
		cc.color();
		cc.getbody();
		cc.getbreak();
		
		

	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		 String str= "aslah";

		System.out.println("I am child color");
		System.out.println(super.str);

		
	}
	
	public void getbody()
	{
		super.getbody();
		System.out.println("I am childbody");
	}
	
	

}
