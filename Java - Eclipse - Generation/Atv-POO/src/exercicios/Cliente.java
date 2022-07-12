package exercicios;

public class Cliente {
	private String nome;
	private String cpf;
	private int frequencia;//frequencia de visita na suposta loja
	
	public void calcularFrequencia(int visitasMes){
		this.frequencia = visitasMes / 4;
		System.out.println("Frequ�ncia de visitas da " + this.nome + ":");
		System.out.println(frequencia + " visitas por semana.");
	}
	
	public void cadastro() {//s� pra expor o nome e cpf mais organizadinho
		System.out.println("Cliente: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
	
//m�todo main pra testar os m�todos
	public static void main(String[] args) {
		Cliente marina = new Cliente();
		marina.cpf = "120.666.555-74";
		marina.nome = "Marina Rosa";
		marina.cadastro();
		marina.calcularFrequencia(10);	
	}
}
