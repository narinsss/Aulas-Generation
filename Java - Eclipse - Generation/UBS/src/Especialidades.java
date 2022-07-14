
public class Especialidades {
	private String[] tipo = {"Enf", "AC", "MedClin"};
	private String dias;
	
	void diasConsulta(String tipo) {
		if(tipo == "enf") {
			System.out.println("Segunda, quarta e sexta-feira");
		}else if(tipo == "ac") {
			System.out.println("Terça, quinta-feira");
		}else if(tipo == "med") {
			System.out.println("Todo dia");
		}
	}
	
	public String[] getTipo() {
		return tipo;
	}

	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}
	
	


}
