package Exceptions;

//UnChecked Exceptions
// one try block can have multiple catch blocks so it can handle multiple type of exceptions

public class ExceptionExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program is started");
		System.out.println("Program is in Progress");
		/*
		int a =50;
		
		// Arithmetic Exception
		//handling exception
		try 
		{
			System.out.println(a/0);       //throws ArithmeticcException //even if this line does not throw exception it will function normally and catch block wont be executed
		}
		catch(ArithmeticException obj)    //ArithmeticcException itself is a class name so it requires object
		{
			System.out.println("ArithmeticException handled successfully");
		}
		*/
		
		//Null pointer exception
		// if you don't know which exception will occur then just mention Exception in catch block
		String s = null;
		try
		{
			System.out.println(s.length());
		}
		catch(Exception obj)
		{
			System.out.println("Exception handled successfully");
		}
		
		//Number  format exception
		String x = "abc";									
		//int i = Integer.parseInt(x);
		
		//Array Index out of bound exception
		int arr[]= new int[5];
		//arr[20] = 100;
		
		
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");
	}

}
