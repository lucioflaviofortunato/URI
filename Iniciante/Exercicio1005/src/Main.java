
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a,b,media;
		
		try(Scanner input = new Scanner(System.in)){
		a = input.nextDouble()*3.5;
		b = input.nextDouble()*7.5;
		media = (a+b)/11;
		System.out.format("MEDIA = %.5f%n", media);
		}
	}

}
