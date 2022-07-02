programa
{
	inclua biblioteca Matematica --> math
	funcao inicio()
	{
          inteiro i, pessoas = 1, salario, filhos, mediaSalarial, mediaFilhos, maiorSalario = 0, somaSalario = 0, somaFilhos = 0, percentual = 0, salarioCem = 0
          cadeia ok

	     
		escreva("Olá, a prefeitura deseja coletar algumas informações suas, se puder nos ajudar digite Ok, por favor! ")
		leia(ok)
		
		para(i = 1; i <= 4; i++){
		     escreva("Insira aqui seu salário mensal: ")
		     leia(salario)
		     escreva("Insira aqui quantos filhos você têm: ")
		     leia(filhos)

		     pessoas = i //contabilizar habitantes da cidade que participaram da pesquisa
		     somaSalario += salario
		     somaFilhos += filhos

		     se(maiorSalario <= salario ){//maior salário
		     	maiorSalario = salario
		     }

		     se(salario <= 100){
		     	salarioCem++
		     	percentual = (salarioCem * 100) / pessoas
		     }
		}
		mediaSalarial = somaSalario / pessoas
		mediaFilhos = somaFilhos / pessoas
		
		
		escreva("\nMédia salarial da cidade com base nas pesquisas: : ", mediaSalarial)
		escreva("\nMédia do número de filhos com base nas pesquisas: : ", mediaFilhos)
		escreva("\nMaior salário com base nas pesquisas: : ", maiorSalario)
		escreva("\nA porcentagem de pessoas com salário abaixo ou igual a R$100,00 mensal é de ", percentual, "%.")
		escreva("\n")
		escreva("\nObrigada por participar de nossa pesquisa!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1350; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */