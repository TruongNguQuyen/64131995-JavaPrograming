
public class BangCuuChuong {
	// Hàm in ra bảng cửu chương
	public static void BCC() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In ra tên chương trình
		System.out.print("Chương trình in ra bảng cửu chương từ 1 - 9\n");
		
		// In ra các bảng cửu chương
		BCC();
		System.out.print("Thank for watching!");
		
	}

}
