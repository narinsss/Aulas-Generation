programa
{
	
	funcao inicio(){
		real nota[5], notas = 0.0, maiorNota = 0.0, somaNotas

		para(inteiro i = 0; i < 5; i++){//registrar 5 notas
			escreva("\nNos informe suas notas: ")
			leia(notas)
			nota[i] = notas//inserir todas as 5 notas em cada posição do vetor

		se(maiorNota < notas){//para computar a maior nota, e passá-la para variavel maiorNota
			maiorNota = notas
		}
			
		}
		escreva("\nSua maior nota: ", maiorNota)
		escreva("\nSuas notas: ")
		
		para(inteiro i = 0; i < 5; i++){
			escreva("[",nota[i], "] ")//loop de inserir todas as cinco notas no mesmo formato
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nota, 5, 7, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */