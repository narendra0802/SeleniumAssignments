package Selenium.Day3;

import java.util.Arrays;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input= {1,3,7,9,4,15,2};
		Arrays.sort(input);
		int l=input.length;
		int uRange=input[l-1];
		int[] temp=new int[uRange];
		for(int i=0;i<l;i++) 
		{
			if(input[i+1]!=input[i]+1) {
				for(int j=input[i];j<input[i+1]-1;j++)
				{
					temp[j]=j+1;
					System.out.println(temp[j]);
				}				
			}
		}
		

	}

}
