package Overloading;

public class Overload_MainMethod {
	
	public void main(int x) // main method 1
	{
		System.out.println(x);
	}
	
	public void main(int x, int y) // main method 2
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args) // Default Main method 
	{
		Overload_MainMethod obj = new Overload_MainMethod();
		obj.main(100); // calls 1st main method
		obj.main(100,400); // calls 2nd main method

	}

}
