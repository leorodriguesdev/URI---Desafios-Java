import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
        double R = leitor.nextDouble();

        double pi = 3.14159;

        double volume = 4/3.0 * pi * Math.pow(R, 3);


        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();

        leitor.close();
	}

}
