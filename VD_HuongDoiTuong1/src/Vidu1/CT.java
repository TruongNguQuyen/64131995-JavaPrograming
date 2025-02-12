package Vidu1;

public class CT {

	public static void main(String[] args) {
		// Tạo sản phẩm
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Chè chuối nướng", "Ẩm thực", "ccn.jpg");
		
		// Thêm dữ liệu cho sp1
		sp1.setMaSP(1);
		sp1.setTenSP("Kem chuối");
		sp1.setLoaiSP("Đồ ăn vặt");
		sp1.setAnhSP("kc.jpg");
		
		
		// In thông tin 2 sản phẩm ra màn hình
		System.out.println(sp1.toString());
		System.out.println("Mã sản phẩm 2 là: " + sp2.getMaSP() + " và tên sản phẩm 2 là: " + sp2.getTenSP());
	}

}
