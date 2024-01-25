import java.util.ArrayList;

public class forloopmultiply {

	public static void main(String[] args) {
		
			//Array list
			ArrayList<String> a = new ArrayList<String>();
			a.add("Shakkila");
			a.add("Ansari");
			a.add("Aahil");
			a.add("Ansari");
			a.remove(2);
			
			for (int i=0; i < a.size(); i++) {
			System.out.println(a.get(i));
			}
			System.out.println("*****************");
			for ( String val : a) {
				System.out.println(val);
			}
			System.out.println("*****************");
			// tO CHECK IF ANY Particular value is present in Array;
			System.out.println(a.contains("Shakkila1"));
			System.out.println("*****************");
			//String in array
			String s = "Shakkila Ansari Haleem";
			String[] splittedString = s.split(" ");
			
			System.out.println(splittedString[0]);
			System.out.println(splittedString[1].trim());
			System.out.println(splittedString[2].trim());
			for (int i=0;i<s.length();i++)
			{
				System.out.println(s.charAt(i));
			}
			System.out.println("*****************");	
	}
}
	
	
	

