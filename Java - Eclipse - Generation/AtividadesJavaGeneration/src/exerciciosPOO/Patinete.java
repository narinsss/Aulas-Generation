package exerciciosPOO;

public class Patinete {
	private String[] categoria = new String[2];
	private int preco;
	private int pesoLimite;
	private boolean trava;
	
	public void tipo(int num) {
		categoria[0] = "Infantil";
		categoria[1] = "Adulto";
		if(num == 1) {
			System.out.println("Patinete para " + categoria[0]);
			this.pesoLimite = 50;
			System.out.println("Peso limite: " + this.pesoLimite + "kg");
			this.preco = 180;
			System.out.println("Valor: R$" + this.preco + ".");
		}
		if(num == 2) {
			System.out.println("Patinete para " + categoria[1]);
			this.pesoLimite = 100;
			System.out.println("Peso limite: " + this.pesoLimite + "kg");
			this.preco = 369;
			System.out.println("Valor: R$" + this.preco + ".");
		}
	}
	public void color(String cor) {
		System.out.println("A cor do patinete é: " + cor);
	}
	public void ativo(boolean trava) {
		if(this.trava == true) {
			System.out.println("É necessário retirar a trava de segurança para testá-lo.");
		}else {
			System.out.println("Está destravado, pode testar o patinete.");
		}
	}
	
	public static void main(String[] args) {
		Patinete patinete1 = new Patinete();
		patinete1.color("Azul");
		patinete1.tipo(2);
		patinete1.ativo(false);
	}
}
