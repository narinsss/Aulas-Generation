programa
{
	
	funcao inicio()
	{
		inteiro a, b, c, d, eh, f, x, y
	
		escreva("Escreva 6 números aqui: ")
		leia(a, b, c, d, eh, f)

		x = ((c*eh - b*f) / a*eh - b*d)
		y = ((a*f - c*a) / a*eh - b*d)

		escreva("Valor de x: ", x)
		escreva("\nValor de y: ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */