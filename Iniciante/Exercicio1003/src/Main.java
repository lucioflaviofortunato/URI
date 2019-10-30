import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a, b, soma;

		try (Scanner input = new Scanner(System.in)) {
			

			a = input.nextInt();
			b = input.nextInt();
			soma = a + b;

			System.out.println("SOMA = " + soma);
		}
	}

}
