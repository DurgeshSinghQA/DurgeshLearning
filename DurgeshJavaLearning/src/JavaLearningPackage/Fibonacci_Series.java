package JavaLearningPackage;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		
		int fibonacci;
		
		for(int i=0;i<11;i++)
		{
			fibonacci = num1+num2;
			System.out.println(fibonacci);
			num1=num2;
			num2=fibonacci;
		}

	}

}
