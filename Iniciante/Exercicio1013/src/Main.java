import java.util.Scanner;

public class Main {

	public static int comparador(int a, int b, int c) {
		if (a > b & a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {

		int a, b, c, resultado;

		try (Scanner input = new Scanner(System.in)) {

			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();

			resultado = comparador(a, b, c);

			System.out.println(resultado + " eh o maior");
		}

	}

}
