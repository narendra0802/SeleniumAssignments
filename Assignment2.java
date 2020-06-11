package Selenium.Day3;

public class Assignment2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="MALAYALM";
		System.out.println("input "+input);
		int l=input.length();
		char[] revInput = new char[l];
		for(int i=0;i<input.length();i++)
		{
			revInput[i]=input.charAt(input.length()-1-i);
			
		}
		
		String rev=String.valueOf(revInput);
		System.out.println("rev "+rev);
		
		if(input.equalsIgnoreCase(rev)) {
			System.out.println("Given Word is a Palindrome");
		}
		else
		{
			System.out.println("Given Word is not a Palindrome");
		}
	}

}
