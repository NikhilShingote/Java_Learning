package Object_Oriented_Programming;

public class Constructors {
	
	
	int z;
	int x;
	
	Constructors() // Default constructor
	{
		z = 20;
		x = 30;
	}
	
	Constructors(int a, int b) // Parameterised constructor
	{
		z = a;
		x = b;
	}
	
	void display() 
	{
		System.out.println(x+z);
	}
	
	public static void main(String[] args) {
		
		//Invokes default constructor
		Constructors obj1 = new Constructors();
		obj1.display();
		
		//Invokes Parametersied constructor
		Constructors obj2 = new Constructors(250,450);
		obj2.display();
	}

}
