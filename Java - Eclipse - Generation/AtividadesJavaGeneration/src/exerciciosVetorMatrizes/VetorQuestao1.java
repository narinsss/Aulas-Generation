package exerciciosVetorMatrizes;
import java.util.Scanner;

public class VetorQuestao1 {

	public static void main(String[] args) {
		int[] notas = new int[5];
		int nota = 0, maiorNota = 0;
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			int y = i + 1;
			System.out.println("Digite o sua " + y +"° nota: ");
			nota = scan.nextInt();
			notas[i] = nota;
			
			if(maiorNota < nota) {
				maiorNota = nota;
			}
		}
		System.out.println("Notas: ");
		for(int i = 0; i < 5; i++) {
			System.out.print("[" + notas[i] + "]");
		}
		
		System.out.println("\nMaior nota da turma: " + maiorNota);
	}

}
