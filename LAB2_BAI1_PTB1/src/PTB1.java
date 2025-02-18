import java.util.Scanner;

public class PTB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Khai báo Scanner để nhập dữ liệu từ người dùng
		Scanner scanner = new Scanner(System.in);
		
		// Phương trình bậc nhất có dạng ax + b = 0, nhận 2 tham số đầu vào a, b
		
		// Yêu cầu người dùng nhập giá trị cho 2 biến a, b
		System.out.print("Xin mời nhập a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Xin mời nhập b: ")
		double b = scanner.nextDouble()
		
		// Giải và biện luận phương trình bậc nhất
		if (a == 0) {
			if (b == 0) {
				System.out.print("> Phương trình có vô số nghiệm");
			}
			else {
				System.out.print("> Phương trình vô nghiệm");
			}
		}
		else {
			System.out.printf("> Nghiệm của phương trình x = -b/a = %.2f" + (-b/a));
		}
	}

}
