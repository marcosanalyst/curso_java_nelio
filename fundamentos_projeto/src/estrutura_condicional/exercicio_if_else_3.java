package estrutura_condicional;

import java.util.Scanner;

public class exercicio_if_else_3 {
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double A = entrada.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double B = entrada.nextDouble();
		
		if (A %B == 0 || B %A == 0) {
			System.out.println("São multiplos");
		}
		
		else {
			System.out.println("Não são multiplos");
		}
		
		
		
		
		
				
		entrada.close();
	
	}
	
	
}
