package Inheritance;

class animal // Parent class/super class
{
	int a;
	
	void display() 
	{
		System.out.println(a);
	}
}

class dog extends animal  // child class
{
	int b;
	
	void print() 
	{
		System.out.println(b);
	}
}

class labrador extends dog  // child class
{
	int c;
	
	void show() 
	{
		System.out.println(c);
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		/*
		A obj = new A();
		obj.a = 100;
		obj.display();
		
		B obj1 = new B();
		obj1.a=20;
		obj1.b=30;
		obj1.display();
		obj1.print();
		*/
		
		labrador obj2 = new labrador();
		obj2.a = 28;
		obj2.b = 36;
		obj2.c = 50;
		obj2.display();
		obj2.print();
		obj2.show();

	}

}
