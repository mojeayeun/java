package lesson4_20170606;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		File file = new File("a.txt");
		
		System.out.println(file.exists());
		Scanner sc = null;
		
			
		
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sc.close();
		}
		
	}
}
