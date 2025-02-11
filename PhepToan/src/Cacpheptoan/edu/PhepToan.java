/**
 * 
 */
package Cacpheptoan.edu;

import java.util.Scanner;

/**
 * 
 */
public class PhepToan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Tạo một đối tượng Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Nhập giá trị a
		System.out.print("Xin mời nhập số a: ");
		int a = scanner.nextInt();
		
		// Nhập giá trị b
		System.out.print("Xin mời nhập số b: ");
		int b = scanner.nextInt();
		
		// Tính tổng a và b
		int c = a + b;
		
		// In ra ket qua
		System.out.print("Tổng của a và b là: "+c);
		
		// dong scanner
		scanner.close();
	}

}
