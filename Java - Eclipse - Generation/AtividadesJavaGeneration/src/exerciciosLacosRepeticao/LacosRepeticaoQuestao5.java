package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosRepeticaoQuestao5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, soma = 0;

		do {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			if(num != 0) {
				soma+=num;
			}
		} while (num != 0);
		
		System.out.println("Soma dos números: " + soma);
	}

}
