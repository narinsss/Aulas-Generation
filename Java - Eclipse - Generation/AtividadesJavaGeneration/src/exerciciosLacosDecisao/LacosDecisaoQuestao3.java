package exerciciosLacosDecisao;

import java.util.Scanner;

public class LacosDecisaoQuestao3 {
	public static void main(String[] args) {
		int idade;
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual sua idade? ");
		idade = scan.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Juvenil");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("Adulto");
		}else {
			System.out.println("Saia daqui!");
		}
		
		
		
	}

}
