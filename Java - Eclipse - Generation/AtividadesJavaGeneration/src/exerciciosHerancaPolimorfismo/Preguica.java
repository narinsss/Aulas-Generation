package exerciciosHerancaPolimorfismo;

public class Preguica extends Animal{

	private boolean subindo;

	public Preguica(String habitoAlimentar, String habitat, String classe, int idade, String nome) {
		super(habitoAlimentar, habitat, classe, idade, nome);
	}
	
	void subirArvore() {
		if(this.subindo == true){
			System.out.println("Preguiça subindo.....");
		}else {
			System.out.println("Preguiça sentada em um galho......");
		}
	}
	
	public static void main(String[] args) {
		Animal cachorro = new Preguica("herbívoro", "arborícola", "mamífero", 7, "Lucy");
		cachorro.setSom(true);
		cachorro.emitirSom("preguica");
	}


}
