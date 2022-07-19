programa
{
	
	funcao inicio()
	{
		real fabri, distribuidor, imposto, custo, total
		escreva("Valor da fabricação: ")
		leia(fabri)

		distribuidor = ((28*fabri)/100)
		imposto = ((45*fabri)/100)
		total = fabri + distribuidor + imposto

		escreva("O custo ao consumidor ficou no total de: " + total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 304; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */