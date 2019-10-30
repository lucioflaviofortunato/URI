import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;

		try (Scanner input = new Scanner(System.in)) {
			;

			nota1 = input.nextDouble() * 2;
			nota2 = input.nextDouble() * 3;
			nota3 = input.nextDouble() * 5;

			media = (nota1 + nota2 + nota3) / 10;

			System.out.format("MEDIA = %.1f%n", media);
		}
	}

}
