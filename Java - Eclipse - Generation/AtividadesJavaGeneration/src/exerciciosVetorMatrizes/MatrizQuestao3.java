package exerciciosVetorMatrizes;
import java.util.Scanner;

public class MatrizQuestao3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];
		int n1s, n2s, m1s, m2s, soma = 0, sub = 0, y, x;
		
		for(x = 0; x < 4; x++) {
		    for(y = 0; y < 6; y++) {
				System.out.println("Adicione um número na primeira tabela: ");
				n1s = scan.nextInt();
				n1[x][y] = n1s;
				System.out.println("Adicione um número na segunda tabela: ");
				n2s = scan.nextInt();
				n2[x][y] = n2s;
				
				 m1[x][y] = n1[x][y] + n2[x][y];
				 soma = m1[x][y];
				 m2[x][y] = n1[x][y] - n2[x][y];
				 sub = m2[x][y];
			}
		}
	    System.out.println("\nTabela m1: ");   
		for(x = 0; x < 4; x++) {
		    for(y = 0; y < 6; y++) {
	    	System.out.print("[" + m1[x][y] + "]");
		    }
	    }

	    System.out.println("\nTabela m2: ");
		for(x = 0; x < 4; x++) {
		    for(y = 0; y < 6; y++) {
	    	System.out.print("[" + m2[x][y] + "]");
		    }
	    }

	}

}
