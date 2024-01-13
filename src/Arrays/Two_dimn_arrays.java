package Arrays;

public class Two_dimn_arrays {

	public static void main(String[] args) {
		//declaring multidimn arrays
		int a[][] = new int[3][2];
		
		a[0][0] = 323;
		a[0][1] = 454;
		
		a[1][0] = 74;
		a[1][1] = 67;
		
		a[2][0] = 4;
		a[2][1] = 7;
		

		//int a[][] = { {34,7}, {5,786}, {56,7} };

		// number  of rows
		System.out.println("Number of rows: "+a.length);
		
		// number of columns
		System.out.println("Number of columsn: "+ a[0].length);
		
		// how to read the values from this arrays
		// 1. Classic for loop
		/*
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		
		// 2. Enhanced for loop
		// here a will store the whole row values(2) and those values can be stored in an array 'r'
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.print("["+i+"]"+" ");
			}
			System.out.println();
		}
	}

}
