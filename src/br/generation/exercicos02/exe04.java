/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/

package br.generation.exercicos02;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, quadrado;
		double raiz;
		
		System.out.println("Digite um número inteiro: ");
		numero = leia. nextInt();
		
		if((numero % 2) == 0) {
			
			raiz = Math.sqrt(numero);
			
			System.out.println(numero + " é par e sua raiz quadrada é " + raiz);
			
		}
		else {
			
			quadrado = numero * numero; 
			
			System.out.println(numero + " é impar e o quadrado dele é: " + quadrado);
		}
		
		leia.close();		
	}

}
