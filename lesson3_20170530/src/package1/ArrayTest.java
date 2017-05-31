package package1;
public class ArrayTest {

	static int classSize = 13;
	static String classUserName = "andymo";
	
	static int[] classSizeArray = {1,2,3,4,5,6,7,8,9,10};
	static String[] classUserNameArray = {"andy","andy2","andy3"};
	
	
	int[] students_1 = new int[13];
	int[] students_2 = {1,2,3,4,5,6,7};
	
	public static void main(String[] args){
		
		System.out.println("classSize:" + classSize);
		System.out.println("classUserName:" + classUserName);
		
		for(int classSizeItem : classSizeArray){
			System.out.println(classSizeItem);
			
		}
		
		for (String classUserNameItem : classUserNameArray){
			System.out.println(classUserNameItem);
		}
		
		
	}
	
	
	
}
