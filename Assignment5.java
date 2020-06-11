package Selenium.Day3;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input= {50,1,56,78,23,45};
		int l=input.length;
		int temp;
		//Arrays.sort(input);
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if((input[i]<input[j])&&(i!=j)) 
				{
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<l;i++)
		{
			System.out.println(input[i]);
		}
		
		System.out.println("Second largest number: "+input[l-2]);

	}

}
