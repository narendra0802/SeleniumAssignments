package Selenium.Day3;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="We learn java basics as part of java sessions in java week1";
		System.out.println("input: "+input);
		String output="";
		String[] inputSplit = input.split(" ");
		int l=inputSplit.length;
		String[] temp=new String[l];
		int count=0;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l;j++) {
				if((inputSplit[i].equals(inputSplit[j]))&&(i!=j)&&(i>j))
				{
					count=count+1;
				}
				
			}
			
			//System.out.println("Count of "+inputSplit[i]+" is "+count);
			if(count>0)
			{
				temp[i]="";
			}
			else
			{
				temp[i]=inputSplit[i];
			}
			
			count=0;
		}
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i].length()>0) {
			output=output+temp[i]+" ";}
		}
		
		System.out.println("Output: "+output);
	
	}

}
