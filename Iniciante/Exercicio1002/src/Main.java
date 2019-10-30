import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double n,raio;
		double area;
	    n = 3.14159;
	    
	   try(Scanner input = new Scanner(System.in)){
	    raio = input.nextDouble();
	    
	    area = n * Math.pow(raio, 2);
	    
	  System.out.format("A=%.4f%n", area);
	   }
	}

}

