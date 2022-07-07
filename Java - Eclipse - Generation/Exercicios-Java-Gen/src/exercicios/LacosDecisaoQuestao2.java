package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class LacosDecisaoQuestao2 {
	public static void main(String[] args) {
		int[] num = new int[3];
		int mais;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			mais = i+1;//para numerar a ordem de inserção dos números
			System.out.println("\nNos dê o " + mais + "° número inteiro: ");
			num[i] = (leia.nextInt());
		}
		
		Arrays.sort(num);//método para ordenar/exibir o array
		System.out.println("\nOrdem Crescente: ");
		for(int y = 0; y < num.length; y++) {//lenght em laço, imprime cada item de um array
			System.out.print("[" + num[y] + "]");
		}
		
	}
}
