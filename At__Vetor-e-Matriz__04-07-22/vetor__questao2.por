programa
{
	
	funcao inicio()
	{
		inteiro valor[4], valores = 0, contar = 0, media = 0, soma = 0, maiorP = 0, qts = 0
		para(inteiro i = 0; i < 4; i++){
			escreva("\nInsira aqui a pontuação que deu: ")
			leia(valores)
			valor[i] = valores
			contar++
			
			soma = soma + valores
		     media = soma / contar

		     se(valor[i] == 6){
		     	qts++
		     }

		}
		escreva("\nVezes que saiu a maior pontuação: ", qts)
		escreva("\nMédia: ", media)
		escreva("\nQuanto foram lançados: ", contar)
		escreva("\nPontuações: ")
		para(inteiro i = 0; i < 4; i++ ){
			escreva("[", valor[i], "] ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 533; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */