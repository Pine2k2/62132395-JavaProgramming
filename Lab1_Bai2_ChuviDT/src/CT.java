import java.util.Scanner;
public class CT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Chiều dài của hình chữ nhật: ");
	        double canhDai = scanner.nextDouble();
	     System.out.print("Chiều rộng của hình chữ nhật: ");
	        double canhRong = scanner.nextDouble();
	 
	        HCN hcn = new HCN(canhDai, canhRong);
	        System.out.println("\nThông tin hình chữ nhật:");
	        hcn.xuatThongTin();
	        scanner.close();
	}

}
