import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int horas;
		int velocidade;
		int totalKm;
		double litrosGastos;

		try (Scanner input = new Scanner(System.in)) {

			horas = input.nextInt();
			velocidade = input.nextInt();
			totalKm = horas * velocidade;
			litrosGastos = totalKm / 12.0;

			System.out.format("%.3f%n", litrosGastos);
		}

	}

}
