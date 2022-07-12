package exercicios;

public class Aviao {
	private String companhia;
	private int bagagemLimite = 23;
	private int qntdAssentos = 350;
	private int passageiros = 348;
	private String piloto;
	
	//MÉTODOS PARA CALCULAR EXCESSO DE BAGAGEM
	public void carga(int peso) {
		 if(this.bagagemLimite < peso) {
			 System.out.println("Excesso de bagagem, deverá pagar uma taxa extra.");
		 }
		 if(peso > this.bagagemLimite && peso < 32) {
			 System.out.println("Você deverá pagar R$120");
		 }else if(peso > 32 && peso < 45) {
			 System.out.println("Você deverá pagar R$200");
		 }else {
			 System.out.println("Não poderá transportar.");
		 }
	}
	//MÉTODO PARA VER SE HÁ OU NÃO HÁ ASSENTOS DISPONÍVEIS, ATRAVÉS DE QUANTAS PASSAGENS DESEJA
	public void assentos(int passagens) {
		int assentosLivres = this.qntdAssentos - this.passageiros;
		if(passagens > assentosLivres) {
			System.out.println("Não será possível, pois temos apenas " + assentosLivres + " assentos disponíveis.");
		}else if(passagens <= assentosLivres) {
			System.out.println("Você escolheu " + passagens + " assentos, obrigada pela preferência, qual será a forma de pagamento? ");
		}
	}
	//METODO PARA ORGANIZAR MELHOR AS INFORMAÇÕES
	public void informacoesDeVoo() {
		System.out.println("Companhia aérea: " + this.companhia);
		System.out.println("Comandante responsável pelo vôo: " + this.piloto);
	}
	
	
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.companhia = "Latam";
		aviao1.piloto = "Jonatan Abreu";//fictício
		aviao1.informacoesDeVoo();
		aviao1.assentos(2);

		
	}
	
}
