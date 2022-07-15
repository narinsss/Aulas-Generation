package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections {
	public static void main(String[] args) {
		int pront;

		Scanner scan = new Scanner(System.in);
		ArrayList<String> cadastro = new ArrayList<String>();

		do {
			System.out.println("-----------------------------------------");
			System.out.println("\n(1) Deseja adicionar um novo cadastro de paciente? ");
			System.out.println("\n(2) Deseja atualizar algum cadastro? ");
			System.out.println("\n(3) Deseja remover algum paciente cadastrado?");
			System.out.println("\n(4) Deseja mostrar todos eos pacientes cadastrados?");
			System.out.println("\n(0) Deseja encerrar o programa? ");
			pront = scan.nextInt();

			switch (pront) {
			case 1:
				scan.nextLine();
				System.out.println("\nDigite o nome do paciente que deseja adicionar: ");
				String nome = scan.nextLine();
				cadastro.add(nome);
				break;
			case 2:
				scan.nextLine();
				System.out.println("\nDigite o paciente que deseja remover: ");
				String paciente = scan.nextLine();
				if (cadastro.contains(paciente)) {
					cadastro.remove(cadastro);
				} else {
					System.out.println("Paciente não consta no sistema.");
				}
			case 3:
				scan.nextLine();
				System.out.println("\nDigite o paciente que deseja atualizar no cadastro: ");
				String verifica = scan.nextLine();
				System.out.println("Digite o nome do novo paciente: ");
				String novoPaciente = scan.nextLine();
				if (cadastro.contains(verifica)) {
					cadastro.remove(verifica);
					cadastro.add(novoPaciente);
					System.out.println("Novo paciente adicionado com sucesso!");
				} else {
					System.out.println("Paciente não consta no sistema.");
				}
				System.out.println(cadastro);
				break;
			case 4:
				scan.nextLine();
				System.out.println("\nPacientes cadastrados no sistema: ");
				System.out.println(cadastro);

			}
		} while (pront != 0);
	}

}
