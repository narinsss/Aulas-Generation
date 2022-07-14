package exerciciosHerancaPolimorfismo;

public class Preguica extends Animal{

	public Preguica(int idade, String nome, String especie) {
		super(idade, nome, especie);
	}
	
	public Preguica(String habitoAlimentar, String habitat, String classe, String especie) {
		super(habitoAlimentar, habitat, classe, especie);
	}

	
	public static void main(String[] args) {
		Animal preguica = new Preguica("herbívoro", "arborícola", "mamífero", "preguiça");
		preguica.setSom(true);
		preguica.emitirSom();
	}


}
