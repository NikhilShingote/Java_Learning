package Overloading;

//variables and methods can be static
// static variables are shared variables among all the objects created.


public class Static_keyword {
	
	static int a = 10;
	int b = 20;
	
	static void m1()
	{
		System.out.println("This m1 is static method");
	}
	
	void m2()
	{
		System.out.println("This m2 is non-static method");
	}
	
	public static void main(String[] args) {
		
		// static methods can access only static variables and methods(direct access-without creating any object)
		System.out.println(a);
		m1();
		
		//System.out.println(b); --> Incorrect
		//m2(); --> Incorrect
		
		// If this main method is is some other class then still we can access but we need to mention class name before e.g. Static_keyword.a or Static_keyword.m1()
		
		// static methods can access non static variables and methods but through object
		Static_keyword obj1 = new Static_keyword();
		System.out.println(obj1.b);  // accessing non static variable though object
		obj1.m2();
		
	}

}
