package package2;

import package1.Edibles;
import package1.Product;

public class TestProcted {
	
	Product p1 = new Product();
	
	public void test(){
		p1.mCode = 1;
		p1.mProtectedCode = 1;  //because of protected variable
	}
	
	
	public static void main(String[] args) {
		
		
	}
}
