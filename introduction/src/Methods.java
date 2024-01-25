
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methods m = new Methods();
		String name = m.getData();
		System.out.println(name);
		Method2 m2= new Method2();
		m2.getuserdata();

	}
	
	public String getData() {
	System.out.println("This is a method");
		return "Shakkila Ansari";
	}
}
