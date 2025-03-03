import java.util.Scanner;
public class CT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        ptBac2 ptb2 = new ptBac2(a, b, c);

        System.out.println("\nCăn delta:");
        ptb2.xuatCanDelta();
        scanner.close();

	}

}
