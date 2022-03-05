//Faça um programa que entre com três números e coloque em ordem crescente.

package br.generation.exercicios02;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2, numero3;
		
		System.out.println("Digite três números: ");
		numero1 = leia. nextDouble();
		numero2 = leia. nextDouble();
		numero3 = leia. nextDouble();	
		
		if(numero1 >= numero2 && numero2 >= numero3) {			
			
			System.out.println("A ordem crescente dos números digitados é:\n" + numero3 + " " + numero2 + " " + numero1);
	}
		
		else if(numero2 >= numero1 && numero1 >= numero3) {
			
			System.out.println("A ordem crescente dos números digitados é:\n" + numero3 + " " + numero1 + " " + numero2);
		}
		
		else if(numero1 >= numero2 && numero3 >= numero2) {
			
			System.out.println("A ordem crescente dos números digitados é:\n" + numero2 + " " + numero3 + " " + numero1);
		}
		
		else if(numero3 >= numero1 && numero1 >= numero2) {
			
			System.out.println("A ordem crescente dos números digitados é:\n" + numero2 + " " + numero1 + " " + numero3);
		}
		
		else if(numero3 >= numero2 && numero2 >= numero1) {
			
			System.out.println("A ordem crescente dos números digitados é:\n" + numero1 + " " + numero2 + " " + numero3);
		}
		
		else if(numero2 >= numero3 && numero3 >= numero1) {
			
			System.out.println("A ordem crescente dos números digitados é:\n" + numero1 + " " + numero3 + " " + numero2);
		}
		leia.close();
	}

}
