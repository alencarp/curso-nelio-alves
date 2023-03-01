package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		double valor = 19.2867;
		System.out.println(valor);
		System.out.printf("%.2f\n", valor);
		
		Locale.setDefault(Locale.US);
		System.out.println(valor);
		System.out.printf("%.4f%n", valor);
		
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("%.2f\n", valor);
		
		System.out.printf("RESULTADO = %.2f metros\n", valor);
		
		concatenarPrintf();
	}
	
	public static void concatenarPrintf() {
		System.out.println("------------------------------------------------");
			
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		//Locale.setDefault(Locale.US);
		Locale.setDefault(new Locale("pt", "BR"));
		System.out.printf("%s tem %d anos e ganha R$ %.2f\n", nome, idade, renda);
	}

}
