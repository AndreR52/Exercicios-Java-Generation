/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package br.generation.exercicios03;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		float media = 0.0f;
		
		do {
			System.out.println("Digite um n�mero inteiro. Para encerrar o programa digite 0");
			numero = input.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
			soma += numero;
			contador++;
			}		
		}
		while(numero != 0);
		media =(float) soma / contador;		
		System.out.println("A m�dia dos m�ltiplos de 3 digitados �: " + media);
		
		input.close();
	}

}
