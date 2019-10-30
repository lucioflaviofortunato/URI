import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double cachorroQuente = 4.00;
		double x_salada = 4.50;
		double x_bacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		double valorConta;
		int codigo;
		int quantidade;
		
		try(Scanner input = new Scanner(System.in)){
			codigo =  input.nextInt();
			quantidade = input.nextInt();
			
			switch (codigo) {
			case 1:
				valorConta = cachorroQuente * quantidade;
				System.out.format("Total : R$ %.2f%n", valorConta);
				break;
			case 2:
				valorConta = x_salada * quantidade;
				System.out.format("Total : R$ %.2f%n", valorConta);
				break;
			case 3:
				valorConta = x_bacon * quantidade;
				System.out.format("Total : R$ %.2f%n", valorConta);
				break;
			case 4:
				valorConta = torradaSimples * quantidade; 
				System.out.format("Total : R$ %.2f%n", valorConta);
				break;
			case 5:
				valorConta = refrigerante * quantidade;
				System.out.format("Total : R$ %.2f%n", valorConta);
				break;
				
			default:
				break;
			}
			
			
		}
		

	}

}
