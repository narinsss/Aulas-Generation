programa
{
	inclua biblioteca Matematica-->matematic
	
	funcao inicio()
	{
		real x1 = 7.0, x2 = 10.0, y1 = 3.0, y2 = 12.0, raiz, distancia

		distancia = (matematic.potencia((x2 - x1) ,2.0) + matematic.potencia((y2 - y1) ,2.0))
		raiz = (matematic.raiz(distancia, 2.0))
		escreva("Distância entre os dois pontos no plano cartesiano: ", matematic.arredondar(raiz, 1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 371; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */