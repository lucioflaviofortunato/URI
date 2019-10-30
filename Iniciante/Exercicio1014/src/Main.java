import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int km;
		double combustivelGasto;
		double media;

		try (Scanner input = new Scanner(System.in)) {
			;

			km = input.nextInt();
			combustivelGasto = input.nextDouble();

			media = km / combustivelGasto;

			System.out.format("%.3f", media);
			System.out.println(" km/l");

		}
	}

}
