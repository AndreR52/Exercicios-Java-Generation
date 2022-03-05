/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

package br.generation.exercicios04;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] pontuacao = new double[5];
		double maiorPontuacao = 0.0;
				
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a pontuação da " + (i + 1) + "ª atividade:");
			pontuacao[i] = input.nextDouble();
			
			if(maiorPontuacao < pontuacao[i]) {
				maiorPontuacao = pontuacao[i];
			}
		}
		System.out.printf("As pontuações nas atividades foram : \n%.2f %.2f %.2f %.2f %.2f.", pontuacao[0], pontuacao[1], pontuacao[2], pontuacao[3], pontuacao[4]);
		System.out.println("A maior pontuaçaõ foi " + maiorPontuacao);
		
		input.close();
	}

}
