import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
        int pc1 = leitor.nextInt();
        int npc1 = leitor.nextInt();
        double vpc1 = (leitor.nextDouble()* npc1);
        int pc2 = leitor.nextInt();
        int npc2 = leitor.nextInt();
        double vpc2 = (leitor.nextDouble()* npc2);
        
        double totalapagar = vpc1 + vpc2;


        System.out.printf("VALOR A PAGAR: R$ %.2f", totalapagar);
        System.out.println();

        leitor.close();
	}

}
