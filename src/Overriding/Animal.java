package Overriding;

public class Animal {
	
	String color = "white";
	
	void eat()
	{
		System.out.println("eating");
	}
	
	Animal()  //parent class constructor
	{
		System.out.println("Animal constructor is created");
	}

}

class dog extends Animal
{
	String color = "Black";
	
	dog()  // child class constructor
	{
		System.out.println("dog constructor is created");
	}
	
	void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	
	void eat()
	{
		System.out.println("drinking");
		super.eat();
	}
}
