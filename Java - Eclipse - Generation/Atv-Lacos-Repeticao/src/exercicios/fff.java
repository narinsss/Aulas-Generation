package exercicios;

import java.util.Scanner;

public class fff {
	public static void main(String[] args) {
		  Scanner ent = new Scanner(System.in);
	      int num, contPar = 0, contImpar = 0;
	      
	      for(int i = 1; i <= 5; i++){
	          System.out.println("Digite o " + i + "� n�mero");
	          num = ent.nextInt();
	          
	          if(num % 2 == 0){
	              contPar++;
	          }

	          // para informar n�meros impares
	          /*
	          if(num % 2 == 1){
	              contImpar++;
	          }
	          */
	      }
	      
	      System.out.println("Foram digitados " + contPar + " n�meros pares \n");
	}
}
