package exercicios;

import java.util.Scanner;

public class LacosRepeticaoQuestao4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, sexo, humor = 0, stop = 0;
		int pCalmas = 0, mNervosas = 0, hAgressivos = 0, oCalmos = 0, pNervosas40 = 0, pCalmas18 = 0;
		
		
		while(stop != 1) {
			System.out.println("Qual sua idade? ");
			idade = scan.nextInt();
			System.out.println("Qual o seu sexo? 1-feminino 2-Masculino 3-Outros.");
			sexo = scan.nextInt();
			System.out.println("Com qual humor você mais se identifica? 1-Calma 2-Nervosa 3-Agressiva");
			humor = scan.nextInt();
			System.out.println("Para finalizar o programa digite 1, para continuar digite 0.");
			stop = scan.nextInt();
			
			if(humor == 1) {
				pCalmas++;
			}
			if(humor == 2 && sexo == 1) {
				mNervosas++;
			}
			if(humor == 3 && sexo == 2) {
				hAgressivos++;
			}
			if(humor == 1 && sexo == 3) {
				oCalmos++;
			}
			if(idade > 40 && humor == 2) {
				pNervosas40++;
			}
			if(idade < 18 && humor == 1) {
				pCalmas18++;
			}
		}
		
		System.out.println("Quantidade de pessoas Calmas: " + pCalmas);
		System.out.println("Quantidade de mulheres nervosas: " + mNervosas);
		System.out.println("Quantidade de homens agressivos: " + hAgressivos);
		System.out.println("Quantidade de outros calmos: " + oCalmos);
		System.out.println("Quantidade de pessoas nervosas com mais de 40 anos: " + pNervosas40);
		System.out.println("Quantidade de pessoas calmas com menos de 18 anos: " + pCalmas18);
		
	}

}
