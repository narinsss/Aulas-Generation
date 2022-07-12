package exercicios;

public class Cliente {
	private String nome;
	private String cpf;
	private int frequencia;//frequencia de visita na suposta loja
	
	public void calcularFrequencia(int visitasMes){
		this.frequencia = visitasMes / 4;
		System.out.println("Frequência de visitas da " + this.nome + ":");
		System.out.println(frequencia + " visitas por semana.");
	}
	
	public void cadastro() {//só pra expor o nome e cpf mais organizadinho
		System.out.println("Cliente: " + this.nome);
		System.out.println("CPF: " + this.cpf);
	}
	
//método main pra testar os métodos
	public static void main(String[] args) {
		Cliente marina = new Cliente();
		marina.cpf = "120.666.555-74";
		marina.nome = "Marina Rosa";
		marina.cadastro();
		marina.calcularFrequencia(10);	
	}
}
