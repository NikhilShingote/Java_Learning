package Object_Oriented_Programming;

public class Student_MainClass {

	public static void main(String[] args) {
		
		Student stu1 = new Student(111,"john",'A');  // creating object
		
		// 1. assign values using reference variables
		/*
		stu1.sid = 103;
		stu1.sname = "pudi";
		stu1.grade = 'D';
		stu1.display();
		*/
		
		// 2. assign values using Method
		//stu1.info(112, "attarde", 'C');
		stu1.display();
		
		// 3. assign values using Constructor
		// IN this we have to pass values during object creation as we did above.
	}

}
