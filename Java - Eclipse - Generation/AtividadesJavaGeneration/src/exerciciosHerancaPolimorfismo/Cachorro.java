package exerciciosHerancaPolimorfismo;

public class Cachorro extends Animal{
	
	//teste com dois construtores e como funcionam ao instanciá-los
	public Cachorro(int idade, String nome, String especie) {
		super(idade, nome, especie);
	}
	
	public Cachorro(String habitoAlimentar, String habitat, String classe, String especie) {
		super(habitoAlimentar, habitat, classe, especie);
	}
	
	public static void main(String[] args) {
		Animal cachorro = new Cachorro(3, "Dowg", "cachorro");
		cachorro.setSom(true);
		cachorro.emitirSom();
		cachorro.setCorrendo(true);
		cachorro.correr();
	}
}
