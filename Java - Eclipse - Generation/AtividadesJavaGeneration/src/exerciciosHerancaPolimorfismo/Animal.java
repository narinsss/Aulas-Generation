package exerciciosHerancaPolimorfismo;

public abstract class Animal {
	private String habitoAlimentar;
	private String habitat;
	private String classe;
	private int idade;
	private String nome;
	private boolean som;
	private boolean correndo;
	private boolean subindo;
	private String especie;
	private String artigo;

	public Animal(String habitoAlimentar, String habitat, String classe, String especie) {
		super();
		this.habitoAlimentar = habitoAlimentar;
		this.habitat = habitat;
		this.classe = classe;
		this.especie = especie;

		if (especie == "cachorro" || especie == "cavalo") {
			this.artigo = "O ";
		} else {
			this.artigo = "A ";
		}
		System.out.println(artigo + especie + " é um animal " + classe + ", " + habitoAlimentar + " e é um animal "
				+ habitat + ".");
	}

	public Animal(int idade, String nome, String especie) {
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

	void emitirSom() {
		if (this.especie == "cavalo" && this.som == true) {
			System.out.println("Cavalo relinchando");
		} else if (this.especie == "cachorro" && this.som == true) {
			System.out.println("Cachorro latindo");
		} else if (this.especie == "preguica" && this.som == true) {
			System.out.println("Preguiça chamando seus filhotes");
		}
	}

	void correr() {
		if (this.correndo == true && this.especie == "cachorro") {
			System.out.println("Cachorro correndo.....");
		} else if (this.correndo == true && this.especie == "cavalo") {
			System.out.println("Cavalo correndo.....");
		}
	}

	void subirArvore() {
		if (this.subindo == true && this.especie == "preguica") {
			System.out.println("Preguiça subindo.....");
		} else {
			System.out.println("Preguiça sentada em um galho......");
		}
	}

	public String getHabitoAlimentar() {
		return habitoAlimentar;
	}

	public void setHabitoAlimentar(String habitoAlimentar) {
		this.habitoAlimentar = habitoAlimentar;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isSom() {
		return som;
	}

	public void setSom(boolean som) {
		this.som = som;
	}

	public boolean isCorrendo() {
		return correndo;
	}

	public void setCorrendo(boolean correndo) {
		this.correndo = correndo;
	}

	public boolean isSubindo() {
		return subindo;
	}

	public void setSubindo(boolean subindo) {
		this.subindo = subindo;
	}

}
