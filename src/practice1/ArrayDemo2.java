package practice1;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[4];
		
		a[0]=3;
		a[1]=7;
		a[2]=6;
		a[3]=1;
		
		int min= a[0];
		
		for (int i= 0; i< a.length; i++)
		{
			if(a[i]<min)
			{
				min= a[i];
			}
			
		}
		
		System.out.println(min);


	}

}
