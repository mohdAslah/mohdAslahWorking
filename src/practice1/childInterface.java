package practice1;

public class childInterface implements InterfaceParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childInterface cc= new childInterface();
		cc.mult();
		cc.sum();
		cc.Sub();

	}

	@Override
	public void mult() {
		// TODO Auto-generated method stub
		System.out.println("I am child multiply");
		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("I am child sum");

		
	}

	@Override
	public void Sub() {
		// TODO Auto-generated method stub
		System.out.println("I am child sub");

		
	}

}
