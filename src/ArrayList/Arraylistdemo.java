package ArrayList;

import java.util.ArrayList; // java.util is a package and ArrayList is a predefined class which we access

public class Arraylistdemo {
	
	public static void main(String[] args) {
		
		//how to declare array list
		// ArrayList list = new ArrayList(); // we can store any type of elements here
		// here we can store specific type of data type
		// ArrayList<Integer> list = new ArrayList<Integer>(); // accessing Arraylist class through object and giving the data type we want to store
		ArrayList<String> list = new ArrayList<String>();
		
		//Adding value to arraylist
		// we have method called add in Arraylist class
		
		list.add("Wow");
		list.add("here");
		list.add("i am");
		list.add("Nikhil");
		
		// how to get size
		System.out.println(list.size());
		System.out.println(list);
		// remove specific elements
		list.remove(1);
		System.out.println(list.size());
		System.out.println(list);
		
		//Insert new elements in middle of arraylist
		list.add(1,"this is cool");
		System.out.println(list.size());
		System.out.println(list);
		
		//read values from arraylist using for loop
		for(String s:list)     // for storing different types of elements you can use Object data type instead of string
		{
			System.out.println(s);
		}
	}

}
