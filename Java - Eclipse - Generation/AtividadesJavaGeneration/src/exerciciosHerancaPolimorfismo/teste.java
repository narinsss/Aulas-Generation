package exerciciosHerancaPolimorfismo;

import java.util.ArrayList;

public class teste {

	public static void main(String[] args) {
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(new Cachorro(12, "Dowg", "Cachorro"));
		animais.add(new Cachorro(15, "lancy", "Cachorro"));
		System.out.println(animais.get(3).getNome());

	}

}
