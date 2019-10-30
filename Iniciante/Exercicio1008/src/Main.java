import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numeroFuncionario;
		int valorHora;
		double horasTrabalhadas;
		double salario;

		try (Scanner input = new Scanner(System.in)) {
			;

			numeroFuncionario = input.nextInt();
			valorHora = input.nextInt();
			horasTrabalhadas = input.nextDouble();

			salario = valorHora * horasTrabalhadas;
			System.out.println("NUMBER = " + numeroFuncionario);
			System.out.format("SALARY = U$ %.2f%n", salario);
		}
	}

}
