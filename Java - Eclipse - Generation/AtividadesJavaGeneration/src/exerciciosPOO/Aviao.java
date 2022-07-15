package exerciciosPOO;

public class Aviao {
	protected String companhia;
	protected int bagagemLimite = 23;
	protected int qntdAssentos = 350;
	protected int passageiros = 348;
	protected String piloto;
	
	//M�TODOS PARA CALCULAR EXCESSO DE BAGAGEM
	public void carga(int peso) {
		 if(this.bagagemLimite < peso) {
			 System.out.println("Excesso de bagagem, dever� pagar uma taxa extra.");
		 }
		 if(peso > this.bagagemLimite && peso < 32) {
			 System.out.println("Voc� dever� pagar R$120");
		 }else if(peso > 32 && peso < 45) {
			 System.out.println("Voc� dever� pagar R$200");
		 }else {
			 System.out.println("N�o poder� transportar.");
		 }
	}
	//M�TODO PARA VER SE H� OU N�O H� ASSENTOS DISPON�VEIS, ATRAV�S DE QUANTAS PASSAGENS DESEJA
	public void assentos(int passagens) {
		int assentosLivres = this.qntdAssentos - this.passageiros;
		if(passagens > assentosLivres) {
			System.out.println("N�o ser� poss�vel, pois temos apenas " + assentosLivres + " assentos dispon�veis.");
		}else if(passagens <= assentosLivres) {
			System.out.println("Voc� escolheu " + passagens + " assentos, obrigada pela prefer�ncia, qual ser� a forma de pagamento? ");
		}
	}
	//METODO PARA ORGANIZAR MELHOR AS INFORMA��ES
	public void informacoesDeVoo() {
		System.out.println("Companhia a�rea: " + this.companhia);
		System.out.println("Comandante respons�vel pelo v�o: " + this.piloto);
	}
	
	
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao();
		aviao1.companhia = "Latam";
		aviao1.piloto = "Jonatan Abreu";//fict�cio
		aviao1.informacoesDeVoo();
		aviao1.assentos(2);

		
	}
	
}
