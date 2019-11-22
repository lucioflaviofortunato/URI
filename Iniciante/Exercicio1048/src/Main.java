import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double salario, reajuste;

		try (Scanner input = new Scanner(System.in)) {

			salario = input.nextDouble();

		}

		if (salario >= 0 & salario <= 400) {
			reajuste = salario * 15 / 100;
			System.out.format("Novo salario: %.2f %n",(salario + reajuste));
			System.out.format("Reajuste ganho: %.2f%n",reajuste);
			System.out.println("Em percentual: 15 %");
			
		} else if (salario > 400 & salario <= 800) {
			reajuste = salario * 12 / 100;
			System.out.format("Novo salario: %.2f%n",(salario + reajuste));
			System.out.format("Reajuste ganho: %.2f%n",reajuste);
			System.out.println("Em percentual: 12 %");

		} else if (salario > 800 & salario <= 1200) {
			reajuste = salario * 10 / 100;
			System.out.format("Novo salario: %.2f%n",(salario + reajuste));
			System.out.format("Reajuste ganho: %.2f%n",reajuste);
			System.out.println("Em percentual: 10 %");

		} else if (salario > 1200 & salario <= 2000) {
			reajuste = salario * 7 / 100;
			System.out.format("Novo salario: %.2f%n",(salario + reajuste));
			System.out.format("Reajuste ganho: %.2f%n",reajuste);
			System.out.println("Em percentual: 7 %");
			
		} else if (salario > 2000) {
			reajuste = salario * 4 / 100;
			System.out.format("Novo salario: %.2f%n",(salario + reajuste));
			System.out.format("Reajuste ganho: %.2f%n",reajuste);
			System.out.println("Em percentual: 4 %");
		}

	}
}
