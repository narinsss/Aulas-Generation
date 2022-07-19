package exerciciosPOO;

public class Paciente {
	private String nome;
	private int idade;
	private String[] exames = {"Exame de Sangue", "Colonoscopia", "Ultrassonografia", "Emerg�ncia"};
	private String cartao_sus;
	private boolean doente;
	
	
	public Paciente(String nome, int idade, String cartao_sus) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cartao_sus = cartao_sus;
		System.out.println("Paciente: " + this.nome);
		System.out.println("Idade do paciente: " + this.idade);
		System.out.println("N�mero do cart�o do SUS: " + this.cartao_sus);
	}

	void consulta() {
		if(doente == false) {
			System.out.println("Dever� marcar consulta antecipada.");
		}else if(doente == true){
			System.out.println("Sua consulta ser� de emerg�ncia, n�o ser� necess�ria a marca��o.");
		}
	}
	void marcar(int tipoConsulta){
		if(tipoConsulta == 1) {
			System.out.println("O exame escolhido foi: " + exames[0]);
			double valor = 35;
			System.out.println("Valor: R$" + valor);
		}else if(tipoConsulta == 2) {
			System.out.println("O exame escolhido foi: " + exames[1]);
			double valor = 120;
			System.out.println("Valor: R$" + valor);
		}else if(tipoConsulta == 3) {
			System.out.println("O exame escolhido foi: " + exames[2]);
			double valor = 1200;
			System.out.println("Valor: R$" + valor);
		}else if(tipoConsulta == 4) {
			System.out.println("O exame escolhido foi: " + exames[3]);
			System.out.println("Valor depende dos exames necess�rios.");
		}
	}
	
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Marina Rosa", 22, "0895-1");
		paciente1.marcar(3);
		
	}
}
