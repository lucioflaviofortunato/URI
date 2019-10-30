
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n1, n2, n3, n4, media;
		DecimalFormat df = new DecimalFormat("#.0");

		try (Scanner input = new Scanner(System.in)) {
            
			n1 = input.nextDouble() * 2;
			
			n2 = input.nextDouble() * 3;
			
			n3 = input.nextDouble() * 4;
			
			n4 = input.nextDouble();

			media = (n1 + n2 + n3 + n4) / 10;
			

			if (media >= 7.0) {
				
				System.out.println("Media: " + df.format(media));
				System.out.println("Aluno Aprovado.");
				
			} else if (media < 5.0) {
							
				System.out.println("Media: " + df.format(media));
				System.out.println("Aluno reprovado.");
				
			} else if (media >= 5.0 & media <= 6.9) {
				
				double exame = input.nextDouble();
				
			
				System.out.println("Media: " + df.format(media));
				System.out.println("Aluno em exame.");
				
				
				
				media = (media + exame) / 2;
				 
				System.out.println("Nota do exame: " + df.format(exame));
				
				if (media >= 5.0) {
					
					System.out.println("Aluno aprovado.");
					
					System.out.println("Media final: "+ df.format(media));
					
				} else {
					
					System.out.println("Aluno reprovado.");
					
					System.out.println("Media final: "+ df.format(media));
					
				}
			}
		}

	}

}
