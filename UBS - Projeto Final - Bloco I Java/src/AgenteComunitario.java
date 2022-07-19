import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AgenteComunitario extends Especialidades {
	public AgenteComunitario(String nomeProfissional, String especialidade) {
		super(nomeProfissional, especialidade);
		// TODO Auto-generated constructor stub
	}

	protected String[] fichas = new String[5];
	protected String ficha;
	protected int prontuario;
	protected String verifica;
	Scanner scan = new Scanner(System.in);

	// Por dia tem apenas 20 filhas, cada vez que o método for chamado irá
	// contabilizar um paciente
	void distribuirFicha() {
		for (int i = 0; i < fichas.length; i++) {
			System.out.println("Digite o nome do paciente que receberá a ficha: ");
			ficha = scan.next();
			fichas[i] = ficha;
		}
		System.out.println("Pacientes do dia: ");
		for (int i = 0; i < fichas.length; i++) {
			System.out.println("[ " + fichas[i].toUpperCase() + " ] ");
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	void cadastrar() {
		ArrayList<String> nome = new ArrayList<String>();
		ArrayList<String> sus = new ArrayList<String>();
		ArrayList<Integer> idade = new ArrayList<Integer>();
		ArrayList<Double> peso = new ArrayList<Double>();
		ArrayList<Double> altura = new ArrayList<Double>();
		ArrayList<Boolean> dm = new ArrayList<Boolean>();
		ArrayList<Boolean> has = new ArrayList<Boolean>();
		
		try {
			do {
				System.out.println("______________________________________________________________");
				System.out.println("\nDigite 1 para cadastrar um novo paciente? ");
				System.out.println("\nDigite 2 para remover algum paciente cadastrado: ");
				System.out.println("\nDigite 3 para atualizar informações do paciente: ");
				System.out.println("\nDigite 4 para mostrar todos os pacientes cadastrados: ");
				System.out.println("\nDigite 0 para encerrar o programa? ");
				System.out.println("______________________________________________________________");
				prontuario = scan.nextInt();

				switch (prontuario) {
				case 1:
					scan.nextLine();
					System.out.println("\nDigite o nome do paciente que deseja adicionar: ");
					super.nome = scan.nextLine();
					nome.add(super.nome);
					System.out.println("\nDigite o cartão SUS do paciente: ");
					super.cartSus = scan.nextLine();
					sus.add(super.cartSus);
					System.out.println("\nDigite a idade do paciente: ");
					super.idade = scan.nextInt();
					idade.add(super.idade);
					System.out.println("\nDigite a altura do paciente no formato 0,00: ");
					super.altura = scan.nextDouble();
					altura.add(super.altura);
					System.out.println("\nDigite o peso do paciente no formato 00,0: ");
					super.peso = scan.nextDouble();
					peso.add(super.peso);
					System.out.println("\nPaciente hipertendo SIM ou NAO? ");
					super.has = scan.nextBoolean();
					has.add(super.has);
					System.out.println("\nPaciente diabético SIM ou NAO? ");
					super.dm = scan.nextBoolean();
					dm.add(super.dm);
					break;
				case 2:
					scan.nextLine();
					System.out.println("\nDigite o paciente que deseja remover: ");
					String paciente = scan.next();
					if (nome.contains(paciente)) {
						nome.remove(paciente);
						System.out.println("Paciente removido com sucesso!!");
					} else {
						System.out.println("Paciente não consta no sistema.");
						for(int i = 0; i < nome.size(); i++) {
							System.out.println("Nome: " + nome.get(i) + ", Idade: " + idade.get(i)
							+ ", Altura: " + altura.get(i) + "" + ", Peso: " + peso.get(i) + ", Cartão do SUS: " 
							+ sus.get(i) + ", Diabético: " + dm.get(i) + ", Hipertenso: " + has.get(i));
					    }
					}
					break;
				case 3:
					scan.nextLine();
					System.out.println("\nDigite a informação que deseja atualizar: ");
					System.out.println("\nOpções: nome, idade, peso, altura, cartSus, has e dm");
					String verifica = scan.nextLine();
					switch (verifica) {
					case "nome":
						System.out.println("Digite o nome do paciente: ");
						String infoN = scan.nextLine();
						System.out.println("Digite o novo nome do paciente: ");
						String nomeNovo = scan.next();
						if (nome.contains(infoN)) {
							nome.remove(infoN);
							nome.add(nomeNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
					break;
					case "idade":
						System.out.println("Digite a idade que consta no cadastro: ");
						String infoI = scan.nextLine();
						System.out.println("Digite a nova idade do paciente: ");
						int idadeNova = scan.nextInt();
						if (idade.contains(infoI)) {
							idade.remove(infoI);
							idade.add(idadeNova);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "altura":
						System.out.println("Digite a altura do paciente: ");
						String infoA = scan.nextLine();
						System.out.println("Digite o novo altura do paciente: ");
						Double alturaNova = scan.nextDouble();
						if (altura.contains(alturaNova)) {
						altura.remove(alturaNova);
						altura.add(alturaNova);
						System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "peso":
						System.out.println("Digite o peso do paciente: ");
						String infoP = scan.nextLine();
						System.out.println("Digite o novo peso do paciente: ");
						Double pesoNovo = scan.nextDouble();
						if (peso.contains(infoP)) {
							peso.remove(infoP);
							peso.add(pesoNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "sus":
						System.out.println("Digite a nova idade do informação do paciente: ");
						String infoS = scan.nextLine();
						System.out.println("Digite o novo nome do paciente: ");
						String susNovo = scan.next();
						if (sus.contains(infoS)) {
							sus.remove(infoS);
							sus.add(susNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "has":
						System.out.println("Digite se o paciente tem hipertensão: ");
						String infoH = scan.nextLine();
						System.out.println("Digite o novo diagnóstico: ");
						Boolean novoHas = scan.nextBoolean();
						if (has.contains(infoH)) {
							has.remove(infoH);
							has.add(novoHas);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
						break;
					case "dm":
						System.out.println("Digite se o paciente tem diabetes mellitus: ");
						String infoD = scan.nextLine();
						System.out.println("Digite o novo nome do paciente: ");
						Boolean dmNovo = scan.nextBoolean();
						if (dm.contains(infoD)) {
							dm.remove(infoD);
							dm.add(dmNovo);
							System.out.println("Informação atualizada!");
						} else {
							System.out.println("Paciente não consta no sistema.");
						}
					    break;
					case "sair":
						System.out.println("\nFinalizou o programa!!!");
						break;
						default:
							System.out.println("\nOpção inválida!!!");
					}
				case 4:
					scan.nextLine();
					System.out.println("\nPacientes cadastrados no sistema: ");
					for(int i = 0; i < nome.size(); i++) {
						System.out.println("Nome: " + nome.get(i) + ", Idade: " + idade.get(i)
						+ ", Altura: " + altura.get(i) + "" + ", Peso: " + peso.get(i) + ", Cartão do SUS: " 
						+ sus.get(i) + ", Diabético: " + dm.get(i) + ", Hipertenso: " + has.get(i));
				    }
					break;
				case 0:
					System.out.println("\nFinalizou o programa!!!");
					break;
					default:
						System.out.println("\nOpção inválida!!!");
				}
								
			} while (prontuario != 0);
			
		}catch (InputMismatchException inputMismatchException ) {
			System.err.println("Exceção: " + inputMismatchException);
			scan.nextLine();
			System.out.println("\nVocê deve inserir apenas com valores compatíveis.");
			
		}catch (ArithmeticException arithmeticException) {
			System.err.println("Exceção: " + arithmeticException);
			scan.nextLine();
			System.out.println("\nVocê deve entrar com um valor compatível!");

		}
			catch(IndexOutOfBoundsException indexout) {
			System.err.println("Exceção: " + indexout);
			scan.nextLine();
			System.out.println("\nLista menor que o índice inserido!");
		}
	}

	@Override
	public void febre(double testeTemperatura) {
		
	}

	@Override
	public void cartaoCovid(boolean vac) {
		
	}

	@Override
	public void visitar() {
		
	}

	@Override
	public void encaminhar() {
		
	}
}
