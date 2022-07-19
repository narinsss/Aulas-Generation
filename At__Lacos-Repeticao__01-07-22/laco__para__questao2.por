programa
{
	
	funcao inicio()
	{
		inteiro i, numero = 0, somaNumero = 0, impar
		para(i = 1; i <= 500; i++){
			se(i % 3 == 0){
				somaNumero += i
				escreva("\n", i)

			}
		}
		escreva("\n", somaNumero)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 131; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */