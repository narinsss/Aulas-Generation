package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosRepeticaoQuestao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, par = 0, impar = 0;
		System.out.println("Nos dê 10 números inteiros: ");
		for(int i = 1; i <= 10; i++) {
			num = scan.nextInt();
			if(num % 2 == 0) {
				par++;
			}
	        if(num % 2 == 1){
	            impar++;
	        }
	    }

		System.out.println("Você inseriu " + par + " números pares.");
		System.out.println("Você inseriu " + impar + " números ímpares.");
	}
}
