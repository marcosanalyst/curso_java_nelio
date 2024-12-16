package expressoes_logicas;



public class exp_log {
	public static void Main(String[] args) {
		
		

		 // Exemplos de expressões lógicas

        // Operador E (&&)
        boolean a = true;
        boolean b = false;
        boolean resultadoE = a && b; // Só será true se ambos os valores forem true
        System.out.println("Resultado de 'a && b': " + resultadoE);

        // Operador OU (||)
        boolean c = true;
        boolean d = false;
        boolean resultadoOU = c || d; // Será true se pelo menos um dos valores for true
        System.out.println("Resultado de 'c || d': " + resultadoOU);

        // Operador NÃO (!)
        boolean e = true;
        boolean resultadoNao = !e; // Inverte o valor lógico
        System.out.println("Resultado de '!e': " + resultadoNao);

        // Exemplos combinados
        boolean resultadoCombinado = (a && !b) || (c && d);
        System.out.println("Resultado de '(a && !b) || (c && d)': " + resultadoCombinado);
    }
	
	
}
