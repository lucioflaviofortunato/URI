import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a , b;
		
		try (Scanner input = new Scanner(System.in)){
			
			a = input.nextInt();
			b = input.nextInt();
			
			if((b % a == 0) || (a % b ==0)) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao Multiplos");
			}
		}
        
	}

}
