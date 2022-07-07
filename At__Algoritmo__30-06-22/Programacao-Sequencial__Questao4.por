programa
{
	inclua biblioteca Matematica-->matematic
	
	funcao inicio()
	{
		inteiro a, b, c
		real d

		escreva("Digite um número: ")
		leia(a)
		escreva("Digite outro número: ")
		leia(b)
		escreva("Digite o último número: ")
		leia(c)
		
		d = (matematic.potencia((a+b),2.0)+matematic.potencia((b+c), 2.0)) / 2
		escreva("\n Escreva o valor de D: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */