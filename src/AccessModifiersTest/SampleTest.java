package AccessModifiersTest;
import AccessModifiers.Practice;

//here we are accessing protected variables from Practice  class and access modifiers package
//Accessing methods and variables from other packages we need PROTECTED keyword

public class SampleTest extends Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleTest S = new SampleTest();
		S.data = 28;
		S.m1();
	}

}
