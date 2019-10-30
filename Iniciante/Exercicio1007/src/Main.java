import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, c, d, resultado;

		try (Scanner input = new Scanner(System.in)) {
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			d = input.nextInt();

			resultado = a * b - c * d;

			System.out.println("DIFERENCA = " + resultado);
		}
	}

}
