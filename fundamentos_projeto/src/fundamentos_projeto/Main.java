package fundamentos_projeto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	String x;
	int y;
	double z;
	
	x = sc.next();
	y = sc.nextInt();
	z = sc.nextDouble();
	
	sc.close();
	
	
	System.out.println("Dados digitados: ");
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
}
	//  sc.next() para pegar textos String
	//	sc.nextInt() para pegar valores inteiros
	//	sc.nextDouble() para pegar valores com casas decimais
	//  sc.next().charAt(0) para pegar apenas um caracter de acordo com o Array
}
