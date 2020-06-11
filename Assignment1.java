package Selenium.Day3;

import java.util.Scanner;

public class Assignment1 {
	
	
	public static String rev(String a)
	{
		
		char[] temCarray=new char[a.length()];
		for (int i=0;i<a.length();i++)
		{
			temCarray[i]=a.charAt(a.length()-1-i);
			
		
					}
	String reva=String.valueOf(temCarray);
	
	
		return reva;
	}


	public static void main(String[] args) {
		
		String input="I am cv Narendra Kumar";
		System.out.println("Given input: "+input);
		String fOutput="";
		String[] splitInput = input.split(" ");
		String[] output = new String[splitInput.length];
		for(int i=0;i<splitInput.length;i++) {
						
			if((splitInput[i].length()>1)&&((i)%2==1)) 
			{
				output[i]=rev(splitInput[i]);				
			}
			else
			{
				output[i]=splitInput[i];				
			}
			
		}
		
		for(int i=0;i<output.length;i++)
		{
			fOutput=fOutput+output[i]+" ";
		}
		System.out.println("Output of input: " + fOutput);
		
		
	}
}
