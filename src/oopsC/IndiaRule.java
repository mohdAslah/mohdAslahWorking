package oopsC;

public class IndiaRule implements Centralrool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndiaRule ir= new IndiaRule(); // can access all methods from parent and child class
		ir.greenGo();
		ir.redStop();
		ir.yelloWalk();
		ir.BlueRun();
		

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
