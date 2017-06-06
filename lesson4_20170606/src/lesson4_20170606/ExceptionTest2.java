package lesson4_20170606;

public class ExceptionTest2 {

	public ExceptionTest2() {
		// TODO Auto-generated constructor stub
	}

	
	
	public static void main(String[] args) {
	
		ExceptionTest2 e2 = new ExceptionTest2();
		
		try {
			if (true) e2.method1();
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("final process at method1");
		}
		
		try {
			if (true) e2.method2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("final process at method2");
		}
		
		try {
			e2.method3();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.getCause();
			e.printStackTrace();
		}finally{
			System.out.println("final process at method3");
		}
		
	}
	
	public void method1() throws CustomerException{
		throw new CustomerException("method1 call exception");
	}
	
	
	public void method2() throws Exception{
		throw new CustomerException("method2 call exception");
	}
	

	public void method3() throws Throwable {
		throw new Throwable("method3 call exception");
	}

	
	
}
