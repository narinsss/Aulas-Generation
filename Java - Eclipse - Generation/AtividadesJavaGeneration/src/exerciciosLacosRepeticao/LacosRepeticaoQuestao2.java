package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosRepeticaoQuestao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, par = 0, impar = 0;
		System.out.println("Nos d� 10 n�meros inteiros: ");
		for(int i = 1; i <= 10; i++) {
			num = scan.nextInt();
			if(num % 2 == 0) {
				par++;
			}
	        if(num % 2 == 1){
	            impar++;
	        }
	    }

		System.out.println("Voc� inseriu " + par + " n�meros pares.");
		System.out.println("Voc� inseriu " + impar + " n�meros �mpares.");
	}
}
