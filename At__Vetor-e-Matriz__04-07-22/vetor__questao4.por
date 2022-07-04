programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma = 0, somaP = 0
		caracter ast

		para(inteiro linha = 0; linha < 3; linha++){
			para(inteiro coluna = 0; coluna < 3; coluna++){
				escreva("\nDigite um número: ")
				leia(matriz[linha][coluna])
				soma += matriz[linha][coluna]
			}
		}
		escreva(soma)
		escreva("\n", somaP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 96; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */