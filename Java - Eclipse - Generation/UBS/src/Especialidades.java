
public class Especialidades implements UnBasicaSaude{
	private int dias;
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private boolean hipertens;
	private boolean diabetic;
	private long cartSus;
	private boolean vac;
	
	
	void cadastrar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nIdade: " + this.idade);
		System.out.println("\nPeso: " + peso + " , altura: " + altura);
		if(this.hipertens == false ) {
			System.out.println("\nHipertens: não");
		}else if(this.hipertens == true){
			System.out.println("\nHipertens: sim");
		}
		if(this.diabetic == false) {
			System.out.println("Diabétic: não");
		}else {
			System.out.println("Diabétic: sim");
		}
		System.out.println("Cartão do SUS: " + this.cartSus);
		if(vac == true) {
			System.out.println("Vacina contra o COVID completo.");
		}else if(vac == false) {
			System.out.println("VPendente.");
		}
	}
	
	void medicar(boolean doente) {
		if(doente == true) {
			System.out.println("Sente-se que iremos preparar a medicação.");
		}else if(doente == false) {
			System.out.println("Felizmente você está em, iremos liberá-lo, caso precise de atestado, solicite na saída.");
		}
	}
	
	void marcarConsulta(String especialidade) {
		switch(especialidade) {
		case "medicina":
			System.out.println("\nOs dias disponíveis são: ");
			System.out.println("\nSegunda-Feira 8h-11h");
			System.out.println("\nQuarta-Feira 8h-13h");
		case "enfermagem":
			System.out.println("\nOs dias disponíveis são: ");
			System.out.println("\nSegunda-Feira à Quinta-Feira 8h-11h e 13h-16h");
		case "agtComun":
			System.out.println("\nOs dias disponíveis são: ");
			System.out.println("\nSegunda-Feira à Sexta-Feira 8h-11h e 13:30h-16h");
			System.out.println("\nOu ligue para: #####-####");
		}
	}
	
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isHipertens() {
		return hipertens;
	}
	public void setHipertens(boolean hipertens) {
		this.hipertens = hipertens;
	}
	public boolean isDiabetic() {
		return diabetic;
	}
	public void setDiabetic(boolean diabetic) {
		this.diabetic = diabetic;
	}
	public long getCartSus() {
		return cartSus;
	}
	public void setCartSus(long cartSus) {
		this.cartSus = cartSus;
	}
	public boolean isVac() {
		return vac;
	}
	public void setVac(boolean vac) {
		this.vac = vac;
	}
	
	
	


}
