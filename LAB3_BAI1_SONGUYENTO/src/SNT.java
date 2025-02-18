import java.util.Scanner;
public class SNT {
	// Hàm kiểm tra một số có là nguyên tố hay không
	public static boolean KT_SONGUYENTO(int a) {
		if (a <= 1)
			return false;
		
		for (int i = 2; i <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Tạo Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu người dùng nhập dữ liệu
		System.out.print("Xin mời nhập một số: ");
		int a = scanner.nextInt();
		
		if (KT_SONGUYENTO(a)) {
			System.out.print(a  + " là số nguyên tố");
		} else {
			System.out.print(a  + " không phải là số nguyên tố");
		}
		
		// Đóng scanner lại
		scanner.close();
	}
}
