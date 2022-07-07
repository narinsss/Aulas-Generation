package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class LacosDecisaoQuestao2 {
	public static void main(String[] args) {
		int mais, a, b, c;
		
		Scanner leia = new Scanner(System.in);

			System.out.println("\nNos dê três números inteiros: ");
			a = leia.nextInt();
			b = leia.nextInt();
			c = leia.nextInt();
			
			if(a<=b && b<=c)
			{
				System.out.println("\nOrdem crescente: "+a+" , "+b+" , "+c);//a , b , c
			}
			else if(a<=c && c<=b)
			{
				System.out.println("\nOrdem crescente: "+a+" , "+c+" , "+b);
			}
			else if(b<=a && a<=c)
			{
				System.out.println("\nOrdem crescente: "+b+" , "+a+" , "+c);
			}
			else if(b<=c && c<=a)
			{
				System.out.println("\nOrdem crescente: "+b+" , "+c+" , "+a);
			}
			else if(c<=a && a<=b)
			{
				System.out.println("\nOrdem crescente: "+c+" , "+a+" , "+b);
			}
			else
			{
				System.out.println("\nOrdem crescente: "+c+" , "+b+" , "+a);
			}
		
	}
}
