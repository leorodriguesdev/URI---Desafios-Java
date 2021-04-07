import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int A = leitor.nextInt();
		int B = leitor.nextInt();
		int c = leitor.nextInt();
		
		int maior = (A + B + ABS(A - B))/2;
		
		System.out.println(maior + "eh o maior");
		
		
		leitor.close();
	}

}
