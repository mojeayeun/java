package package2;

public class FinalClass {
	
	public final String finalString ;  //final field have to be initialized in declare area or in constructor
	
	public FinalClass(String finalString) {
		this.finalString = finalString;
	}

	public final void finalMethod(){
		
	}
	
	public  void normalMethod(){
			// finalString = "xxxx"; //final data can not be assign new value
	}
	

}
