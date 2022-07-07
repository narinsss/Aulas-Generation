package generation;

import java.util.Scanner;

public class PrimeiroAula {

	public static void main(String[] args) {
        double n1;
		double n2 = 0;
		float n3, media;
		System.out.println("\n Digite a primeira nota: ");
		Scanner leia = new Scanner(System.in);
		n1 = leia.nextFloat();
		n2 = leia.nextFloat();
		n3 = leia.nextFloat();

		//float soma = n1 + n2 + n3;
		//media = soma / 3;

		//System.out.println("\nMédia das notas: " + media);

		//if (media >= 7 && media <= 10) {
		//	System.out.println("\nVocê passou!!");
		//} else if (media >= 5 && media < 7) {
		//	System.out.println("\nEstá em recuperação!2");
		//} else {
		//System.out.println("\nReprovado!");
		//}
		
		System.out.println("\n\t\tMenu Java");
		int op = leia.nextInt();
		switch(op) {
		case 1: System.out.println("\nScanner nome = new Scanner(System.in);");
		break;
		case 3: System.out.println("\nSwitch() case1 em diante");
		break;
		case 4: System.out.println("\noto");
		break;
		default:
			System.out.println("\nnenhum");
		}
		
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n1, 3);
		System.out.println(n1);//raiz quadrada
		System.out.println("\n" + n2);//potencia
	}

}
