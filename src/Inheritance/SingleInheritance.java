package Inheritance;

class A // Parent class/super class
{
	int a;
	
	void display() 
	{
		System.out.println(a);
	}
}

class B extends A  // child class
{
	int b;
	
	void print() 
	{
		System.out.println(b);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		/*
		A obj = new A();
		obj.a = 100;
		obj.display();
		*/
		B obj1 = new B();
		obj1.a=20;
		obj1.b=30;
		obj1.display();
		obj1.print();

	}

}
