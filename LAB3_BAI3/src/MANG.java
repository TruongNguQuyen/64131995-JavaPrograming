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
		System.out.print("Mảng sau khi sắp xếp: " + Arrays.toString(a));
	}

}
