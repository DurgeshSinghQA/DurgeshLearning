package JavaLearningPackage;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SingleDimensionalArrays();
		//MultiDimensionalArrays();
		CopyArrayUsingAssignmentOperator();
		
		
		
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
	
	static void MultiDimensionalArrays()
	{
		
				//To create an array in a single statement, 
				//first declare the type of the array, followed by the name of the array, and then the values of the array enclosed in curly braces, separated by commas.

				int numberm[][] = {{1,2},{3,4},{5,6,1001}};
				String namem[][] = {{"Duregesh"}, {"Singh", "Sengar"}};
				
				//Declare and Initialize an Array
				
				int numberm1[][];
				numberm1 = new int[][] {{1,2},{3}};
				
				
				//Declare with length and Initialize an Array
				
				int numberm3[][] = new int[2][3];
				
				numberm3[0][0] = 1;
				numberm3[1][1] = 2;
				numberm3[1][2] = 3;
				
				
				String[][] strm = new String[3][1];
				
				
				//Print array value directly using index number
				System.out.println(numberm[0][0]);
				
				System.out.println("Length"+numberm.length);
				
				//Print array value using for loop
				for(int im=0; im<numberm.length;im++)
				{
					for(int jm=0; jm<numberm[im].length;jm++)
					System.out.println("["+im+"]"+"["+jm+"]"+numberm[im][jm]);
				}
				
				//Print array values using for each loop
				for(String[] km : namem)
				{
					for(String lm : km)
					System.out.println(lm);
				}
		
	}
	
	static void CopyArrayUsingAssignmentOperator()
	{
		int numberc[] = {1,2,3,4,5,6,1001};
		
		//Copy Array using '=' Assignment Operator
		int numberc1[] = numberc;
		
		for(int c : numberc1)
		{
			System.out.println("Values of Copied single Dimestional Array 'numberc1': "+c);
		}
		
		int numberc2[][] = {{11,12},{13,14},{15,16}};
		int numberc3[][]= numberc2;
		
		for(int d[]:numberc3)
			for(int e:d)
			{
				System.out.printf("\n Value of Copied Multi DimestionalArray 'numberc3': "+ e);
			}
		
	}
	

}
