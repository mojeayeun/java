package package1;

public class StaticClass {

	public static String Species = "Human";
	public static String Planet = "Earth";
	public String Name;
	
	//try creating a static block
	static{
		Species = "Human2";
		Planet = "Earth2";
		
	}
	
	public static void main(String[] args) {
		System.out.println(Species);
	}
	
}
