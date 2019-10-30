import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x1, y1, x2, y2, distancia;

		try (Scanner input = new Scanner(System.in)) {

			x1 = input.nextDouble();// 1.0
			y1 = input.nextDouble();// 7.0

			x2 = input.nextDouble();// 5.0
			y2 = input.nextDouble();// 9.0

			distancia = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

			System.out.format("%.4f%n", distancia);
		}
	}

}
