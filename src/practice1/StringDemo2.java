package practice1;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "madam";
		
		String str1="";
		
		for(int i=str.length()-1; i>=0; i--)
			
		{
			
			str1= str1+str.charAt(i);
			
		}
		
		if(str1.equalsIgnoreCase(str))
		{
		System.out.println("palindrome");
		}
		
		else
		{
			System.out.println("Not palindrome");

		}
	}
	

}
