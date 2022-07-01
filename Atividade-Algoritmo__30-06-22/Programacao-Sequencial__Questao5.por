programa
{
	
	funcao inicio()
	{
          real nota1, nota2, nota3
          real peso1 = 2.0, peso2 = 3.0, peso3 = 5.0
          real somaPesos = peso1 + peso2 + peso3
	
		escreva("Digite sua primeira nota: ")
		leia(nota1)
		escreva("Digite sua segunda nota: ")
		leia(nota2)
		escreva("Digite sua terceira nota: ")
		leia(nota3)

		real mediaPonderada = ((nota1*peso1 + nota2*peso2 + nota3*peso3) / somaPesos)
		 escreva("Aqui está sua média: ", mediaPonderada)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */