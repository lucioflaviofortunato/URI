import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b,c,delta,x1,x2;
		
		try(Scanner leia = new Scanner(System.in)){
			
			a = leia.nextDouble();
			b = leia.nextDouble();
			c = leia.nextDouble();
			if(a  == 0) {
				System.out.println("Impossivel calcular");
			}else {
			delta = Math.pow(b, 2)- 4 * a * c;
			
			if(delta < 0) {
				System.out.println("Impossivel calcular");
			}else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.format("R1 = %.5f%n", x1);
			System.out.format("R2 = %.5f%n", x2);
			}
		
		}
	}
	}
}
