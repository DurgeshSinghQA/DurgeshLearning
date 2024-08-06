package JavaLearningPackage;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleDimensionalArrays();
		
		
	}
	
	static void SingleDimensionalArrays()
	{
		//To create an array in a single statement, 
		//first declare the type of the array, followed by the name of the array, and then the values of the array enclosed in curly braces, separated by commas.

		int number[] = {1,2,3,4,5,6,1001};
		String name[] = {"Duregesh", "Singh", "Sengar"};
		
		//Declare and Initialize an Array
		
		int number2[];
		number2 = new int[] {1,2,3};
		
		
		//Declare with length and Initialize an Array
		
		int number3[] = new int[2];
		
		number3[0] = 1;
		number3[1] = 2;
		
		
		String[] str = new String[3];
		
		
		//Print array value directly using index number
		System.out.println(number[1]);
		
		//Print array value using for loop
		for(int i=0; i<number.length;i++)
		{
			System.out.println(number[i]);
		}
		
		//Print array values using for each loop
		for(String j : name)
		{
			System.out.println(j);
		}
		
	}

}
