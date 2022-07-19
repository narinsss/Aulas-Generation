package exerciciosPOO;

import java.util.ArrayList;
import java.util.List;

public class TesteAviao {
	public static void main(String[] args) {
		List<Aviao> avioes = new ArrayList<>();
		avioes.add(new Aviao());
		avioes.get(0).companhia = "Latam";
		avioes.get(0).piloto = "Jonatan Abreu";// fict�cio
		avioes.get(0).informacoesDeVoo();
		avioes.get(0).assentos(2);
		
		avioes.add(new Aviao());
		avioes.get(1).companhia = "Gol Linhas A�reas";
		avioes.get(1).piloto = "Diniz";// fict�cio
		avioes.get(1).informacoesDeVoo();
		avioes.get(1).assentos(7);
		
		avioes.add(new Aviao());
		avioes.get(2).companhia = "AirLines";
		avioes.get(2).piloto = "Carlos";// fict�cio
		avioes.get(2).informacoesDeVoo();
		avioes.get(2).assentos(1);
		
		//para remover
		avioes.remove(2);
		
		for(Aviao aviao : avioes) {
			System.out.println("Avi�es: " + aviao.companhia);
		}
		
		//
		//ao inv�s de lenght � size
		for(int i = 0; i < avioes.size(); i++) {
			System.out.println("Avi�o: " +avioes.get(i));
		}
		System.out.println(avioes.size());
		
		//For para Collections, ou lits(mais adequado e bonito)
		avioes.forEach(Aviao -> {
			System.out.println("Percorrendo: ");
			System.out.println("Avi�o " + Aviao.companhia);
		});
	}
}
