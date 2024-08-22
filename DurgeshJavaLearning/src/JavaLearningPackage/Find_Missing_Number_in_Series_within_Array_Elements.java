package JavaLearningPackage;

public class Find_Missing_Number_in_Series_within_Array_Elements {
	
	public static void main(String Args[])
	{
		int miss[]={1,2,3,4,6,7,9,10};
		
		int j=1;
		for(int i=0;i<miss.length;i++)
		{
			
			if(miss[i]!=j)
			{
				System.out.println(j+" is missing");
				j=j+1;
			}
			
			j++;
		}
		
	}
}
