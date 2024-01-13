package Object_Oriented_Programming;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	
	//Constructor name should be same as class name
	Student(int id,String name,char gr) //CONSTRUCTOR
	{
		sid = id;
		sname = name;
		grade = gr;
	}
	
	void info(int id,String name,char gr) // METHOD
	{
		sid = id;
		sname = name;
		grade = gr;
	}
	
	void display()
	{
		System.out.println(sid+" "+sname+" "+grade);
	}

}
