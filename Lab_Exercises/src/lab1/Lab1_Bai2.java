/**
 * 
 */
package lab1;

/**
 * 
 */
import java.util.Scanner;
public class Lab1_Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo đối tượng scanner để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập chiều dài và chiều rộng của hình chữ nhật
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
		double chieuDai = scanner.nextDouble();
		
		System.out.print("Nhập chiều rộng của hình chữ nhật: ");
		double chieuRong = scanner.nextDouble();
		
		// Tính chu vi
		double chuVi = 2 * (chieuDai + chieuRong);
		
		// Tính diện tích
		double dienTich = chieuDai * chieuRong;
		
		// Xác định cạnh nhỏ nhất
		double canhNhoNhat = Math.min(chieuDai, chieuRong);
		
		// Xuất kết quả
		System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
		System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
		System.out.print("Cạnh nhỏ nhất của hình chữ nhật là: " + canhNhoNhat);
		
		// Đóng scanner
		scanner.close();
	}

}
