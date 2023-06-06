package practice1;

public class childAbs extends ParentAbs  {

      int    a=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	childAbs cb= new childAbs();
	//	ParentAbs pb= new ParentAbs(); cant create the object for abstract method
	//	ParentAbs pb= new childAbs();
		//childAbs cb1= new ParentAbs(); not possible

            cb.Break();
            cb.Gear();
            cb.color();
            cb.mySeat();
            
           // pb.Break();
            //pb.Gear();
            //pb.color();
            
	}
	
	
	public void	Break()
	{
		super.Break();
		System.out.println("I am child Break");
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub

		System.out.println("Hey I m Child color");
		
	}
	public void mySeat() {
		// TODO Auto-generated method stub
         System.out.println(super.a);
		System.out.println("Hey I m Child seat");
		
	}	
	
	
	
	

}
