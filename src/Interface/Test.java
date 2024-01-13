package Interface;

interface A
{
	int a=10; // here by default variables in interface are static and final
	
	void m1(); // this is always abstract and public
}

// To implement this interface we need to have a class
public class Test implements A {
	
	 //its mandatory to implement the abstract method into main method from interface when we extend the interface
	
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		/*Test obja = new Test();   //Method 1
		obja.m1();
		 */
		
		/*
		A obj = new Test();   // method 2
		obj.m1();
		*/ 
	}

}
