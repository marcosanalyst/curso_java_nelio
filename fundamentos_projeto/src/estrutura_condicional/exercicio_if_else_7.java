package estrutura_condicional;

import java.util.Scanner;

public class exercicio_if_else_7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double salario;
		
		System.out.println("Digite o salário: ");
		salario = entrada.nextDouble();
		
		if (salario >= 0 && salario <= 2000.00) {
			System.out.println("Isento, você pagará "
					+ "R$  " + (salario * 0));		
		} 
		else if (salario >= 2000.01 && salario <= 3000.00) {
			System.out.println("Imposto é de 8%, você pagará "
					+ "R$  "+ (salario * 0.08));
		}
		
		else if(salario >= 3000.01 && salario <= 4500.00) {
			System.out.println("Imposto é de 18%, você pagará "
					+ "R$  "+ (salario * 0.18));
		}
		else if (salario > 4500.00)
			System.out.println("Imposto é de 28%, você pagará "
					+ "R$  "+ (salario * 0.28));
		
		else {System.out.println("Valor inválido! ");}
	
		
		entrada.close();
	}
}
	

