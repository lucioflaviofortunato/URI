import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float entrada;
		int nota100,nota50,nota20,nota10,nota5,nota2;
		double sobra100,sobra50,sobra20,sobra10,sobra5,sobra2;
		int moeda1,moeda050,moeda025,moeda010,moeda05,moeda001;
		double sobraMoeda1,sobraMoeda050,sobraMoeda025,sobraMoeda010,sobraMoeda05,sobraMoeda01;
		double aux = 0;
	    try(Scanner input = new Scanner(System.in)){
	    	entrada = input.nextFloat();
	    }
        
	    nota100 = (int)entrada / 100;
	    sobra100 = entrada % 100;
	    nota50 = (int)sobra100 / 50;
	    sobra50 = sobra100 % 50;
	    nota20 = (int)sobra50 / 20;
	    sobra20= sobra50 % 20;
	    nota10 = (int)sobra20 / 10;
	    sobra10 = sobra20 % 10;
	    nota5 = (int)sobra10 / 5;
	    sobra5 = sobra10 % 5;
	    nota2 = (int)sobra5 / 2;
	    sobra2 = sobra5 % 2;
	    
	    moeda1 = (int)sobra2 / 1;
	    sobraMoeda1 = sobra2 % 1;
	    //moeda 0,50
	    aux =  sobraMoeda1 / 0.5;
	    sobraMoeda050 = sobraMoeda1 % 0.5;
	    moeda050 = (int)aux;
	    aux = 0;
	    //moeda 0,25
	    aux =  sobraMoeda050 / 0.25;
	    sobraMoeda025 = sobraMoeda050 % 0.25;
	    moeda025 = (int)aux;
	    aux = 0;
	    //MOEDA 0,10
	    aux =  sobraMoeda025 / 0.10;
	    sobraMoeda010 = sobraMoeda025 % 0.10;
	    moeda010 = (int)aux;
	    aux = 0;
	    //MOEDA 0,05
	    aux =  sobraMoeda010 / 0.05;
	    sobraMoeda05 = sobraMoeda010 % 0.05;
	    moeda05 = (int)aux;
	    aux = 0;
	    //MOEDA 0,01
	   // aux =  sobraMoeda05 / 0.01;
	    sobraMoeda01 = sobraMoeda05 % 0.01;
	    
	    if(sobraMoeda01 > 0.005) {
	    	aux =  sobraMoeda05 / 0.01;
	    	moeda001 = (int)Math.ceil(aux);
	    }else {
	       aux =  sobraMoeda05 / 0.01;
	       moeda001 = (int)Math.floor(aux);
	  
	    }     
       
	   
	    
	    System.out.println("NOTAS:");
	    System.out.println(nota100 + " nota(s) de R$ 100.00");
	    System.out.println(nota50 + " nota(s) de R$ 50.00");
	    System.out.println(nota20 + " nota(s) de R$ 20.00");
	    System.out.println(nota10 + " nota(s) de R$ 10.00");
	    System.out.println(nota5 + " nota(s) de R$ 5.00");
	    System.out.println(nota2 + " nota(s) de R$ 2.00");
	    System.out.println("MOEDAS:");
	    System.out.println(moeda1 + " moeda(s) de R$ 1.00");
	    System.out.println(moeda050 + " moeda(s) de R$ 0.50");
	    System.out.println(moeda025 + " moeda(s) de R$ 0.25");
	    System.out.println(moeda010 + " moeda(s) de R$ 0.10");
	    System.out.println(moeda05 + " moeda(s) de R$ 0.05");
	    System.out.println(moeda001 + " moeda(s) de R$ 0.01");
	   
	  
	}

}
