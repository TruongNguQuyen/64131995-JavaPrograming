import java.util.ArrayList;

public class CT {

	public static void main(String[] args) {
		
		// Khai báo danh sách sản phẩm
		ArrayList<SanPham> dsSanPham;
		dsSanPham = new ArrayList<SanPham>();
		
		SanPham sp1 = new SanPham(1, "Coca cola", "Đồ uống", "cccl.jpg");
		SanPham sp2 = new SanPham(2, "Bánh mì", "Thức ăn nhanh, ẩm thực", "bm.jpg");
		SanPham sp3 = new SanPham(3, "Rượu vang", "Đồ uống có cồn", "rv.jpg");
		SanPham sp4 = new SanPham(4, "Bánh tráng nướng", "Đồ ăn vặt", "btn.jpg");
		
		// Thêm các sản phẩm vào danh sách
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		dsSanPham.add(sp4);
		
		// In ra các sản phẩm
		for (SanPham x : dsSanPham)
			System.out.println(x.toString());
		
	}

}
