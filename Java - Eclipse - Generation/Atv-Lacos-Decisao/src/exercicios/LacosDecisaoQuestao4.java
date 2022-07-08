package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LacosDecisaoQuestao4 {

	public static void main(String[] args) {
		double num, par, impar, raiz, potencia, mult;
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Descubra se o n�mero � par ou �mpar: ");
		num = scan.nextDouble();
		
		if(num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par!");
			raiz = Math.sqrt(num);
			System.out.println("A raiz quadrada de " + num + " �, " + df.format(raiz));
			
		}else{
			potencia = Math.pow(num, 2);
			System.out.println("Seu n�mero " + num + " � �mpar!");
			System.out.println(num + " ao quadrado � " + potencia + ".");
		}
	}

}
