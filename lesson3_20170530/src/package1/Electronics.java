package package1;

public class Electronics extends Product{
	public int mVoltage;
	public boolean mBattery;
	
	//Override Test
	@Override
	public float scan(int code) {
		System.out.println("Yor are in Electronics and The Price is " + 200);
		// TODO Auto-generated method stub
		return 200;
	}
	
	public static void main(String[] args) {
		Electronics e = new Electronics();
		e.scan(1);  //call child method
		e.mProtectedCode = 1;
	}
	
	

}
