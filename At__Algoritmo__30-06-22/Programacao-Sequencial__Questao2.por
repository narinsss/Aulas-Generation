programa
{
	
	funcao inicio()
	{
	     inteiro dia, mes, ano, dia2, mes2, ano2, diasVida = 0, dia3 = 0
	     
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
		
		enquanto (dia < dia2 ou mes < mes2 ou ano < ano2){
			diasVida++ 
			dia++
			se(dia > 30) {
				dia = 1
				mes++
				se(mes > 12){
					mes = 1
					ano++
				}
			}
		}
		escreva("Olá, você tem ", diasVida, " dias de vida.")
		escreva("\n")

		escreva("Agora que já sabe quantos dias de vida tens, digite aqui os dias: ")
		leia(diasVida)

		ano = diasVida / 365
		mes = (diasVida % 365) / 30
		dia = (diasVida % 365) % 30

		escreva("Você tem ", ano, " anos, ", dia, " meses", ", e ", mes, " dias.")

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 660; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */