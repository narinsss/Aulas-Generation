package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LacosDecisaoQuestao4 {

	public static void main(String[] args) {
		double num, par, impar, raiz, potencia, mult;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Descubra se o número é par ou ímpar: ");
		num = scan.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("O número " + num + " é par!");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada de " + num + " é, " + df.format(raiz));
			
		}else{
			potencia = Math.pow(num, 2);
			System.out.println("Seu número " + num + " é ímpar!");
			System.out.println(num + " ao quadrado é " + potencia + ".");
		}
	}

}
