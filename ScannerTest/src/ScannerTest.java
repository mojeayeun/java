import java.util.Scanner;

public class ScannerTest {

	String userName;
	String lastName;
	String fullName;
	int age = 0;
	
	public static void main(String[] args){
		
		
		ScannerTest st = new ScannerTest();
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your age?");
		
		try{
			st.age = sc.nextInt();
		}catch(Exception e){
			e.toString();
			//e.printStackTrace();
		}finally{
			//System.out.println("error occur");
		}
		
		System.out.println("What is your Name?");
		
		st.userName = sc.next();
		st.lastName = sc.next();
		
		System.out.println("What is your full name?");
		st.fullName = sc.nextLine();

		sc.close();

		System.out.println("Age is " + st.age);
		System.out.println("username is " + st.userName);
		System.out.println("lastname is " + st.lastName);
		System.out.println("fullname is " + st.fullName);
				
		
	}
	
}
