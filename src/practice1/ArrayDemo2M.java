package practice1;

public class ArrayDemo2M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3 9 5
		//8 4 7
		int a[][]= new int[2][3];
		
		a[0][0]=9;
		a[0][1]=9;
		a[0][2]=5;
		a[1][0]=8;
		a[1][1]=4;
		a[1][2]=2;
		//int a[][]= {{4,6,2}, {1,7,5}};

		int min= a[0][0];
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++) 
			{

			if(a[i][j]<min)
			{
				min= a[i][j];
			}
			}
		}
		
		System.out.println(min);
	

	}

}
