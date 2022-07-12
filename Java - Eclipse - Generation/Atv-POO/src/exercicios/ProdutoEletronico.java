package exercicios;

public class ProdutoEletronico {
	private double preco;
	private String[] aparelhos = new String[7];
	private double garantia;
	
	
	//METODO PARA O SELECIONAR QUAL APARELHO ELETRONICO DESEJA, E VALOR
	public void mostruario(int aparelho) {
		this.aparelhos[0] = "Mouse";
		this.aparelhos[1] = "HeadPhone Gamer";
		this.aparelhos[2] = "Adaptador Bluetooth";
		this.aparelhos[3] = "Ring Light";
		this.aparelhos[4] = "Mechanical Keyboard";
		this.aparelhos[5] = "Joystick";
		this.aparelhos[6] = "SSD 480gb";
		
		if(aparelho == 1) {
			System.out.println(this.aparelhos[0]);
			this.preco = 100;
			System.out.println("Valor: R$" + this.preco);
		}else if(aparelho == 2) {
			System.out.println(this.aparelhos[1]);
			this.preco = 180;
			System.out.println("Valor: R$" + this.preco);
		}else if(aparelho == 3) {
			System.out.println(this.aparelhos[2]);
			this.preco = 65;
			System.out.println("Valor: R$" + this.preco);
		}else if(aparelho == 4) {
			System.out.println(this.aparelhos[3]);
			this.preco = 220;
			System.out.println("Valor: R$" + this.preco);
		}else if(aparelho == 5) {
			System.out.println(this.aparelhos[4]);
			this.preco = 227;
			System.out.println("Valor: R$" + this.preco);
		}else if(aparelho == 6) {
			System.out.println(this.aparelhos[5]);
			this.preco = 98;
			System.out.println("Valor: R$" + this.preco);
		}else if(aparelho == 7) {
			System.out.println(this.aparelhos[6]);
			this.preco = 533;
			System.out.println("Valor: R$" + this.preco);
		}
	}
	
	public void valorSeguro() {
		this.garantia = this.preco / 10;
		System.out.println("O valor da garantia é R$" + garantia + ".");
		double total = this.garantia + this.preco;
		System.out.println("Valor total do produto: " + total + ".");
	}

	//TESTAR CÓDIGO
	public static void main(String[] args) {
		ProdutoEletronico mouse = new ProdutoEletronico();
		mouse.mostruario(3);
		mouse.valorSeguro();
	}
}
