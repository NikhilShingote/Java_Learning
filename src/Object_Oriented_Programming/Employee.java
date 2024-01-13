package Object_Oriented_Programming;

public class Employee {
	
	int eid;
	String name;
	double sal;
	int deptno;
	String job;
	
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}
	

} // As we cannot share the class containing the main method , we need to create another class with the main method.
  // through that main method we will call this class and assign value to variables.
