import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String vendedor = leitor.nextLine();
        double salario = leitor.nextDouble();        
        double vendas = leitor.nextDouble();

        double comissao = vendas * 0.15;
        double TOTAL = comissao + salario;
                
        System.out.printf("TOTAL = R$ %.2f", TOTAL);
        System.out.println();

        leitor.close();
	}

}
