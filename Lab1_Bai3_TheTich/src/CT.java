import java.util.Scanner;
public class CT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhập cạnh của khối lập phương: ");
	        double canh = scanner.nextDouble();
	     
	        Khoilapphuong klp = new Khoilapphuong(canh);
	        System.out.println("\nThông tin khối lập phương:");
	        klp.xuatTheTich();
	        scanner.close();


	}

}
