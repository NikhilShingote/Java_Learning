package Object_Oriented_Programming;

public class Method_types {
	
	//METHODS
	// 1. taking no parameters and return no values.
	int x = 111;
	int y = 23;
	
	/*
	void sum()
	{
		//Case 1
		// System.out.println("Sum of 2 numbers is: "+(x+y));
	}
	*/
	/*
	int sum()
	{
		//Case 2
		return (x+y);  // since its returning a int data type we need to mention it before method name
	}
	*/
	/*
	void sum(int a ,int b)
	{
		// Case 3
		// 3. taking parameters but no return values.
		System.out.println(a+b);
	}
	*/
	
	int sum(int a, int b)
	{
		return(a+b);
	}

	public static void main(String[] args) {
		
		// Case 1
		// 1. taking no parameters and return no vlaues.
		Method_types obj1 = new Method_types();
		//obj1.sum();
		
		// Case 2
		// 2. taking no parameters but return values.
		// Since this method is retuning some value we need to store it somewhere
		// int result = obj1.sum();
		// System.out.println(result);
		
		// Case 3
		// 3. taking parameters but no return values.
		// obj1.sum(100,200);
		
		// Case 4
		// 4. taking parameters also return values.
		int result = obj1.sum(300,400);
		System.out.println(result);
		
	}

}
