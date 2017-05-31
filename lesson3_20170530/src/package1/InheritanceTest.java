package package1;

public class InheritanceTest {
	
	Product p1 = new Product();
	
	public void test(){
		
		p1.mCode = 1;
		p1.mProtectedCode = 1;
		p1.mNoKeyword = 1;
	}
	
	public static void main(String[] args) {
		Product product = new Product();
		
		product.mCode  = 1;
		
		product.setPrice(1);
		float a = product.getPrice();

		System.out.println("price" + a);
		
		product.mProtectedCode = 1;
		
		System.out.println("mProtectedCode===" + product.mProtectedCode);
		
		
		Electronics e = new Electronics();
		e.mProtectedCode = 1;
		
		System.out.println("class getName : " + e.getClass().getName());
		System.out.println("class toString : " +e.getClass().toString());
		
		System.out.println(e instanceof Product);
		System.out.println(e instanceof Electronics);
		
	}
}
