import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int distancia;

		try (Scanner input = new Scanner(System.in)) {

			distancia = input.nextInt();

			System.out.println(distancia * 2 + " minutos");

		}
	}

}
