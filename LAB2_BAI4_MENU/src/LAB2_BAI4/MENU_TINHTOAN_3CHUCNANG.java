package LAB2_BAI4;
// Scanner
import java.util.Scanner;


public class MENU_TINHTOAN_3CHUCNANG {
	
	// Hàm tính Phương trình bậc nhất
	public static void PTB1() {
		
		// Khai báo Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu nhập dữ liệu từ người dùng
		System.out.print("Chương trình giải pt bậc 1: ax + b = 0\n");
		System.out.print("Xin mời nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Xin mời nhập b: ");
		double b = scanner.nextDouble();
		
		// Giải và biện luận nghiệm của phương trình
		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình có VSN");
			} else {
				System.out.print("Phương trình VN");
			}
		} else {
			System.out.printf("Phương trình có nghiệm x = -b/a = %.2f", -b/a);
		}
	}
	
	// Hàm tính phương trình bậc hai
	public static void PTB2() {
		// Scanner
		Scanner scanner = new Scanner(System.in);
		// Program Name
		System.out.print("Chương trình giải pt bậc 2: ax^2 + bx + c = 0\n");
		
		// Yêu cầu người dùng nhập dữ liệu cho 3 biến a, b, c
		System.out.print("Xin mời nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Xin mời nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Xin mời nhập c: ");
		double c = scanner.nextDouble();
		
		// TH1
		if (a == 0) {
			PTB1();
			return;
		}
		
		double delta = Math.pow(b, 2) - 4*a*c;
		if (delta < 0) {
			System.out.print("Phương trình VN");
		} else if (delta == 0) {
			double x = -b/ (2*a);
			System.out.printf("Phương trình có nghiệm kép x1 = x2 = %.2f", x);
		} else {
			double x1 = (-b - Math.sqrt(delta)) / (2 * a);
			double x2 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f và x2 = %.2f", x1, x2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo Scanner để nhận dữ liệu từ người dùng
		Scanner scanner = new Scanner(System.in);
		byte luaChon;
		
		do {
			// Hiển thị menu
			System.out.println("=====MENU=====");
			System.out.println("1. Giải phương trình bậc nhất ax + b = 0");
			System.out.println("2. Giải phương trình bậc 2 ax^2 + bx + c = 0");
			System.out.println("3. Tính tiền điện");
			System.out.println("4. Thoát chương trình");
			System.out.println("Xin mời nhập lựa chọn/chức năng: ");
			
			luaChon = scanner.nextByte();
			
			// Xử lí
			switch (luaChon) {
			case 1: PTB1(); break;
			case 2: PTB2(); break;
			case 3: 
			}
		}
		
	}

}
