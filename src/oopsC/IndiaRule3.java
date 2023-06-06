package oopsC;

public class IndiaRule3 implements Centralrool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Centralrool ir3= new IndiaRule3(); // can access all methods from parent  class
		ir3.greenGo();
		ir3.redStop();
		ir3.yelloWalk();
		//ir3.BlueRun();
		//ir3.d;
		

	}

	@Override
	public void greenGo() {
System.out.println("Parent green");		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Parent red");		

		
	}

	@Override
	public void yelloWalk() {
		// TODO Auto-generated method stub
		System.out.println("Parent yellow");		

		
	}
	public void BlueRun() {
		// TODO Auto-generated method stub
		System.out.println("Child BlueRun");		

		
	}

}
