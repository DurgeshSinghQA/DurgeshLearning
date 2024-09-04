package JavaLearningPackage;

import java.util.Arrays;
import java.util.Collections;

public class ConcatenateAndSort_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr1[]= {1,3,5};
		Integer arr2[]= {2,4,6};
		
		int len1 = arr1.length;
		int len2 = arr2.length;
		
		Integer arr3[] = new Integer [len1+len2];
		
		System.arraycopy(arr1, 0, arr3, 0, len1);
		System.arraycopy(arr2, 0, arr3, len1, len2);
		
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr3, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr3));

	}

}
