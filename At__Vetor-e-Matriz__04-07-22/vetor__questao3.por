programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], linha, coluna, somaM1 = 0, subM2 = 0

		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva("\nDigite um número para calcular com a segunda2 tabela: ")
				leia(n1[linha][coluna])
				escreva("\nDigite um número para calcular com a primeira tabela: ")
				leia(n2[linha][coluna])

				m1[linha][coluna] = n1[linha][coluna] + n2[linha][coluna]//insere nas mesmas posições da matriz m1, os dados da soma da matriz n1+n2
				somaM1 = m1[linha][coluna]

				m2[linha][coluna] = n1[linha][coluna] - n2[linha][coluna]
				subM2 = m2[linha][coluna]
			}
		}
		//loop para imprimir cada posição da matriz m1 e m2
		escreva("\nSoma dos elementos: ")
		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva(" [", m1[linha][coluna], "] ")
			}
		}
		escreva("\nSubtração dos elementos: ")
		para(linha = 0; linha < 4; linha++){
			para(coluna = 0; coluna < 6; coluna++){
				escreva(" [", m2[linha][coluna], "] ")
			}
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 10, 2}-{n2, 6, 20, 2}-{m1, 6, 30, 2}-{m2, 6, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */