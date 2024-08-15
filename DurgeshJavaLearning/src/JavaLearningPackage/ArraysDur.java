package JavaLearningPackage;

import java.util.Arrays;

public class ArraysDur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SingleDimensionalArrays();
		//MultiDimensionalArrays();
		//CopyArrayUsingAssignmentOperator();
		//CopyArrayUsingForLoop();
		
		//CopyArrayUsingArrayCopyMethod();
		
		PrintFirst3LetterOfWord();
		
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
	
	static void CopyArrayUsingForLoop()
	{
		int [] numberc4 = {21, 23, 24, 25};
		int [] number5 = new int[numberc4.length];
		
		for(int e=0; e < numberc4.length; e++)
		{
			number5[e]= numberc4[e] ;
			
			//System.out.println(number5[e]);
			
		}
		
		int [][] numberc6 = {{31,32},{33,34},{35,36}};
		
		int [] [] numberc7 = new int[numberc6.length][];
		
		for(int f = 0; f<numberc6.length; f++)
		{
			
			for(int g = 0; g<numberc6[f].length; g++)
			{
				numberc7[f] = new int[numberc6[f].length];
											
				numberc7[f][g] = numberc6[f][g];
				System.out.println("Array numberc7 values at "+f+g+": "+numberc7[f][g]);
			}
		}
	
	}
	
		
	static void CopyArrayUsingArrayCopyMethod()
	{
		//Copy single dimesional using arraycopy Method
		int src[] = {1,2,3,4};
		
		int dest[];
		dest = new int[src.length+1];
		
		System.arraycopy(src, 3, dest, 1, 1);
		
		System.out.println( Arrays.toString(dest)); // Arrays.toString is used to convert single dimesion array to string
		
		//Copy multi dimesional using arraycopy Method
		
		int src1[][] = {{10,11,12},{13,14,15}};
		
		int dest1[][] = new int[src1.length][];
		
		for(int ac = 0; ac<src1.length; ac++)
		{
			dest1[ac] = new int[src1[ac].length];
			
			System.arraycopy(src1[ac], 0, dest1[ac], 0, dest1[ac].length); 
		}
		
		System.out.println(Arrays.deepToString(dest1)); // Arrays.deepToString is used to convert 2d array to string
	}
	
	static void PrintFirst3LetterOfWord()
	{
		String allDayName[] = {"Su", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		for(int dn=0; dn<allDayName.length; dn++)
		{
			
			String day = allDayName[dn];
			
			if(day.length()>3)
			{
				System.out.println("Day Name: "+day.subSequence(0, 3));	
			}
			
			else
			{
				System.out.println("Day Name: "+day);
			}
			
		}
			
	}

}
