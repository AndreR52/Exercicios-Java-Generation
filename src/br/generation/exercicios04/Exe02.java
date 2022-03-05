/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

package br.generation.exercicios04;

import java.util.Random;
import java.util.Scanner;

public class Exe02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int rolagens, maiorPontuacao = 0, contador = 0, soma = 0;
		double media;
				
		System.out.println("Quantas vezes deseja rolar o dado?");
		rolagens = input.nextInt();
		
		System.out.println("Resultados dos lançamentos dos dados: ");
		
		int dado[] = new int[rolagens];
		
		for(int i = 0; i < rolagens; i++) {
			dado[i] = random.nextInt(6) + 1;
			
			System.out.println(dado[i]);
			
			Thread.sleep(700);			
			
			if(maiorPontuacao < dado[i]) {
				contador = 0;
			}
			soma += dado[i];
			
			if(maiorPontuacao <= dado[i]) {
				maiorPontuacao = dado[i];
				contador++;
			}
		}
		media =(double) soma / rolagens;
		
		System.out.println("A média dos resultados do dado é " + media + ".");
		System.out.println("O maior resultado nos dados foi: " + maiorPontuacao
				+ " e ele ocorreu " + contador + " vezes.");
		
		input.close();
	}

}
