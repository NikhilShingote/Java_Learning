package Overloading;

public class This_keyword {
	
	int a,b;  //Instance variables or class variables
	
	void getValues(int a, int b)
	{
		this.a=a;   // method variables
		this.b=b;	// this keyword denotes class variable
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		This_keyword th = new This_keyword();
		th.getValues(10, 30);
		th.printValues();

	}

}
