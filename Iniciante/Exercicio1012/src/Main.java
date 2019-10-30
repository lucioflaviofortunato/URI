import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a, b, c;
		double triangulo;
		double circulo;
		double trapezio;
		double quadrado;
		double retangulo;

		// entradas
		//
		try (Scanner input = new Scanner(System.in)) {

			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();

			// calculos

			triangulo = a * c / 2;
			circulo = 3.14159 * Math.pow(c, 2);
			trapezio = ((a + b) * c) / 2;
			quadrado = Math.pow(b, 2);
			retangulo = a * b;

			// saidas

			System.out.format("TRIANGULO: %.3f%n", triangulo);
			System.out.format("CIRCULO: %.3f%n", circulo);
			System.out.format("TRAPEZIO: %.3f%n", trapezio);
			System.out.format("QUADRADO: %.3f%n", quadrado);
			System.out.format("RETANGULO: %.3f%n", retangulo);
		}
	}

}
