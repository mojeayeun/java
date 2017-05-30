
//public class L3this {
//
//	
//	static class Humans{
//		String humanName;
//		int humanAge;
//		
//		public Humans(String humanName, int humanAge){
//			this.humanName = humanName;
//			this.humanAge = humanAge;
//		}
//		
//	}
//	
//	public static void main(String[] args) {
//		
//		Humans h = new Humans("andy", 20);
//		System.out.println("Name : " + h.humanName);
//		System.out.println("Age : " + h.humanAge);
//		
//		
//	}
//	
//}


class Humans{
	String humanName;
	int humanAge;
	
	public Humans(String humanName, int humanAge){
		this.humanName = humanName;
		this.humanAge = humanAge;
	}
		
}

public class L3this {
	
	public static void main(String[] args) {
		
		Humans h = new Humans("andy", 0);
		System.out.println("Name : " + h.humanName);
		System.out.println("Age : " + h.humanAge);
		
		
	}
	
}