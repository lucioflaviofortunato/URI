import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int A,B,X;
		
		try(Scanner input = new Scanner(System.in)){
			
	
		
		A = input.nextInt();
		
		B = input.nextInt();
		
		X = A + B;
		
		System.out.println("X = "+X);
		}
	}

}