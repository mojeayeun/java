package homework;

//final class
public final class Rav4 extends SUV {
	
	//Variables , Accessors
	private String mCarName;
	private String mCarNumber;
	public static final String mCarType = "SUV";
	

	public Rav4(String mCarName, String mCarNumber){
		this.mCarName = mCarName;
		this.mCarNumber = mCarNumber;
	}
	
	public void checkSystem(){
		System.out.println(mCarName+ "("+ mCarNumber +")" + "Car checkSystem RAV4");
	}

	//Encapsulation
	public String getCarName() {
		return mCarName;
	}

	public String getCarNumber() {
		return mCarNumber;
	}
	
}
