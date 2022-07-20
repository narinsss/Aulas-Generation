package exerciciosCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EstoqueLolja {
	public static void main(String[] args) {
		int op;
		
		Scanner scan = new Scanner(System.in);
		List<String> lista = new ArrayList<String>();

		do {
			System.out.println("-----------------------------------------");
			System.out.println("\n(1) Tem algum item novo para estocar? ");
			System.out.println("\n(2) Para remover algum item do estoque. ");
			System.out.println("\n(3) Para atualizar algum item do estoque. ");
			System.out.println("\n(4) Para mostrar itens do estoque. ");
			System.out.println("\n(0) Para encerrar o sistema. ");
			op = scan.nextInt();

			switch (op) {
			case 1:
				scan.nextLine();
				System.out.println("\nDigite o nome do produto: ");
				String item = scan.nextLine();
				lista.add(item);
				break;
			case 2:
				scan.nextLine();
				System.out.println("\nDigite o nome do produto para remover: ");
				String itens = scan.nextLine();
				if (lista.contains(itens)) {
					lista.remove(itens);
				} else {
					System.out.println("Produto inválido.");
				}
				;
				break;
			case 3:
				scan.nextLine();
				System.out.println("\nDigite o item de estoque que deseja atualizar: ");
				String verif = scan.nextLine();
				System.out.println("Digite o nome do novo produto: ");
				String novo = scan.nextLine();
				if (lista.contains(verif)) {
					lista.remove(verif);
					lista.add(novo);
					System.out.println("Produto adicionado!");
				} else {
					System.out.println("Produto inválido.");
				}
				;
				System.out.println(lista);
				break;
			case 4:
				scan.nextLine();
				System.out.println("\nEstoque: ");
				for (int i = 0; i < lista.size(); i++) {
					Collections.sort(lista);
					System.out.println("- " + lista.get(i));
				}
			}
		} while (op != 0);
	}
}
