package Overriding;

// The definition of method should be same, everything should be same only the body should be different in overriding
// Overriding can be achieved only through inheritance because it should have parent class and child class


class bank
{
	double rateofinterest()
	{
		return 0;
	}
}

class sbi extends bank
{
	double rateofinterest()
	{
		return 8.25;
	}
}

class axis extends bank
{
	double rateofinterest()
	{
		return 9.34;
	}
}

class hdfc extends bank
{
	double rateofinterest()
	{
		return 10.13;
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		sbi obj1 = new sbi();
		// instead of storing the return type in a variable we can directly print it
		System.out.println(obj1.rateofinterest());
		
		axis obj2 = new axis();
		System.out.println(obj2.rateofinterest());
		
		hdfc obj3 = new hdfc();
		System.out.println(obj3.rateofinterest());

	}

}
