import java.util.Scanner;

public class URI1002 {

	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double pi = 3.14159;
        double raio = leitor.nextDouble();
               
        double area = pi * Math.pow(raio, 2);
        
        System.out.printf("A = %.4f", area);
        System.out.println();
		
	}

}
