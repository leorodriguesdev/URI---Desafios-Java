import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
        int NUMBER = leitor.nextInt();
        int HOURS = leitor.nextInt();
        double VALUE = leitor.nextDouble();

        double SALARY = VALUE * HOURS;
                
        System.out.println("NUMBER = "+ NUMBER);
        System.out.printf("SALARY = U$ %.2f", SALARY);
        System.out.println();
        
        leitor.close();

	}

}
