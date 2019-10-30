import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double raio;
		double volume;

		try (Scanner input = new Scanner(System.in)) {

			raio = input.nextDouble();

			volume = (4.0 / 3) * 3.14159 * (Math.pow(raio, 3));

			System.out.format("VOLUME = %.3f%n", volume);

		}
	}

}
