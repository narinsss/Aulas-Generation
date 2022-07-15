package collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
	//throws
	static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean contLoop = true;
		
		do {
			try {
				System.out.println("\nEntre com o numerador: ");
				int numerador = scan.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = scan.nextInt();
				int resultado = quociente(numerador, denominador);
				System.out.printf("\nResultado: %d / %d = %d", numerador, denominador, resultado);
				contLoop = false;
			//erro de entrada de dados
			}catch(InputMismatchException inputMismatchException) {
				System.err.println("Exce��o: " + inputMismatchException);
				scan.nextLine();
				System.out.println("\nVoc� deve entrar com um valor do tipo inteiro!");
			}catch(ArithmeticException arithmeticException) {
				System.err.println("Exce��o: " + arithmeticException);
				scan.nextLine();
				System.out.println("\nVoc� deve entrar com um n�mero v�lido!");
			}catch(NullPointerException nullPointer) {
				System.err.println("Exce��o: " + nullPointer);
				scan.nextLine();
				System.out.println("\nValor nulo!");
			}
		}while(contLoop == false);
	}

}
