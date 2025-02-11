/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * 
 */
public class Lab1_Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập họ và tên sinh viên
        System.out.print("Nhập họ và tên sinh viên: ");
        String fullName = scanner.nextLine();

        // Yêu cầu người dùng nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double averageScore = scanner.nextDouble();

        // Xuất ra màn hình họ và tên cùng với điểm trung bình trên cùng một dòng
        System.out.println("Họ và tên sinh viên: " + fullName + ", Điểm trung bình: " + averageScore);

        // Đóng Scanner
        scanner.close();

	}

}
