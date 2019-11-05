import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static boolean naoETriangulo(ArrayList<Double> lista) {
		double ladoA, ladoB, ladoC;
		ladoA = lista.get(0);
		ladoB = lista.get(1);
		ladoC = lista.get(2);
		if (ladoA >= ladoB + ladoC) {
			return true;
		} else {
			return false;
		}

	}

	public static void retangulo(ArrayList<Double> lista) {
		double ladoA, ladoB, ladoC;
		ladoA = lista.get(0);
		ladoB = lista.get(1);
		ladoC = lista.get(2);
		if (Math.pow(ladoA, 2) == (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
			System.out.println("TRIANGULO RETANGULO");
		}

	}

	public static void obtusangulo(ArrayList<Double> lista) {
		double ladoA, ladoB, ladoC;
		ladoA = lista.get(0);
		ladoB = lista.get(1);
		ladoC = lista.get(2);
		if (Math.pow(ladoA, 2) > (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
	}

	public static void acutangulo(ArrayList<Double> lista) {
		double ladoA, ladoB, ladoC;
		ladoA = lista.get(0);
		ladoB = lista.get(1);
		ladoC = lista.get(2);
		if (Math.pow(ladoA, 2) < (Math.pow(ladoB, 2) + Math.pow(ladoC, 2))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
	}

	public static void equilatero(ArrayList<Double> lista) {
		double ladoA, ladoB, ladoC;
		ladoA = lista.get(0);
		ladoB = lista.get(1);
		ladoC = lista.get(2);
		if (ladoA == ladoB & ladoA == ladoC) {
			System.out.println("TRIANGULO EQUILATERO");
		}
	}

	public static void isosceles(ArrayList<Double> lista) {
		double ladoA, ladoB, ladoC;
		ladoA = lista.get(0);
		ladoB = lista.get(1);
		ladoC = lista.get(2);
		if ((ladoA == ladoB & ladoA != ladoC) || (ladoB == ladoC & ladoA != ladoB)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
	}

	public static void main(String[] args) {

		ArrayList<Double> lista = new ArrayList<Double>();

		try (Scanner input = new Scanner(System.in)) {
			lista.add(0, input.nextDouble());
			lista.add(1, input.nextDouble());
			lista.add(2, input.nextDouble());
		}

		Collections.sort(lista);
		Collections.reverse(lista);

		if (naoETriangulo(lista)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			retangulo(lista);
			obtusangulo(lista);
			acutangulo(lista);
			equilatero(lista);
			isosceles(lista);
		}

	}

}
