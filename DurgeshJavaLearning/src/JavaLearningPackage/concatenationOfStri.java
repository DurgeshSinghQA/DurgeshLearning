package JavaLearningPackage;

public class concatenationOfStri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		concatenationOfStringAndVariable();

	}
	
	static void concatenationOfStringAndVariable()
	{
		int a = 10;
		int b = 20;
		
		String s1 = "Durgesh";
		String s2 = "Sengar";
		
		//Sum of integer variable first and than concatenate string variable
		System.out.println(a+b+s1+s2);
		
		//Concatenate string variable and than Sum of integer variable
		System.out.println(s1+s2+(a+b));
				
		//Concatenate string variable and  integer variable both
		System.out.println(s1+s2+a+b);
	} 

}
