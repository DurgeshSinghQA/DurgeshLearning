package JavaLearningPackage;

public class Print_Reverse_Pyramid 
{
	public static void main(String[] args) 
	{
		int num=9, row=4, col=4;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(num);
				--num;
			}
			col--;
			System.out.println();
			
		}
	}

}
