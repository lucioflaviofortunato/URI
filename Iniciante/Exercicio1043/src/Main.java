import java.util.Scanner;

public class Main {

	public static void triangulo(double a, double b, double c) {
		  double soma;
		if(((b - c) < a & a < (b +c)) & ((a - c) < a & a < (b +c)) & ((a - b) < a & a < (b +c))) {
			soma = a+b+c;
			System.out.println("Perimetro = " + soma);
		}else {
			System.out.println("Area = "+ ( (a+b))*c / 2);
		}

	}

	public static void main(String[] args) {
		double a, b, c;

		try (Scanner input = new Scanner(System.in)) {

			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
		}

		triangulo(a, b, c);
	}

}
