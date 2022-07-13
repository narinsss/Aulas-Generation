package exerciciosPOO;

public class ContaBancaria {
	private int agencia;
	private String tipo[] = {"Poupan�a", "Corrente"};
	private int numero;
	private int digito;
	private double saldo;
	private double novoSaldo;
	
	void depositar(double valor) {
		this.novoSaldo = this.saldo + valor;
		System.out.println("Seu saldo � de R$" + this.saldo);
		System.out.println("Voc� depositou R$" + valor + ", seu saldo atual � de R$" + novoSaldo + ".");
	}
	
	void sacar(double valor) {
		double saque = this.novoSaldo - valor;
		System.out.println("Voc� sacou R$" + valor + ", seu saldo atual � de R$" + saque + ".");
	}
	
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.saldo = 250;
		conta1.depositar(25);
		conta1.sacar(25);
	}
	
}
