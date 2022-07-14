
public abstract class Funcionarios {
	private String nome;
	private String dias;
	
	
	public Funcionarios(String nome, String dias) {
		this.nome = nome;
		this.dias = dias;
		System.out.println("Profissional: " + nome);
		System.out.println("Está na UBS nos seguites dias: " +  dias);
	}

		public abstract void realizarConsulta();
		public abstract void encaminhar();
		public abstract void prescricao();
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDias() {
			return dias;
		}
		public void setDias(String dias) {
			this.dias = dias;
		}
	
		
}
