package stringDemo;

public class palinP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "";
		String str = "mohd";
		
		//System.out.println(str.length());
		
		for(int i=str.length()-1; i>=0; i--)
		{
			str1= str1 + str.charAt(i);
			
		}
		
		if(str1.equalsIgnoreCase(str))
		{
		System.out.println("its palindrome");
		}
		
		else {
			System.out.println("its NOT palindrome");

		}
	}

}
