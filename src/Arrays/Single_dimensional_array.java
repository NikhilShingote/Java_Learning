package Arrays;

public class Single_dimensional_array {

	public static void main(String[] args) {
		//declare array with size 5
		// int a[] = new int[5];
		
		//storing and inserting values into this array
		/*a[0] = 8;
		a[1] = 263;
		a[2] = 13;
		a[3] = 823;
		a[4] = 34;*/
		
		// in single statement also we can write
		// we don't need to declare the size here
		int a[] = {133,54,787,43,85};
		
		// Length of array
		System.out.println("Length of array is: "+a.length);
		
		//For reading values
		/*for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//read values using enhanced for loop
		// This is designed for arrays only
		for(int i:a)
		{
			System.out.println(i);
		}
	}

}
