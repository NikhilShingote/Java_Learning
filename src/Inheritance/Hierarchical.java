package Inheritance;

class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	int x;
	void print()
	{
		System.out.println(x);
	}
}

class child2 extends Parent
{
	int y;
	void show()
	{
		System.out.println(y);
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.a = 23;
		c1.x = 45;
		c1.display();
		c1.print();
		
		child2 c2 = new child2();
		c2.a = 123;
		c2.y = 845;
		c2.display();
		c2.show();
		

	}

}
