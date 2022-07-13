package exerciciosLacosRepeticao;

import java.util.Scanner;

public class LacosRepeticaoQuestao3 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  int idade = 0, menos = 0, mais = 0;
		  
		  while(idade != -99) {
			  System.out.println("Digite sua idade: ");
			  idade = scan.nextInt();
			  
			  if(idade < 21 && idade > -99) {
				  menos++;
			  }
			  if(idade > 50) {
				  mais++;
			  }
		  }
		  System.out.println("Pessoas com menos de 21 anos: " + menos);
		  System.out.println("Pessoas com mais de 50 anos: " + mais);
		  
	}
}
