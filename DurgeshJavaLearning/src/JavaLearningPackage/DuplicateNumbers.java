package JavaLearningPackage;

import java.util.Arrays;

public class DuplicateNumbers {
	
	public static void main(String[] Args)
	{
				
		int[] nbr = {12,43,2,4,2,6,0,-7, 43,-7, 2, 2};
		int[] dup = new int[nbr.length];
		
		for(int i = 0; i<nbr.length;i++)
		{
			for(int j=i+1;j<nbr.length;j++)
			{
				if(nbr[i]==nbr[j])
				{
					System.out.println(nbr[i]);
					break;
				}
				
			}
		}
		
		System.out.println("Duplicate Values in arrays"+Arrays.toString(dup));		
	}
		
}
	
	


