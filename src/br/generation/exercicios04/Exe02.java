/*Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.*/

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
		
		System.out.println("Resultados dos lan�amentos dos dados: ");
		
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
		
		System.out.println("A m�dia dos resultados do dado � " + media + ".");
		System.out.println("O maior resultado nos dados foi: " + maiorPontuacao
				+ " e ele ocorreu " + contador + " vezes.");
		
		input.close();
	}

}
