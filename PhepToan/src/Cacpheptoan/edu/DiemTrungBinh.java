/**
 * 
 */
package Cacpheptoan.edu;

import java.util.Scanner;

/**
 * 
 */
public class DiemTrungBinh {
	public static void main(String[] args) {
		// Tạo một đối tượng Scanner để nhập dữ liệu từ người dùng
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập điểm môn a
		System.out.print("Nhập điểm của môn a: ");
		double a = scanner.nextDouble();
		
		// Yêu cầu người dùng nhập điểm của môn b
		System.out.print("Nhập điểm của môn b: ");
		double b = scanner.nextDouble();
		
		// Yêu cầu người dùng nhập điểm của môn c
		System.out.print("Nhập điểm của môn c: ");
		double c = scanner.nextDouble();
		
		// Tính điểm trung bình với hệ số 2 cho môn a
		double DiemTrungBinh = (a*2 + b + c)/4;
		
		// In ra điểm trung bình
		System.out.print("Điểm trung bình là: "+ DiemTrungBinh);
		
		// Đóng
		scanner.close();
	}

}
