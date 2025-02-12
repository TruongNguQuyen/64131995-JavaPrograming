
public class SanPham {
	// dữ liệu
	int MaSP;
	String TenSP;
	String LoaiSP;
	String AnhSP;
	
	// phương thức khởi tạo không tham số
	public SanPham() {
		super();
	}

	
	// khởi tạo có tham số
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
