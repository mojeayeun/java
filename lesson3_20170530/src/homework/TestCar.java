package homework;

public class TestCar {
	
	
	public static void main(String[] args) {
		
		Rav4 rav4_1 = new Rav4("Andy","L001");
		Rav4 rav4_2 = new Rav4("Kim","L002");
		
		System.out.println("[" + Rav4.mCarType + "]" + rav4_1.getCarName() + "-" + rav4_1.getCarNumber() + " start");
		
		rav4_1.checkSystem();	//start key
		rav4_1.go();			//go
		rav4_1.stop();			//stop
		
		System.out.println("[" + Rav4.mCarType + "]" + rav4_2.getCarName() + "-" + rav4_2.getCarNumber() + " start");
		rav4_2.checkSystem();	//start key
		rav4_2.use4WD();		//go
		rav4_2.stop();			//stop
		
			
	}
}
