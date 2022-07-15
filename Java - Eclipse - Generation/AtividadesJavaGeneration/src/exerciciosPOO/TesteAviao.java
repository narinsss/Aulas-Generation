package exerciciosPOO;

import java.util.ArrayList;
import java.util.List;

public class TesteAviao {
	public static void main(String[] args) {
		List<Aviao> avioes = new ArrayList<>();
		avioes.add(new Aviao());
		avioes.get(0).companhia = "Latam";
		avioes.get(0).piloto = "Jonatan Abreu";// fictício
		avioes.get(0).informacoesDeVoo();
		avioes.get(0).assentos(2);
		
		avioes.add(new Aviao());
		avioes.get(1).companhia = "Gol Linhas Aéreas";
		avioes.get(1).piloto = "Diniz";// fictício
		avioes.get(1).informacoesDeVoo();
		avioes.get(1).assentos(7);
		
		avioes.add(new Aviao());
		avioes.get(2).companhia = "AirLines";
		avioes.get(2).piloto = "Carlos";// fictício
		avioes.get(2).informacoesDeVoo();
		avioes.get(2).assentos(1);
		
		//para remover
		avioes.remove(2);
		
		for(Aviao aviao : avioes) {
			System.out.println("Aviões: " + aviao.companhia);
		}
		
		//
		//ao invés de lenght é size
		for(int i = 0; i < avioes.size(); i++) {
			System.out.println("Avião: " +avioes.get(i));
		}
		System.out.println(avioes.size());
		
		//For para Collections, ou lits(mais adequado e bonito)
		avioes.forEach(Aviao -> {
			System.out.println("Percorrendo: ");
			System.out.println("Avião " + Aviao.companhia);
		});
	}
}
