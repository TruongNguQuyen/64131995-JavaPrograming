import java.util.Scanner;

public class MAINCLASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo Scanner để nhập dữ liệu từ người dùng
		Scanner scanner = new Scanner(System.in);
		PTB2 pt = new PTB2();
		
		// In ra tên chương trình
		System.out.print("Chương trình giải phương trình bậc 2: dạng ax^2 + bx + c = 0");
		
		// Yêu cầu người dùng nhập dữ liệu cho 3 tham số a, b, c
		System.out.print("Xin mời nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Xin mời nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Xin mời nhập c: ");
		double c = scanner.nextDouble();
		
		// giải phương trình bậc 2
		pt.PTB2(a, b, c);
		
		// Đóng scanner lại
		scanner.close();
	}

}
