programa
{
	
	funcao inicio()
	{
		inteiro matriz[3][3], soma = 0, somaP = 0, linha, coluna

		para(linha = 0; linha < 3; linha++){
			para(coluna = 0; coluna < 3; coluna++){
				escreva("\nDigite um número: ")
				leia(matriz[linha][coluna])
				soma += matriz[linha][coluna]//soma de todos os dados da matriz

				se(linha == coluna){//se a linha for igual a coluna somar os dados e imprimi-los
					somaP +=matriz[linha][coluna]
				}
				
			}
		}
			
		escreva("\nSoma dos dados da matriz: ", soma)
		escreva("\nSoma dos dados da diagonal principal: ", somaP)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 6, 10, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */