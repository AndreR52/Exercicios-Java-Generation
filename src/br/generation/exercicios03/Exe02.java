//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package br.generation.exercicios03;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		System.out.println("Digite dez n�meros inteiros e saiba quantos s�o par e quantos s�o �mpar:");
		
		for(int contador = 1; contador <= 10; contador++) {
			
			System.out.println(contador + "� n�mero:");
			numero = in.nextInt();
			
			if(numero % 2 == 0) {
				System.out.println("Par\n");
				par++;
			}
			else {
				System.out.println("�mpar\n");
				impar++;
			}
		}
		System.out.println(par + " n�meros digitados s�o par e " + impar + " n�meros digitados s�o �mpar");
		
		in.close();
	}
}
