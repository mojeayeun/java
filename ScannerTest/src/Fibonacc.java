import java.util.Scanner;

public class Fibonacc {

	
	private static int j;

	public static void main(String[] args) {
		
		System.out.println("Please Insert Number more than 2");
		
		Scanner sc = new Scanner(System.in);
		int loopCnt = sc.nextInt();
		
		System.out.println("Loop Count: " + loopCnt);
		
		
		int i = 1 , fisrtNumber = 0, secondNumber= 0, total= 0;
		
				
		//0,1,1,2,3,5,8
		while(i <= loopCnt){
	
			total = fisrtNumber + secondNumber;
			
			if (i != loopCnt){
				System.out.print(total+" , ");
			}else{
				System.out.print(total);
			}
			
			if (fisrtNumber == 0) secondNumber = 1;
			
			fisrtNumber = secondNumber;			
			secondNumber = total;
						
			i++;
		}
		

		System.out.println("\n");
		
		int j=0,k=0;
	
		while(j < loopCnt){
		  while(k <= j){
				System.out.print("*");
				k++;
		  }
		  System.out.println("");
		  j++;
		  k=0;
		}
		
		
	}
	
	
}
