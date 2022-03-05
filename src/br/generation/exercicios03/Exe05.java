/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/

package br.generation.exercicios03;

import java.util.Scanner;

public class Exe05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double numero, soma = 0.0;
		
		do {
			System.out.println("Digite um número para somar. Para encerrar o programa digite 0.");
			numero = input.nextDouble();
			
			soma += numero;			
		}
		while(numero != 0);
	System.out.printf("A soma dos números digitados é: %.2f" , soma);
	
	input.close();
	}
}
