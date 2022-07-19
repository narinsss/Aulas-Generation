
import java.util.Scanner;

public class Enfermagem extends Especialidades{
	protected String diasAtendimento;
	protected String nomeProfissional;

	public Enfermagem(String nomeProfissional, String especialidade) {
		super(nomeProfissional, especialidade);
	}

	void procedimentos(int op) {
		System.out.println("Agora escolha o procedimento que se adequa a sua necessidade de atendimento:");
		System.out.println("1. Vacina��o.");
		System.out.println("2. Exames laboratoriais.");
		System.out.println("3. Exames ginecol�gicos.");
		try (Scanner leia = new Scanner(System.in)) {
			op = leia.nextInt();

			switch (op) {
			case 1:
				System.out.println("\n Agendar vacina��o");
				break;
			case 2:
				System.out.println("\n Agendar exames laboratoriais");
				break;
			case 3:
				System.out.println("\n Agendar exames ginecol�gicos");
				break;
			}

			if (op == 1) {
				String x;
				System.out.println("1. A vacina��o para Covid-19 ocorre toda quarta-feira.");
				System.out.println("2. A vacina��o para outras patologias ocorre toda sexta-feira.");
				System.out.println("\n Digite o dia da sua vacina��o: ");
				x = leia.next();
				System.out.println("\nSua vacina est� agendada para pr�xima " + x);
			} else if (op == 2) {
				String x;
				System.out.println(
						"A coleta de exames laboratoriais acontece no turno da manh� nos seguintes dias: segunda-feira e quinta-feira. ");
				System.out.println("\n Digite o dia que voc� deseja realizar o exame: ");
				x = leia.next();
				System.out.println("\nSeu exame est� agendado para a pr�xima " + x);
			}
			if (op == 3) {
				String x;
				System.out.println("Os exames ginecol�gicos acontecem nos seguintes dias: ter�a-feira e sexta-feira. ");
				System.out.println("\n Digite o dia que voc� deseja realizar o exame: ");
				x = leia.next();
				System.out.println("\nSeu exame est� agendado para a pr�xima " + x);
			}
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
			System.out.println("Sua temperatura est� acima de 37 graus, fa�a o teste de COVID!");
		} else if (testeTemperatura < 37 || testeTemperatura > 35) {
			System.out.println("Temperatura adequada, pode entrar!");
		}
	}
    @Override
	public void cartaoCovid(boolean vac) {
		if (vac == true) {
			System.out.println("Todas as vacinas em dia, pode entrar e tirar a m�scara se preferir");
		} else if (vac == false) {
			System.out.println(
					"Marque um dia para completar suas vacinas, ou tome agora se dispon�vel, mas n�o poder� remover a m�scara ou permeneccer por mais de 5 minutos!");
		}
	}

}
