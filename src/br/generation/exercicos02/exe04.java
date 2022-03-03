/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/

package br.generation.exercicos02;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, quadrado;
		double raiz;
		
		System.out.println("Digite um n�mero inteiro: ");
		numero = leia. nextInt();
		
		if((numero % 2) == 0) {
			
			raiz = Math.sqrt(numero);
			
			System.out.println(numero + " � par e sua raiz quadrada � " + raiz);
			
		}
		else {
			
			quadrado = numero * numero; 
			
			System.out.println(numero + " � impar e o quadrado dele �: " + quadrado);
		}
		
		leia.close();		
	}

}
