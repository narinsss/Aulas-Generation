programa
{
	
	funcao inicio()
	{
		inteiro valor[10], valores = 0, contar = 0, media = 0, soma = 0, maiorP = 0, qts = 0
		para(inteiro i = 0; i < 10; i++){
			escreva("\nInsira aqui a lado que caiu: ")
			leia(valores)
			valor[i] = valores//fórmula para inserir os valores obtidos no loop, am casa posição do vetor
			contar++//contabilizar os lançamentos
			
			soma = soma + valores//soma de todas as pontuações para facilitar a fórmula da média
		     media = soma / contar

		     se(valor[i] == 6){//em cada volta irá registrar o lançamento que cair o lado 6 do dado
		     	qts++
		     }

		}
		escreva("\nVezes que saiu a maior pontuação: ", qts)
		escreva("\nMédia de pontuação: ", media)
		escreva("\nQuantas vezes o dado foi lançado: ", contar)
		escreva("\nPontuações: ")
		para(inteiro i = 0; i < 10; i++ ){//imprimir cada valor do vetor
			escreva("[", valor[i], "] ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 851; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valor, 6, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */