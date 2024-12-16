package estrutura_condicional;

import java.util.Scanner;

public class exercicio_if_else_1 {
	public static void main(String[] args) {
		
	Scanner entrada  = new Scanner(System.in);
	// tipo da variável + nome da var + valor 
	
	System.out.println("Digite um número: ");
	
	int numeroDigitado;
	
	numeroDigitado = entrada.nextInt();
	// se + (condição) + {faça tal coisa}
	if(numeroDigitado >= 0) {
		System.out.println("Positivo");
	}
	else {System.out.println("Negativo");}
	
	
	
	
	entrada.close();
	
	
	}
	
	
}
