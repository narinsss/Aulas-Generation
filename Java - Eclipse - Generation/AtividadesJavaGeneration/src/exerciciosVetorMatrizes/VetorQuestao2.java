package exerciciosVetorMatrizes;
import java.util.Scanner;

public class VetorQuestao2 {

	public static void main(String[] args) {
		int[] lados = new int[10];
		int lado = 0, media = 0, soma = 0, cont = 0, maior = 0;
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < lados.length; i++) {
			cont++;
			int y = i + 1;
			System.out.println("Lance o dado a " + y + "° vez: ");
			lado = scan.nextInt();
			lados[i] = lado;
			soma += lado;
			media = soma / cont;
			if(lado == 6) {
				maior++;
			}
		}
		
		System.out.println("Jogadas: ");
		for(int i = 0; i < lados.length; i++) {
			System.out.print("[" + lados[i] + "]");
		}
		System.out.println("\nMédia: " + media);
		System.out.println("Lançamentos: " + cont);
		System.out.println("Vezes que caiu o lado 6 do dado: " + maior);
	}

}
