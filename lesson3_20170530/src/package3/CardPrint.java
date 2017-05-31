package package3;

import java.util.ArrayList;
import java.util.Random;

public class CardPrint {

	class CardPackage{
		String name;
		String card[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A" };
		
		public CardPackage(String name){
			this.name = name;
		}
	}

	
	
	public static void main(String[] args) {
		
		String cardType[] = {"SPADE","DIAMOND","HART","CROBA"};
		String card[] = {"2","3","4","5","6","7","8","9","10","J","Q","K","A" };
		
		for (int i=0; i < 4; i++){
			for (int j = 0 ; j < 13 ; j++){
				System.out.print(cardType[i] + " " +card[j].toString() + ",");
			}
			System.out.println("");
		}
		
		CardPrint cprint = new CardPrint();
		//CardPackage cpackage = cprint.new CardPackage("SPADE");
		
		ArrayList<CardPackage> arraylistobject = new ArrayList<CardPackage>();
			
		
		arraylistobject.add(cprint.new CardPackage("SPADE"));
		arraylistobject.add(cprint.new CardPackage("DIAMOND"));
		arraylistobject.add(cprint.new CardPackage("HART"));
		arraylistobject.add(cprint.new CardPackage("CROBA"));
		
		System.out.println("This is arraylist");
		
		for(CardPackage cpackage : arraylistobject){
			for (int k = 0 ; k < 13 ; k++){
				System.out.print(cpackage.name + " " + cpackage.card[k].toString() + ",");
			}
			System.out.println();
			
		}
		
		Random random = new Random();
		
		System.out.println(random.nextInt(3));
		System.out.println(random.nextInt(12));
		
		System.out.println("This is arraylist using random function");
		
		int n = 0;
		while (n < 10){
			
			int cType = random.nextInt(3);
			int cNum  = random.nextInt(12);
			
			//System.out.println("Random cType " + cType + " ==== cNum" + cNum);
			
			int m = 0;
			for(CardPackage cpackage : arraylistobject){
				if (cType == m) {
					System.out.println("Random Data " + cpackage.name + " " + cpackage.card[cNum].toString() + ",");
					break;
				}
				m++;
			}
			n++;
		}
		
		
		
		
		
		
		
		
		
	}
}
