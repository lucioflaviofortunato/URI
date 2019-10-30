import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int entrada,ano,mes,dia,sobraAno,sobraMes;
		
		try(Scanner input = new Scanner(System.in)){
			
			entrada = input.nextInt();
			ano = entrada / 365;
			sobraAno = entrada % 365;
			
			mes = sobraAno / 30;
			sobraMes = sobraAno % 30;
			
			dia = sobraMes;
					
		}
		 System.out.println(ano + " ano(s)");
		 System.out.println(mes + " mes(es)");
		 System.out.println(dia + " dia(s)");
          
	}

}
