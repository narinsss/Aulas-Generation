import java.util.ArrayList;
import java.util.Scanner;

public class MedClinic extends Especialidades{
	int op;
	String encaminhar, realizarConsulta, prescricao;

	Scanner sc = new Scanner(System.in);

	public MedClinic(String nomeProfissional, String especialidade) {
		super(nomeProfissional, especialidade);
	}

	public void menu()
		{
			ArrayList <MedClinic> cG  = new ArrayList<MedClinic>();
					
			
			System.out.println("/////////////////////////");
			System.out.println("\nMENU CLÍNICO GERAL");
			System.out.println("\n1 - ENCAMINHAR PACIENTE");
			System.out.println("\n2 - REALIZAR CONSULTA");
			System.out.println("\n3 - PRESCRIÇÃO");
			System.out.println("\n4 - SAIR");
			System.out.println("\nDigite sua opção: ");
			op=sc.nextInt();
			
			switch (op) {
			
			case 1: 
				System.out.println("Digite o CPF do paciente que deseja encaminhar: ");
				System.out.flush();
				break;
			
					
			case 2: 
				System.out.println("Digite o CPF do paciente que deseja Realizar Consulta: ");
				System.out.flush();
				break;
			
			case 3: 
				System.out.println("Digite o CPF do paciente que deseja fazer a prescrição ");
				System.out.flush();
				break;
				
			case 4:
				System.out.println("Você está saindo do Menu Clínico Geral...");
				System.exit(0);
				break;
				
			}
		}
	@Override
	public void cadastrar() {
	}

	@Override
	public void visitar() {
	}

	@Override
	public void encaminhar() {
	}
    @Override
	public void febre(double testeTemperatura) {
		if (testeTemperatura >= 37.5) {
			System.out.println("Sua temperatura está acima de 37 graus, faça o teste de COVID!");
		} else if (testeTemperatura < 37 || testeTemperatura > 35) {
			System.out.println("Temperatura adequada, pode entrar!");
		}
	}
    @Override
	public void cartaoCovid(boolean vac) {
		if (vac == true) {
			System.out.println("Todas as vacinas em dia, pode entrar e tirar a máscara se preferir");
		} else if (vac == false) {
			System.out.println(
					"Marque um dia para completar suas vacinas, ou tome agora se disponível, mas não poderá remover a máscara ou permeneccer por mais de 5 minutos!");
		}
	}
}
