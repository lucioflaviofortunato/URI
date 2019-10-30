import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double entrada;

		try (Scanner input = new Scanner(System.in)) {

			entrada = input.nextDouble();

			if (entrada < 0 || entrada > 100) {
				System.out.println("Fora de intervalo");
			} else if (entrada <= 25.0) {
				System.out.println("Intervalo [0,25]");
			} else if (entrada > 25.0 & entrada <= 50.0) {
				System.out.println("Intervalo (25,50]");
			} else if (entrada > 50.0 & entrada <= 75.0) {
				System.out.println("Intervalo (50,75]");
			} else if (entrada > 75.0 & entrada <= 100.00) {
				System.out.println("Intervalo (75,100]");
			}

		}

	}

}
