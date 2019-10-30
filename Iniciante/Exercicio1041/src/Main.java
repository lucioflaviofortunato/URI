import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double x, y;

		try (Scanner input = new Scanner(System.in)) {

			x = input.nextDouble();
			y = input.nextDouble();

			if ((x == 0.0) & (y == 0.0)) {
				
				System.out.println("Origem");
				
			} else if ((x > 0.0) & (y > 0.0)) {
				
				System.out.println("Q1");
				
			} else if ((x < 0.0) & (y > 0.0)) {
				
				System.out.println("Q2");
				
			} else if ((x < 0.0) & (y < 0.0)) {
				
				System.out.println("Q3");
				
			} else if ((x > 0.0) & (y < 0.0)) {
				
				System.out.println("Q4");
				
			}else if((x == 0.0) & (y > 0.0)) {
				
				System.out.println("Eixo Y");
				
			}else if ((x == 0.0) & (y < 0.0)){
				
				System.out.println("Eixo Y");
			}else if((x < 0.0) & (y == 0.0)) {
				
				System.out.println("Eixo X");
				
			}else if((x > 0.0 ) & (y == 0.0)) {
				System.out.println("Eixo X");
			}
		}
	}

}
