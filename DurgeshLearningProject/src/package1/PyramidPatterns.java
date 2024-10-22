package package1;

public class PyramidPatterns {

	public static void main(String[] args) {
		
		reversepyramid();
		StartCenterPyramid();
	}
	
	public static void reversepyramid()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=i;j<10;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void StartCenterPyramid()
	{
		int p=5;
		int m=1;
		for(int o=0;o<6;o++)
		{
			for(int l=0;l<p;l++)
			{
				System.out.print(" ");
			}
			p--;
			
			for(int n=0;n<m;n++)
			{
				System.out.print("*");
			}
			m=m+2;
			
			System.out.println();
		}
	}
	
	public static void StartLeftPyramid()
	{
		
	}

}
