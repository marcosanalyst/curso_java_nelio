package fundamentos_projeto;

import java.util.Scanner;

public class exercicio_4 {
	public static void main(String[] args) {
// 		Fazer um programa que leia o número de um funcionário, 
//		seu número de horas trabalhadas, o valor que recebe por
//		hora e calcula o salário desse funcionário. 
//		A seguir, mostre o número e o salário do funcionário, com duas casas
	//	decimais.
		

	Scanner	entrada = new Scanner(System.in);
	
	int numeroFunc;
	int horasTrabalhadas;
	double valorHora;
	
	numeroFunc = entrada.nextInt();
	horasTrabalhadas = entrada.nextInt();
	valorHora = entrada.nextDouble();
	
	double salarioFunc = horasTrabalhadas * valorHora;
	
	System.out.printf("O salário do funcionário %d é de %.2f", numeroFunc, salarioFunc); 
	
	
	entrada.close();
	
	}
	
	
}
