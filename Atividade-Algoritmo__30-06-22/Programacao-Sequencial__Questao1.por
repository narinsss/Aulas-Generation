programa 
{
	
	funcao inicio()
	{
	     inteiro dia, mes, ano, dia2, mes2, ano2, diasVida = 0
	     
		escreva("Digite o dia de seu aniversário: ")
		leia(dia)
		escreva("Digite o mês de seu aniversário: ")
		leia(mes)
		escreva("Digite o ano de seu nascimento: ")
		leia(ano)

		escreva("\n")
		escreva("Registrado, segundo passo abaixo: ")
		escreva("\n")
		
	     escreva("\nDigite o dia de hoje: ")
		leia(dia2)
		escreva("Digite o mês que estamos: ")
		leia(mes2)
		escreva("Digite o ano que estamos: ")
		leia(ano2)
		escreva("\n")
		//Neste laço a data de nascimento será 0, e o dia atual o número de dias vividos, cada dia que passar da data de nascimento somará +1 no laço até chegar ao dia atual
		//
		enquanto (dia < dia2 ou mes < mes2 ou ano < ano2){//enquanto a data de nascimento for menor que a data atual
			diasVida++ //some mais um dia de vida
			dia++
			se(dia > 30) {//se o mês exceder 30 dias o dia volta a ser 1, e o mês soma +1
				dia = 1
				mes++
				se(mes > 12){ //se o mês exceder 12, o mês volta a ser 1 e o ano soma +1
					mes = 1
					ano++
				}
			}
		}
		escreva("Olá, você tem ", diasVida, " dias de vida.")
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */