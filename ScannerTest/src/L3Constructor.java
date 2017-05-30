
public class L3Constructor {
	
	public int number1;
	private int number2;
	private int number3;
	
	public L3Constructor() {
		number1 = 1;
		number2 = 2;
	}
	
	public L3Constructor(int number1){
		this.number1 = number1;
	}
	
	public L3Constructor(int number1,int number2){
		this.number1 = number1;
		this.number2 = number2;
	}
	
	//Methods
	public void doSomething(){
		System.out.println("You are inside a method called printSomething");
	}
	
	
	public void doSomething(String arg){
		System.out.println("Argument is this : " + arg);
	}

	
	//get & set
	public int getNumber2(){
		return this.number2;
	}
	
	public void setNumber2(int number2){
		this.number2 = number2;
	}
	
	//auto created	
	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public static void main(String[] args) {
		L3Constructor l3c = new L3Constructor(1,2);
		System.out.println(l3c.number1 + "," + l3c.number2);
		
		l3c.doSomething();
		l3c.doSomething("test argument");
		
		l3c.number1 = 1;
		l3c.number2 = 2;
		
		System.out.println("one more" + l3c.number1 + "," + l3c.number2);
		
		
		
	}
	

}
