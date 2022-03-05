/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/

package br.generation.exercicios04;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double matriz[][] = new double[3][3];
		double soma = 0, somaDiagonal = 0;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Digite o valor correspondente à " + (l + 1)
						+ "ª linha e " + (c + 1) + "ª coluna da matriz:");
				matriz[l][c] = input.nextDouble();
				
				soma += matriz[l][c];
				
				if(l == c) {
					somaDiagonal += matriz[l][c];
				}
			}
		}
		System.out.println();
		System.out.println("Matriz:");
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.print(matriz[l][c] + " | ");
			}
			System.out.println();
		}
		System.out.println("A soma de todos os valores da matriz é:\n" + soma);
		System.out.println("\nA soma da diagonal principal é:\n" + somaDiagonal);
		
		input.close();
	}
		
}
