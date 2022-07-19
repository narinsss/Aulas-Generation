
public interface UnBasicaSaude{
	// Interface com métodos que todas as classes irão utilizar
	static void febre(double testeTemperatura) {
		if (testeTemperatura >= 37.5) {
			System.out.println("Sua temperatura está acima de 37 graus, faça o teste de COVID!");
		} else if (testeTemperatura < 37 || testeTemperatura > 35) {
			System.out.println("Temperatura adequada, pode entrar!");
		}
	}

	static void cartaoCovid(boolean vac) {
		if (vac == true) {
			System.out.println("Todas as vacinas em dia, pode entrar e tirar a máscara se preferir");
		} else if (vac == false) {
			System.out.println(
					"Marque um dia para completar suas vacinas, ou tome agora se disponível, mas não poderá remover a máscara ou permeneccer por mais de 5 minutos!");
		}
	}
}
