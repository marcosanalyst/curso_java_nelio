package fundamentos_projeto;

import java.util.Scanner;

public class exercicio_2 {
	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, 
		// e depois mostrar o valor da área deste círculo com quatro
		//  casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio2
		// Considere o valor de π = 3.14159
		
		

	Scanner	entrada = new Scanner(System.in);
	
	double pi = 3.14159;
	double raio = entrada.nextDouble();
	double area = pi * (Math.pow(raio, 2));
	
	System.out.printf("O valor do raio é: %.4f%n",  area);
	
	
	
		
	
	
	entrada.close();
	
	}
	
	
}
