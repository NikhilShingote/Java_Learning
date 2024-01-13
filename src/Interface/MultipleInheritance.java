package Interface;

// we have to use implements keyword in multiple inheritance
interface abc
{
	int x=100;
	
	void m1();
}

interface xyz
{
	int y=147;
	
	void m2();
}


public class MultipleInheritance implements abc,xyz {  // here abc and xyz are parent class of multipleinheritanc eclass
	
	public void m1()
	{
		System.out.println(x);
	}
	
	public void m2()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		MultipleInheritance test = new MultipleInheritance();
		test.m1();
		test.m2();

	}

}
