package Overriding;

class bike
{
	final void run()
	{
		System.out.println("Running");
	}
}


class honda extends bike
{
	void run()  // gives error as method is final so cannot override
	{
		System.out.println("Walking");
	}
}


public class FinalKeyword_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
