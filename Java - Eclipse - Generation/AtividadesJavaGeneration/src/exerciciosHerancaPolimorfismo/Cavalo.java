package exerciciosHerancaPolimorfismo;

public class Cavalo extends Animal{

	public Cavalo(int idade, String nome, String especie) {
		super(idade, nome, especie);
	}
	
	public Cavalo(String habitoAlimentar, String habitat, String classe, String especie) {
		super(habitoAlimentar, habitat, classe, especie);
	}
	
	public static void main(String[] args) {
		Animal cavalo = new Cavalo(18, "Flash", "cavalo");
		cavalo.setSom(true);
		cavalo.setCorrendo(true);
		cavalo.emitirSom();
		cavalo.correr();
	}

}
