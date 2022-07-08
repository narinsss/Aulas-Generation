package generation;

import java.util.Scanner;

public class SegundaAula {

	public static void main(String[] args) {
		//Tabuada
		Scanner scan = new Scanner(System.in);
		int num, mult = 0;
		System.out.println("Que tabuada deseja visualizar? ");
		num = scan.nextInt();
		for(int i = 1; i <= 10; i++) {
			mult = num * i;
			System.out.println(num + " x " + i + " = " + mult);
		}

	}

}
