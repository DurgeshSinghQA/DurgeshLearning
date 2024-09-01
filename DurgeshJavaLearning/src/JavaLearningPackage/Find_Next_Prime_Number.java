package JavaLearningPackage;

public class Find_Next_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 31;
		int rem=0;
		
		while(rem==0)
		{
			num+=1;
			for(int j=2;j<num;j++)
			{
				rem=num%j;
				if(rem==0)
					break;
			}
			
		}
		
		System.out.println("Next prime number is: "+num);

	}

}
