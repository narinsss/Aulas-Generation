
public interface UnBasicaSaude{
	// Interface com m�todos que todas as classes ir�o utilizar
	static void febre(double testeTemperatura) {
		if (testeTemperatura >= 37.5) {
			System.out.println("Sua temperatura est� acima de 37 graus, fa�a o teste de COVID!");
		} else if (testeTemperatura < 37 || testeTemperatura > 35) {
			System.out.println("Temperatura adequada, pode entrar!");
		}
	}

	static void cartaoCovid(boolean vac) {
		if (vac == true) {
			System.out.println("Todas as vacinas em dia, pode entrar e tirar a m�scara se preferir");
		} else if (vac == false) {
			System.out.println(
					"Marque um dia para completar suas vacinas, ou tome agora se dispon�vel, mas n�o poder� remover a m�scara ou permeneccer por mais de 5 minutos!");
		}
	}
}
