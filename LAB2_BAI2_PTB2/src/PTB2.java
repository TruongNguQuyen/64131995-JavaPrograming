
import java.util.Scanner;

	// Lớp giải phương trình bậc 1
class PTB1{
	//	Phương trình bậc nhất: ax + b = 0
	public void PTB1(double a, double b) {
		if (a == 0) {
			if (b == 0) {
				System.out.print("Phương trình có VSN");
				
			}
			else {
				System.out.print("Phương trình VN");
			}
		}
		else {
			System.out.printf("Nghiệm của phương trình x = -b/a = %.2f/n", (-b/a));
		}
	}
	
}

public class PTB2 extends PTB1 {
	// Phương trình bậc nhị: ax2 + bx + c
	public void PTB2(double a, double b, double c) {
		if (a == 0) {
			// Phương trình quay về phương trình bậc nhất
			PTB1(b, c);
		} else {
			double del = Math.pow(b, 2) - 4*a*c;
			
			if  (del < 0) { 
				System.out.print("Phương trình VN");
			}
		}
	}
	

}
