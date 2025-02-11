/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập các hệ số a, b, c của pt bậc 2
		System.out.print("Xin mời nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Xin mời nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Xin mời nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		// Tính delta
		double delta = Math.pow(b, 2) - 4*a*c;
		
		// In ra delta và căn delta
		System.out.println("Delta: " + delta);
		System.out.printf("Căn của delta: %.2f", Math.sqrt(delta));
		
		// Đóng scanner
		scanner.close();
	}

}
