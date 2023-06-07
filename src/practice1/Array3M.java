package practice1;

public class Array3M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 2 4 1
		 9 8 4*/
		
		int a[][]= {{10,4,1},{9,8,4}};
		int min= a[0][0] ;
		
		for(int i= 0; i<2; i++)
		{
			for(int j= 0; j<3; j++)
			{
				if(a[i][j]<min)
				{
					min= a[i][j];
				}
			}
		}
		
		System.out.println(min);
	System.out.println("Array Ptactice");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
