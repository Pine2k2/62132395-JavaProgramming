import java.util.Scanner;
public class CT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double diemTrungBinh = scanner.nextDouble();
        
        SinhVien sv = new SinhVien(hoTen, diemTrungBinh);
        
        System.out.println("\nThông tin sinh viên:");
        sv.xuatThongTin();
		
        scanner.close();

	}

}
