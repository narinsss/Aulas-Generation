package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosRepeticaoQuestao6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, soma = 0, media = 0, i = 0;
		do {
			System.out.println("Digite um n�mero inteiro: ");
			num = scan.nextInt();
			if(num % 3 == 0 && num != 0) {
				i++;
				soma += num;
				media = soma / i; 
			}
		}while(num != 0);
		System.out.println("M�dia dos n�meros inteiros m�ltiplos de 3: " + media);
	}

}
