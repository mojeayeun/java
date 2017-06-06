package lesson4_20170606;

public class Test3 {

	public Test3() {
		// TODO Auto-generated constructor stub

	}

	
	public static void main(String[] args) {
		
		String a = null;
		String b = "1243";
		
		
		try{
			if (a.equals(b)) {
				System.out.println("a==b");
		}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("complete my work");
		}
				
	}
}
