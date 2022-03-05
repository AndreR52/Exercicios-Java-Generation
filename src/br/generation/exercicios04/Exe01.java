/*Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.*/

package br.generation.exercicios04;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] pontuacao = new double[5];
		double maiorPontuacao = 0.0;
				
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a pontua��o da " + (i + 1) + "� atividade:");
			pontuacao[i] = input.nextDouble();
			
			if(maiorPontuacao < pontuacao[i]) {
				maiorPontuacao = pontuacao[i];
			}
		}
		System.out.printf("As pontua��es nas atividades foram : \n%.2f %.2f %.2f %.2f %.2f.", pontuacao[0], pontuacao[1], pontuacao[2], pontuacao[3], pontuacao[4]);
		System.out.println("A maior pontua�a� foi " + maiorPontuacao);
		
		input.close();
	}

}
