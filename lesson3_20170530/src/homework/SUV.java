package homework;

public class SUV extends Car{
	
	public SUV(){
		
	}

	//override
	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("SUV is drving using SUV Engine & 2WD");
	}

	//override
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("SUV is stop");
	}
	
	//4WD
	public void use4WD(){
		System.out.println("SUV is drving using SUV Engine & 4WD");
	}
	
		
}
