package Overriding;

final class motorbike
{
	final void run()
	{
		System.out.println("Running");
	}
}


class hayabusa extends motorbike // gives error as class is final so cannot override into childclass	
{
	void run()  
	{
		System.out.println("Walking");
	}
}

public class Finalkeyword_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
