//[211511050] Nasrulloh Fajar Muharam
package soal2;

import java.util.Scanner;

public class input_output2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("==============================");
		
		for(int i=0; i<3;i++) {
			String n =s.next();
			int x = s.nextInt();
			System.out.printf("%-15s%03d%n", n, x);
		}
		
		System.out.println("==============================");
	}
}
