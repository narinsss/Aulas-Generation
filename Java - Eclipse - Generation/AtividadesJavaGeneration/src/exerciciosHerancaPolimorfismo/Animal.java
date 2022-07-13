package exerciciosHerancaPolimorfismo;

public class Animal {
	private String habitoAlimentar;
	private String habitat;
	private String classe;
	private int idade;
	private String nome;
	private boolean som;
	
	
	
	public Animal(String habitoAlimentar, String habitat, String classe, int idade, String nome) {
		super();
		this.habitoAlimentar = habitoAlimentar;
		this.habitat = habitat;
		this.classe = classe;
		this.idade = idade;
		this.nome = nome;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("É " + classe + ", " + habitoAlimentar + " e é um animal " + habitat + ".");
	}


	void emitirSom(String animal) {
		if(animal == "cavalo" && this.som == true) {
			System.out.println("Cavalo relinchando");
		}else if(animal == "cachorro" && this.som == true) {
			System.out.println("Cachorro latindo");
		}else if(animal == "preguiça" && this.som == true) {
			System.out.println("Preguiça chamando seus filhotes");
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
	
}
