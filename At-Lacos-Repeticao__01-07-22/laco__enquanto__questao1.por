programa
{
	
	funcao inicio()
	{
		inteiro numeros = 1, media = 0, total = 0, contador = 0
		
		
		enquanto(numeros > 0){
		     escreva("\nDigite números positivos: ")
		     leia(numeros)
		     total += numeros
		     contador++
		     media = total / contador 
			}
			escreva("\nSoma dos números: ", total)
			escreva("\nMédia dos números: ", media)
			escreva("\nTotal de números inseridos: ", contador)
			
			se(numeros < 0){
			escreva("\nVocê enviou ", numeros, ", reinicie o programa!")
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */