/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

package br.generation.exercicios03;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0, contador = 1;
		
		System.out.println("Digite a idade de quantas pessoas quiser para saber quantas tem menos de 21 anos e quantas tem mais de 50 anos\n");
		while(idade != -99) {
						
			System.out.println("Digite a idade da " + contador + "ª pessoa\nOu\nDigite -99 para ver a contagem e encerrar o programa. ");
			idade = input.nextInt();
			contador++;
			
			if(idade < 21) {
				menos21++;
			}
			else if(idade > 50) {
				mais50++;
			}
			
		}
		System.out.println("Das pessoas consultadas, " + menos21 + " tem menos de 21 anos e " + mais50 + " tem mais de 50 anos.");
		
		input.close();
	}

}
