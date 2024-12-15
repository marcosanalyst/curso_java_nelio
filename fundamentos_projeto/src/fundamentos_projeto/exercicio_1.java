package fundamentos_projeto;

import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {

// 		Faça um programa para ler dois valores inteiros, 
//		e depois mostrar na tela a soma desses números com uma
//		mensagem explicativa,
		
	Scanner	entrada = new Scanner(System.in);
	
	int valor1;
	int valor2;
	
	valor1 = entrada.nextInt();
	valor2 = entrada.nextInt();
	
	int resultado = valor1 + valor2;
	
	
	System.out.println("A soma dos valores é: " + resultado );
		
	
	
	entrada.close();
	
	}
	
	
}
