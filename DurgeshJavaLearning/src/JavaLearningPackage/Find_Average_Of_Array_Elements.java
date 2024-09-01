package JavaLearningPackage;

public class Find_Average_Of_Array_Elements {
	
	public static void main(String Args[])
	{
		int arr[] = {6,5,3};
		int arrlength = arr.length;
		float average;
		int sum=0;
		
		for(int i:arr)
		{
			sum+=i;			
		}
		
		average = sum/arrlength;
		
		System.out.println("Average of Array Elements: "+average);
	}

}
