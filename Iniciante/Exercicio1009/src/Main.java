import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String nomeVendedor;
		double salarioFixo;
		double totalVendas;
		double salarioFinal;

		try (Scanner input = new Scanner(System.in)) {

			nomeVendedor = input.nextLine();

			salarioFixo = input.nextDouble();

			totalVendas = input.nextDouble();

			salarioFinal = salarioFixo + 15 * totalVendas / 100;

			System.out.format("TOTAL = R$ %.2f%n", salarioFinal);
		}
	}

}
