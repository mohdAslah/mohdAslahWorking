package practice1;

public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "MADAM";
		String str= "";
		name.length();
		
		for (int i= name.length()-1; i>= 0; i--)
		{
            str= str+name.charAt(i)		;
		}
		
		if(str.equalsIgnoreCase(name))
		{
			System.out.println("Palindrome");
			
		}
			else{
				System.out.println("Not Palindrome");

			}	

	}

}
