
public class CT {

	public static void main(String[] args) {
		// Tạo ra 2 sản phẩm
		SanPham sp1 = new SanPham();
		SanPham sp2 = new SanPham(2, "Bánh canh", "Đồ ăn", "bc.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("Bia NT");
		sp1.setLoaiSP("Đồ uống có cồn");
		sp1.setAnhSP("nt.png");
		
		// In ra màn hình thông tin 2 sp
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Mã SP 2: " + sp2.getMaSP();
				thongtinSP2 += "Tên SP 2: " + sp2.getTenSP();
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);
	}

}
