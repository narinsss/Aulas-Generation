
public abstract class Especialidades implements UBS{
		protected String tipoEspecialidades;
		protected String cartSus;
		protected int idade;
		protected String endereco;
		protected String cpf;
		protected double altura;
		protected double peso;
		protected Boolean has;
		protected Boolean dm;
		protected Boolean vac;
		protected String nome;


		public Especialidades (String nomeProfissional, String especialidade)
		{
			System.out.println("\nProfissional: "+nomeProfissional+" - "+especialidade);
		}
		
		void cadastrar() {
			System.out.println("\nNome: " + this.nome);
			System.out.println("\nIdade: " + this.idade);
			System.out.println("\nPeso: " + peso + " , altura: " + altura);
			if(this.has == false ) {
				System.out.println("\nHipertens: n�o");
			}else if(this.has == true){
				System.out.println("\nHipertens: sim");
			}
			if(this.dm == false) {
				System.out.println("Diab�tic: n�o");
			}else {
				System.out.println("Diab�tic: sim");
			}
			System.out.println("Cart�o do SUS: " + this.cartSus);
			if(vac == true) {
				System.out.println("Vacina contra o COVID completo.");
			}else if(vac == false) {
				System.out.println("VPendente.");
			}
		}
		
		void medicar(boolean doente) {
			if(doente == true) {
				System.out.println("Sente-se que iremos preparar a medica��o.");
			}else if(doente == false) {
				System.out.println("Felizmente voc� est� em, iremos liber�-lo, caso precise de atestado, solicite na sa�da.");
			}
		}
		
		void marcarConsulta(String especialidade) {
			switch(especialidade) {
			case "medicina":
				System.out.println("\nOs dias dispon�veis s�o: ");
				System.out.println("\nSegunda-Feira 8h-11h");
				System.out.println("\nQuarta-Feira 8h-13h");
			case "enfermagem":
				System.out.println("\nOs dias dispon�veis s�o: ");
				System.out.println("\nSegunda-Feira � Quinta-Feira 8h-11h e 13h-16h");
			case "agtComun":
				System.out.println("\nOs dias dispon�veis s�o: ");
				System.out.println("\nSegunda-Feira � Sexta-Feira 8h-11h e 13:30h-16h");
				System.out.println("\nOu ligue para: #####-####");
			}
		}
		
		// M�TODOS ABSTRATOS
		abstract public void visitar();
		abstract public void encaminhar();


		public String getTipoEspecialidades() {
			return tipoEspecialidades;
		}


		public void setTipoEspecialidades(String tipoEspecialidades) {
			this.tipoEspecialidades = tipoEspecialidades;
		}
		
}
