package JavaLearningPackage;

import java.util.Arrays;
import java.util.Collections;

public class SmallestAndLargestNumberInArray {
	
	public static void main(String args[])
	{
		Integer[] nbr = {12,43,4,6,0,-7};
		
		System.out.println("Original: "+ Arrays.toString(nbr));
		
		//Sort array in ascending order
		Arrays.sort(nbr);
		System.out.println("Ascending Sorted: "+Arrays.toString(nbr));
		
		//Sort array in descending order
		Arrays.sort(nbr, Collections.reverseOrder());
		System.out.println("Descending Sorted: "+ Arrays.toString(nbr));
		
		//Find Largest and Smallest Number in array
		int lrg=nbr[0], sml=nbr[0];
		for(int i=0; i<nbr.length; i++)
		{
				if(nbr[i]>lrg)
				{
					lrg=nbr[i];
				}
				else
				{
					sml=nbr[i];
				}
			
		}
		
		System.out.println("Largest Number: "+lrg);
		System.out.println("Smallest Number: "+sml);
		
		
	}

}
