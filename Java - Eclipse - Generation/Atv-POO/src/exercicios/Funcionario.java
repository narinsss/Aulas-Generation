package exercicios;

public class Funcionario {
	private String[] funcao = new String[4];
	private double salario;
	private int jornada;
	private String nome;
	
	public void funcoes(int num) {
		this.funcao[0] = "Atendente";
		this.funcao[1] = "Comprador";
		this.funcao[2] = "Gerente";
		this.funcao[3] = "Caixa";
		
		if(num == 1) {
			System.out.println("Cargo: " + this.funcao[0]);
			this.salario = 1110;
			this.jornada = 8;
		}else if(num == 2) {
			System.out.println("Cargo: " + this.funcao[1]);
			this.salario = 1400;
			this.jornada = 4;
		}else if(num == 3) {
			System.out.println("Cargo: " + this.funcao[2]);
			this.salario = 2500;
			this.jornada = 6;
		}else if(num == 4) {
			System.out.println("Cargo: " + this.funcao[3]);
			this.salario = 1250;
			this.jornada = 8;
		}	
	}
	public void info() {
		System.out.println("Funcionárie: " + this.nome);
		System.out.println("Salário mensal: " + this.salario);
		System.out.println("Jornada diária: " + this.jornada + "h.");
	}
	
	//GETTERS AND SETTERS
	public String[] getFuncao() {
		return funcao;
	}
	public void setFuncao(String[] funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getJornada() {
		return jornada;
	}
	public void setJornada(int jornada) {
		this.jornada = jornada;
	}
	
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Júlia Martins";
		funcionario1.funcoes(1);
		funcionario1.info();
	}
}
