package exerciciosHerancaPolimorfismo;

public class Cavalo extends Animal{

	private boolean correndo;

	public Cavalo(String habitoAlimentar, String habitat, String classe, int idade, String nome) {
		super(habitoAlimentar, habitat, classe, idade, nome);
	}
	
	void correr() {
		if(this.correndo == true){
			System.out.println("Cavalo correndo.....");
		}else {
			System.out.println("Cavalo paradoo......");
		}
	}
	
	public static void main(String[] args) {
		Animal cachorro = new Cachorro("herb�voro", "dom�stico", "mam�fero", 18, "Flash");
		cachorro.setSom(false);
		cachorro.emitirSom("cavalo");
	}

}
