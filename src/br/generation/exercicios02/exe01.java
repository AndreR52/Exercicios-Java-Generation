//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package br.generation.exercicios02;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		numero1 = leia. nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		numero2 = leia. nextInt();
		
		System.out.println("Digite o terceiro n�mero inteiro: ");
		numero3 = leia. nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3) {			
			
			if(numero1 == numero2 && numero1 != numero3) {
				
				System.out.println("O primeiro e o segundo n�meros s�o iguais e maiores que o terceiro.");
			}
			
			else if(numero1 == numero3 && numero1 != numero2) {
				
				System.out.println("O primeiro e o terceiro n�meros s�o iguais e maiores que o segundo.");
			}
			
			else if(numero1 == numero2 && numero1 == numero3) {
				
				System.out.println("Os tr�s n�meros s�o iguais.");
				
			}
			else {
			
			System.out.println("O maior n�mero entre os digitados � o primeiro.");
			}
			
		}
		
		else if(numero2 >= numero1 && numero2 >= numero3) {
			
			if(numero1 == numero2 && numero2 != numero3) {
				
				System.out.println("O primeiro e o segundo n�meros s�o iguais e maiores que o terceiro.");
			}
			
			else if(numero2 == numero3 && numero1 != numero2) {
				
				System.out.println("O segundo e o terceiro n�meros s�o iguais e maiores que o primeiro.");
			}
			
			else if(numero1 == numero2 && numero1 == numero3) {
				
				System.out.println("Os tr�s n�meros s�o iguais.");
				
			}
			else {
			
			System.out.println("O maior n�mero entre os digitados � o segundo.");
			}
		}
		
		else {
			
			if(numero3 == numero2 && numero2 != numero3) {
				
				System.out.println("O segundo e o terceiro n�meros s�o iguais e maiores que o primeiro.");
			}
			
			else if(numero1 == numero3 && numero3 != numero2) {
				
				System.out.println("O primeiro e o terceiro n�mero s�o iguais e maiores que o segundo.");
			}
			
			else if(numero1 == numero2 && numero1 == numero3) {
				
				System.out.println("Os tr�s n�meros s�o iguais.");
				
			}
			else {			
			
			System.out.println("O maior n�mero entre os digitados � o terceiro.");
			}
		}
		
		leia.close();				
	}	

}
