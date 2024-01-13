package Overriding;

// you cannot change the value of variable with final keyword
//you cannot change the value of method(cannot override) 	with final keyword

public class Final_keyword {
	
	final int speed = 47;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_keyword obj = new Final_keyword();
		obj.speed = 70;  //compile time error as variable is final and cannot be changed
		System.out.println(obj.speed);
	}

}
