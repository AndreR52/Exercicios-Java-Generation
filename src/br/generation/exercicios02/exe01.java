//Faça um programa que receba três inteiros e diga qual deles é o maior.

package br.generation.exercicios02;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro número inteiro: ");
		numero1 = leia. nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		numero2 = leia. nextInt();
		
		System.out.println("Digite o terceiro número inteiro: ");
		numero3 = leia. nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3) {			
			
			if(numero1 == numero2 && numero1 != numero3) {
				
				System.out.println("O primeiro e o segundo números são iguais e maiores que o terceiro.");
			}
			
			else if(numero1 == numero3 && numero1 != numero2) {
				
				System.out.println("O primeiro e o terceiro números são iguais e maiores que o segundo.");
			}
			
			else if(numero1 == numero2 && numero1 == numero3) {
				
				System.out.println("Os três números são iguais.");
				
			}
			else {
			
			System.out.println("O maior número entre os digitados é o primeiro.");
			}
			
		}
		
		else if(numero2 >= numero1 && numero2 >= numero3) {
			
			if(numero1 == numero2 && numero2 != numero3) {
				
				System.out.println("O primeiro e o segundo números são iguais e maiores que o terceiro.");
			}
			
			else if(numero2 == numero3 && numero1 != numero2) {
				
				System.out.println("O segundo e o terceiro números são iguais e maiores que o primeiro.");
			}
			
			else if(numero1 == numero2 && numero1 == numero3) {
				
				System.out.println("Os três números são iguais.");
				
			}
			else {
			
			System.out.println("O maior número entre os digitados é o segundo.");
			}
		}
		
		else {
			
			if(numero3 == numero2 && numero2 != numero3) {
				
				System.out.println("O segundo e o terceiro números são iguais e maiores que o primeiro.");
			}
			
			else if(numero1 == numero3 && numero3 != numero2) {
				
				System.out.println("O primeiro e o terceiro número são iguais e maiores que o segundo.");
			}
			
			else if(numero1 == numero2 && numero1 == numero3) {
				
				System.out.println("Os três números são iguais.");
				
			}
			else {			
			
			System.out.println("O maior número entre os digitados é o terceiro.");
			}
		}
		
		leia.close();				
	}	

}
