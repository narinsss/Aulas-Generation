programa
{
	
     inclua biblioteca Matematica-->matematic
     
	funcao inicio()
	{
     inteiro hora, minuto, seg, segundo
	
	escreva("Insira aqui o tempo de duração do evento em segundos: ")
	leia(seg)

	     hora = seg / 3600//1 hora tem 3600 segundos
	     minuto = (seg % 3600) / 60
		//minuto = (seg - (hora * 3600)) / 60 -- poderia ser dessa forma
		segundo = (seg % 3600) % 60
		//segundo = seg - (hora * 3600) - (minuto * 60)
		
	escreva("São: ", hora, " horas, ", minuto, " minutos, e ", segundo, " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */