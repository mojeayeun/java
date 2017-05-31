package package1;

public class Edibles  {
	
	Product p = new Product();
	
	public void test(){
		p.mCode = 1;
		p.mProtectedCode = 1;  //can access in same package
	}
	
	
	public static void main(String[] args) {
		
		Edibles e = new Edibles();
		e.test();
		e.p.mProtectedCode = 1;
		
		System.out.println("value : " + e.p.mProtectedCode);
		
	}
	
}
