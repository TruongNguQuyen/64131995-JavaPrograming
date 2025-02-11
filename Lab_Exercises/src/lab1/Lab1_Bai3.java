/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập vào chiều dài một cạnh của hình lập phương
		System.out.print("Nhập vào độ dài một cạnh của hình lập phương: ");
		double doDai = scanner.nextDouble();
		
		// Tính thể tích của hình lập phương
		double theTich = Math.pow(doDai, 3);
		
		// In ra thể tích của hình lập phương
		System.out.print("Thể tích của hình lập phương là: " + theTich);
		
		// Đóng scanner
		scanner.close();
	}

}
