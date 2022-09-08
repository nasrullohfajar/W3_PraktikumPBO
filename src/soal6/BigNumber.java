//[211511050] Nasrulloh Fajar Muharam
package soal6;

import java.io.*;
import java.util.*;
import java.math.*;

public class BigNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a, b;
		a = scan.nextLine();
		b = scan.nextLine();
		scan.close();

		System.out.println(new BigInteger(a).add(new BigInteger(b)));
		System.out.println(new BigInteger(a).multiply(new BigInteger(b)));
	}

}
