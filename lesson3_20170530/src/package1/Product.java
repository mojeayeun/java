package package1;

public class Product {
	
	private float mPrice;  //Use in class
	public int mCode;		//Use in anywhere
	protected int mProtectedCode;	//Use in same package and to subclass
	int mNoKeyword;	//Use in same package
	
	//Create Accessors for Price
	public float getPrice() {
		return mPrice;
	}

	public void setPrice(float price) {
		mPrice = price;
	}
	

	public float scan(int code){
		System.out.println("price is" + 100);
		return 100;
	}
}


