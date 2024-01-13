package Overloading;

public class Constructor_overloading {
	
	
	//Constructors
	Constructor_overloading(int a, int b) 
	{
		System.out.println(a+b);
	}
	
	Constructor_overloading(int a, double b) 
	{
		System.out.println(a+b);
	}
	
	Constructor_overloading(double a, int b) 
	{
		System.out.println(a+b);
	}
	
	Constructor_overloading(int a, int b,int c) 
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		Constructor_overloading co = new Constructor_overloading(10, 2, 5);

	}

}
