package JavaLearningPackage;

public class Print_Reverse_Pyramid 
{
	public static void main(String[] args) 
	{
		int num=9;
		for(int i=4;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(num);
				num--;
			}
			
			System.out.println();
		
		}
	}

}
