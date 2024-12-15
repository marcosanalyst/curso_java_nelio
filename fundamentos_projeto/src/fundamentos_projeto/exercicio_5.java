package fundamentos_projeto;

import java.util.Scanner;

public class exercicio_5 {
	public static void main(String[] args) {

		//Fazer um programa para ler o código de uma peça 1, o número de peças 1,
		// o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o 
		// valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		

	Scanner	entrada = new Scanner(System.in);
	
	int codigoPeca1;
	int quantPeca1;
	double valorPeca1;
	
	System.out.println("Insira o código da peça: ");
	codigoPeca1 = entrada.nextInt();
	System.out.println("Insira a quantidade de peças: ");
	quantPeca1 = entrada.nextInt();
	System.out.println("Digite o valor da peça: ");
	valorPeca1 = entrada.nextDouble();
	
	double subCompra = quantPeca1 * valorPeca1;
	
	System.out.println("O valor atual da compra é de: " + subCompra);
	
	int codigoPeca2;
	int quantPeca2;
	double valorPeca2;
	
	System.out.println("Insira o código da peça: ");
	codigoPeca2 = entrada.nextInt();
	System.out.println("Insira a quantidade de peças: ");
	quantPeca2 = entrada.nextInt();
	System.out.println("Digite o valor da peça: ");
	valorPeca2 = entrada.nextDouble();
	
	
	double compraTotal = (quantPeca2 * valorPeca2) + subCompra;	
	
	System.out.println("O valor total da compra é de: " + compraTotal);
	
	System.out.println("Sua lista de produtos comprados: " + codigoPeca1 + " " + codigoPeca2 + "." );
	
	
	entrada.close();
	
	}
	
	
}
