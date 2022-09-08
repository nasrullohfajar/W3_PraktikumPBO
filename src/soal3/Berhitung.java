//[211511050] Nasrulloh Fajar Muharam
package soal3;

import java.io.*;
import java.util.*;

public class Berhitung {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A, B;
		String s = scan.nextLine();
		scan.close();
		
		s = s.trim();
		if (s.length() == 0) {
			System.out.println(0);
		} else {
			String[] strings =s.split(" ");
			A = Integer.parseInt(strings[0]);
			B = Integer.parseInt(strings[2]);
			
			if (A >= 1 && B<= 1000) {
				if (strings[1].equals("+")) {
					System.out.println(A+B);
					
				} else if (strings[1].equals("-")) {
					System.out.println(A-B);
					
				} else if (strings[1].equals("*")) {
					System.out.println(A*B);
					
				} else if (strings[1].equals("/")) {
					if ((A%B) == 0) {
						System.out.println(A/B);
						
					} else {
						System.out.println("error");
					}
				} else if (strings[1].equals("%")) {
					System.out.println(A%B);
				} else {
					System.out.println("error");
				}
			} else {
				System.out.println("error");
			}
		}
	}
}
