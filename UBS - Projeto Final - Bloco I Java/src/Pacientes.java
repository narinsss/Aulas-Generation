import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pacientes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Especialidades> cadastro = new ArrayList<Especialidades>();
		cadastro.add(new Especialidades());
		cadastro.get(0).setNome("Marina Rosa");
		System.out.println(cadastro.get(0).getNome());	
	}

}
