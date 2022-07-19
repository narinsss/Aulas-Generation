package exerciciosLacosDecisao;

import java.util.Scanner;

public class LacosDecisaoQuestao1 {

	public static void main(String[] args) {
		int num;
		int maiorNum = 0;
		
		Scanner leia = new Scanner(System.in);
		for(int i = 1; i < 4; i++) {
			System.out.println("\nNos dê o " + i + "° número inteiro: ");
			num = leia.nextInt();
			
			if(maiorNum < num) {
				maiorNum = num;
			}
		}
		System.out.println("\nMaior número: " + maiorNum);
		
		
	}
}
