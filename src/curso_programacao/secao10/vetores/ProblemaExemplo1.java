/**
 * Ler um número inteiro N e a altura de N pessoas.
 * Armazenar as N alturas em um vetor.
 * Mostrar a média dessas alturas.
 */
package curso_programacao.secao10.vetores;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número de pessoas: ");
		int n = scanner.nextInt(); //5 pessoas	
		double[] vetorAlturas = new double[n];
		
		double media = 0.0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite a altura da %dª pessoa: ", i+1);
			vetorAlturas[i] = scanner.nextDouble();
			
			//System.out.printf("vetorAlturas[%d] = %.2f%n", i, vetorAlturas[i]);
			
			media += vetorAlturas[i];
		}		
		
//		for (int j = 0; j < vetorAlturas.length; j++) {
//			System.out.printf("Altura = %.2f%n", vetorAlturas[j]);	
//		}
		media = media / n;
		System.out.printf("Média = %.2f", media);
		
		scanner.close();
	}

}
