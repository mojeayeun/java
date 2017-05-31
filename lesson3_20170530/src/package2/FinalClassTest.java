package package2;

public class FinalClassTest extends FinalClass{

	
	public FinalClassTest(String finalString) {
		super(finalString);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void normalMethod() {
		// TODO Auto-generated method stub
		super.normalMethod();
		
		// super.finalString = "abc";  final data can not be assign new value
	}

	
	
}
