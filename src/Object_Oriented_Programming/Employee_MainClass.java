package Object_Oriented_Programming;

public class Employee_MainClass {

	public static void main(String[] args) {
			
			Employee obj1 = new Employee();
			obj1.eid = 101;
			obj1.name = "nikhil";
			obj1.sal = 4000.45;
			obj1.deptno = 858;
			obj1.job = "manager";
			obj1.display();
			
			Employee obj2 = new Employee();
			obj2.eid = 103;
			obj2.name = "pratik";
			obj2.sal = 6045.54;
			obj2.deptno = 345;
			obj2.job = "analyst";
			obj2.display();
		}

}
