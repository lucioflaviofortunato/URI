import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor;

		int resultadoPor100;
		int sobraPor100;

		int resultadoPor50;
		int sobraPor50;

		int resultadoPor20;
		int sobraPor20;

		int resultadoPor10;
		int sobraPor10;

		int resultadoPor5;
		int sobraPor5;

		int resultadoPor2;
		int sobraPor2;

		int resultadoPor1;
		int sobraPor1;

		try (Scanner input = new Scanner(System.in)) {

			valor = input.nextInt();

			resultadoPor100 = valor / 100;
			sobraPor100 = valor % 100;

			resultadoPor50 = sobraPor100 / 50;
			sobraPor50 = sobraPor100 % 50;

			resultadoPor20 = sobraPor50 / 20;
			sobraPor20 = sobraPor50 % 20;

			resultadoPor10 = sobraPor20 / 10;
			sobraPor10 = sobraPor20 % 10;

			resultadoPor5 = sobraPor10 / 5;
			sobraPor5 = sobraPor10 % 5;

			resultadoPor2 = sobraPor5 / 2;
			sobraPor2 = sobraPor5 % 2;

			resultadoPor1 = sobraPor2 / 1;
			sobraPor1 = sobraPor2 % 1;

			System.out.println(valor);
			System.out.println(resultadoPor100 + " nota(s) de R$ 100,00");
			System.out.println(resultadoPor50 + " nota(s) de R$ 50,00");
			System.out.println(resultadoPor20 + " nota(s) de R$ 20,00");
			System.out.println(resultadoPor10 + " nota(s) de R$ 10,00");
			System.out.println(resultadoPor5 + " nota(s) de R$ 5,00");
			System.out.println(resultadoPor2 + " nota(s) de R$ 2,00");
			System.out.println(resultadoPor1 + " nota(s) de R$ 1,00");

		}
	}

}
