package estrutura_condicional;

import java.util.Scanner;

public class exercicio_if_else_4 {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número do item");
		int codigo = entrada.nextInt();

		System.out.println("Digite a quantidade");
		int quantidade = entrada.nextInt();
	
		
		double total = 0;
		
		if( codigo == 1) {
			total = quantidade * 4.00;
		}
		
		else if (codigo == 2) {
			total = quantidade * 4.50; 
		}
		
		else if (codigo == 3) {
			total = quantidade * 5.00;
		}
		
		else if (codigo == 4) {
			total = quantidade * 2.00;
		}
		
		else if (codigo == 5){
			total = quantidade * 1.50;
		}
		
		else {
			System.out.println("Código de item inválido.");		
		}
		
		System.out.printf("O valor total da compra é: R$ %.2f%n ", total);

					
		entrada.close();
	
	}
	
	
}
