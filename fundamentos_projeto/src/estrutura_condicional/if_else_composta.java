package estrutura_condicional;

import java.util.Scanner;

public class if_else_composta {
	public static void main(String[] args) {
		
		Scanner	entrada = new Scanner(System.in);
		
		System.out.println("Que horas são?");

		int hora;
		hora = entrada.nextInt();
		
		
		if(hora < 12) {
			System.out.println("Bom dia!");
		}
		
		else { if (hora < 18) {
			System.out.println("Boa tarde!");
		}
		
		else {
			System.out.println("Boa noite!");
		}
			
		}
		
		
		
		
		
		entrada.close();
	
	
	}
	
	
}
