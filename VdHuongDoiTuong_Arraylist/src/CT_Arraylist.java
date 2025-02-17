import java.util.ArrayList;
public class CT_Arraylist {

	public static void main(String[] args) {
		// Khai báo ds sản phẩm
		ArrayList<SanPham> dsSanPham;
		dsSanPham = new ArrayList<SanPham>();
		// Nhập n sản phẩm
//		SanPham sp1 = new SanPham(0, "Kem", "Giải khát", null);
		SanPham sp2 = new SanPham(1, "Cơm", "Đồ ăn", null);
		SanPham sp3 = new SanPham(2, "Bún", "Đồ ăn", null);
		
		// Thêm vào ArrayList
		dsSanPham.add(new SanPham(0, "Kem", "Giải khát", null));
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		for (int i = 0; i < dsSanPham.size(); i++) {
			SanPham sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
		
	}

}
