package JavaLearningPackage;

import java.util.Arrays;

public class Print_abbccc_from_1a2b3c {
	
	public static void main(String[] args) {
		
		String str = "1a2B3c4D";
		
		char arr[]= str.toCharArray();
		
		System.out.println("Value of char array: "+Arrays.toString(arr));
		
		int nu[] = new int[arr.length/2];
		char ch[] = new char[arr.length/2];
		
		int k =0, l=0;
		
		for(int i=0;i<arr.length;i++)
		{	
			if(i==0 || i%2==0)
			{			
				nu[k]=Character.getNumericValue(arr[i]);
				k++;			
			}
			
			if(i==1 || i%2!=0)
			{			
				ch[l]=arr[i];
				l++;
			}
		}
		
		System.out.println("Values at odd place: "+Arrays.toString(nu));
		System.out.println("Values at odd place: "+Arrays.toString(ch));
		
		for(int a=0;a<nu.length;a++)
		{
			for(int b=0; b<nu[a];b++)
			{
				System.out.print(ch[a]);
			}
		}
		
		
	}

}
