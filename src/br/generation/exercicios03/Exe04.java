/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
- o n�mero de pessoas calmas;
- o n�mero de mulheres nervosas;
- o n�mero de homens agressivos;
- o n�mero de outros calmos;
- o n�mero de pessoas nervosas com mais de 40 anos;
- o n�mero de pessoas calmas com menos de 18 anos.*/

package br.generation.exercicios03;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0;
		int nervosasMais40 = 0, calmasMenos18 = 0;
		int totalEntrevistados, contador = 0;
		int idade, sexo, opcao;
		
		System.out.println("Digite quantos entrevistados a pesquisa engloba:");
		totalEntrevistados = input.nextInt();
		
		//La�o caso o n�mero de entrevistados seja inv�lido
		while(totalEntrevistados <= 0) { 
			System.out.println("O n�mero de entrevistados deve ser um n�mero inteiro positivo. Por favor, tente novamente:");
			totalEntrevistados = input.nextInt();
		}
		//La�o para pegar as informa��es dos entrevistados
		while(contador < totalEntrevistados) { 
			contador++;
			System.out.println("Digite a idade do " + contador + "� entrevistado: ");
			idade = input.nextInt();
			
			System.out.println("Qual o sexo do " + contador + "� entrevistado? \n1-Feminino \n2-Masculino \n3-Outro");
			sexo = input.nextInt();
			
			//La�o caso o c�digo do sexo seja inv�lido
			while(sexo < 1 || sexo > 3) { 
				System.out.println("O codigo para o sexo � entre 1 e 3 apenas. Por favor digite novamente: \n1-Feminino \n2-Masculino \n3-Outro");
				sexo = input.nextInt();
			}
			System.out.println("O " + contador + "� entrevistado � uma pessoa: \n1-Calma \n2-Nervosa \n3-Agressiva");
			opcao = input.nextInt();
			
			//La�o caso o c�digo da op��o seja inv�lido
			while(opcao < 1 || opcao > 3) { 
				System.out.println("O codigo � entre 1 e 3 apenas. Por favor digite novamente: \n1-Calma \n2-Nervosa \n3-Agressiva");
				opcao = input.nextInt();
			}
			if(opcao == 1) {
				pessoasCalmas++;
			}
			if(sexo == 1 && opcao == 2) {
				mulheresNervosas++;
			}
			if(sexo == 2 && opcao == 3) {
				homensAgressivos++;
			}
			if(sexo == 3 && opcao == 1) {
				outrosCalmos++;
			}
			if(opcao == 2 && idade > 40) {
				nervosasMais40++;
			}
			if(opcao == 1 && idade < 18) {
				calmasMenos18++;
			}
		}
		System.out.println("O resultado da pesquisa entre os " + totalEntrevistados + " entrevistados �: \n"
				+ "Pessoas calmas: " + pessoasCalmas
				+ "\nMulheres nervosas: " + mulheresNervosas
				+ "\nHomens agressivos: " + homensAgressivos
				+ "\nOutros calmos: " + outrosCalmos
				+ "\nPessoas nervosas acima dos 40 anos:" + nervosasMais40
				+ "\nPessoas calmas abaixo dos 18 anos: " + calmasMenos18);
		
		input.close();
	}

}
