package estrutura_condicional;

import java.util.Scanner;

public class exercicio_if_else_2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número: ");		
		
		int numeroDigitado = 0;
		numeroDigitado = entrada.nextInt();
		
		System.out.println("O valor digitado é:  " + numeroDigitado );
		// se + (condição) + { executa se for verdadeiro!}
		
		if (numeroDigitado %2 == 0) {
			System.out.printf("O %d é PAR ", numeroDigitado);
		}  else  {
			System.out.printf("O %d é ÍMPAR", numeroDigitado);
			
		}
				
		
		
		entrada.close();
	
	}
	
	
}
