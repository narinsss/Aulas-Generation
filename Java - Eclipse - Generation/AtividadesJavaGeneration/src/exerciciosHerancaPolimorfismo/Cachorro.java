package exerciciosHerancaPolimorfismo;

public class Cachorro extends Animal{
	public Cachorro(String habitoAlimentar, String habitat, String classe, int idade, String nome) {
		super(habitoAlimentar, habitat, classe, idade, nome);
	}
	private boolean correndo;

	void correr() {
		if(this.correndo == true){
			System.out.println("Cachorro correndo.....");
		}else {
			System.out.println("Cachorro parado......");
		}
	}
	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Onívoro", "doméstico", "mamífero", 12, "Dowg");
		cachorro.setSom(true);
		cachorro.emitirSom("cachorro");
	}
}
