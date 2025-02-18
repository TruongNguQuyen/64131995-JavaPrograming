import java.util.Scanner;

public class TINH_TIEN_DIEN {
	
	// Chương trình tính tiền điện, có một tham số đầu vào
	
	// Tinh tien dien duoi 50
	public int DUOI50(int a) {
		return a * 1000;
	}
	public int TREN50(int a) {
		return a * 1200;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo scanner để nhập dữ liệu từ bàn phím
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Chương trình tính tiền điện \n");
		
		// Yêu cầu người dùng nhập vào số điện sử dụng
		int soDien;
		do {
		System.out.print("Xin mời nhập số điện: ");
		soDien = scanner.nextInt();
		} while (soDien < 0);
		
		TINH_TIEN_DIEN tinhTien = new TINH_TIEN_DIEN();
		if (soDien < 50) {
			System.out.print("Số tiền điện là: "+ tinhTien.DUOI50(soDien));
		}
		else {
			System.out.print("Số tiền điện là: "+ (tinhTien.DUOI50(50) + tinhTien.TREN50(soDien - 50)));
		}
		
		// Đóng scanner
		scanner.close();
	}
}
