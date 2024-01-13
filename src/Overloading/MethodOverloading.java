package Overloading;

// In method overloading we create the methods with the same name but with different parameters and different data types.
public class MethodOverloading {
	
	
	void add(int a, int b) 
	{
		System.out.println(a+b);
	}
	
	void add(int a, double b) 
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b) 
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) 
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		// Accessing the methods
		MethodOverloading obj1 = new MethodOverloading();
		
		obj1.add(10,20);
		obj1.add(3, 5, 2);
		obj1.add(1,2.7);
		obj1.add(3.5, 1.6);
	}

}
