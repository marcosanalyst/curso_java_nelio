package estrutura_condicional;

import java.util.Scanner;

public class exercicio_if_else_6 {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número de 0 a 100: ");
		double numeroDigitado = entrada.nextDouble();
		
		 if (numeroDigitado >= 0 && numeroDigitado <= 25.00) {
			 System.out.println("Intervalo [0-25]");
		 }
		 else if (numeroDigitado >25.00 && numeroDigitado <=50.00) {
			 System.out.println("intervalo [25-50]");
		 }
		 else if (numeroDigitado > 50.00 && numeroDigitado <=75.00) {			 
		 	 System.out.println("Intervalo [50-75]");
		 }
		 
		 else if(numeroDigitado > 75.00 && numeroDigitado <=100.00) {
			 System.out.println("Intervalo [75-100]");
		 }
		 
		 else {
			 System.out.println("Intervalo inválido!"); 
			 
		 }
					
		entrada.close();
	
	}
	
	
}
