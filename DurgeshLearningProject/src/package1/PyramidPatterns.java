package package1;

public class PyramidPatterns {

	public static void main(String[] args) {
		
		reversepyramid();
		
	}
	
	public static void reversepyramid()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println();
			for(int j=i;j<10;j++)
			{
				System.out.print("*"); 
			}
		}
	}

}
