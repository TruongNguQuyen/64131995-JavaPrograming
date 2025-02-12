/**
 * 
 */
package Vidu1;

/**
 * 
 */
public class SanPham {
	
	// Định nghĩa các thuộc tính
	int MaSP;
	String TenSP;
	String LoaiSP;
	String AnhSP;

	// Khởi tạo không tham số
	public SanPham() {
		super();
	}
	
	// Khởi tạo có tham số
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		super();
		MaSP = maSP;
		TenSP = tenSP;
		LoaiSP = loaiSP;
		AnhSP = anhSP;
	}

	public int getMaSP() {
		return MaSP;
	}

	public void setMaSP(int maSP) {
		MaSP = maSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String tenSP) {
		TenSP = tenSP;
	}

	public String getLoaiSP() {
		return LoaiSP;
	}

	public void setLoaiSP(String loaiSP) {
		LoaiSP = loaiSP;
	}

	public String getAnhSP() {
		return AnhSP;
	}

	public void setAnhSP(String anhSP) {
		AnhSP = anhSP;
	}

	@Override
	public String toString() {
		return "[Mã sản phẩm = " + MaSP + ", Tên sản phẩm = " + TenSP + ", Loại sản phẩm = " + LoaiSP + ", Ảnh sản phẩm = " + AnhSP + "]";
	}
	
	
}
