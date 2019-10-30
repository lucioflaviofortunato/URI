import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int entrada,horas,minutos,segundos,sobraHoras;
		
		
	try (Scanner input = new Scanner(System.in)){;
		
		entrada  = input.nextInt();
		
		horas = entrada/3600;
		sobraHoras = entrada % 3600;
		
		minutos = sobraHoras/60;
		segundos = sobraHoras % 60;
		
		System.out.println(horas+":"+minutos+":"+segundos);
		
		
	}	
	}

}
