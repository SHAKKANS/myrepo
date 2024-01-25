
public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mynum = 5;
		String myletter = "Hello World";
		double dec = 8.99;
		boolean check = true;
		int[] arr = new int[5];
		arr[0]=3;
		
		int[] arr1= {3,5,3,8,0};
		String[] name= {"Raj","Rahul","Shetty"};		
		
		System.out.println("Print value of mynum is " + mynum);
		System.out.println("Array value is " + arr[0]);
		System.out.println("Array value is " + arr1[3]);
		
		//for loop
		for (int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		
		// FOR STRING LOOP
		for ( String s: name)
		{
			System.out.println(s);
		}
	}

}
