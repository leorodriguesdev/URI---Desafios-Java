import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double pi = 3.14159;

        double triangulo = (A * C) / 2;
        double circulo = pi * (C * C);
        double trapezio = ((A + B) * C) /2;
        double quadrado = B * B;
        double retangulo = A * B;
                
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));
        
        leitor.close();
	}

}
