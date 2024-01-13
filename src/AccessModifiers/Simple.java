package AccessModifiers;


// Private keyword access modifier is accessible only within class
// Default access modifier is accessible only within package
// protected modifiers is accessible within the package and outside the package but through inheritance
class A
{
	//PRIVATE
	//private int data = 34;
	//private void m1(){}
	
	//DEFAULT
	int data = 34;   // this are default access modifiers
	void m1(){}      // this are default access modifiers
	
	{
		System.out.println(data);
	}
}

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		obj.data = 22;    // gives error as variable(data) is private
		obj.m1();      // gives error as method m1 is  private

	}

}
