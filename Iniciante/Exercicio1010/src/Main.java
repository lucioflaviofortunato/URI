import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int codigo, quantidade;
		double preco, total;

		total = 0.00;

		try (Scanner input = new Scanner(System.in)) {

			for (int i = 0; i < 2; i++) {
				codigo = input.nextInt();
				quantidade = input.nextInt();
				preco = input.nextDouble() * quantidade;
				total = +total + preco;
			}

			System.out.format("VALOR A PAGAR: R$ %.2f%n", total);
		}
	}

}
