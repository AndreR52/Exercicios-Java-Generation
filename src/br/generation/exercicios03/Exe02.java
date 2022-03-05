//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package br.generation.exercicios03;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		System.out.println("Digite dez números inteiros e saiba quantos são par e quantos são ímpar:");
		
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.println(contador + "º número:");
			numero = in.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("Par\n");
				par++;
			}
			else {
				System.out.println("Ímpar\n");
				impar++;
			}
		}
		System.out.println(par + " números digitados são par e " + impar + " números digitados são ímpar");
		
		in.close();
	}
}
