import java.util.Arrays;
import java.util.Scanner;

public class MANG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tạo scanner
		Scanner scanner = new Scanner(System.in);
		
		// Yêu cầu nhập số lượng phần tử của mảng
		System.out.print("Xin mời nhập số lượng phần tử mảng: ");
		int n = scanner.nextInt();
		
		// Yêu cầu nhập giá trị cho các phần tử của mảng
		int[] a = new int[n];
		System.out.println("Xin mời nhập các phần tử của mảng: ");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		// Sắp xếp mảng a
		Arrays.sort(a);
		
		// Xuất mảng vừa nhập ra màn hình
		System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(a));
		
		// Xuất ra phần tử bé nhất
		System.out.println("Phần tử bé nhất là: " + a[0]);
		
		// Tính trung bình cộng các phần tử chia hết cho 3
		int sum = 0;
		int dem = 0;
		for (int x : a) {
			if (x % 3 == 0) {
				sum += x;
				dem++;
			}
		}
		
		// Xuất trung bình cộng các phần tử chia hết cho 3
		if (dem > 0) {
			double TBCong = (double) sum/dem;
			System.out.printf("Trung bình cộng các phần tử chia hết cho 3: %.2f", TBCong);
		} else {
			System.out.print("Không có phần tử nào trong mảng chia hết cho 3");
		}
		
		// Đóng scanner
		scanner.close();
	}

}
