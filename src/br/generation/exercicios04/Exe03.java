/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.*/

package br.generation.exercicios04;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double N1[][] = new double[4][6];
		double N2[][] = new double[4][6];
		double M1[][] = new double[4][6];
		double M2[][] = new double[4][6];
		
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
				System.out.println("Digite o valor correspondente à " + (l + 1) + "ª linha e "
						+ (c + 1) + "ª coluna da matriz N1:");
				N1[l][c] = input.nextDouble();
				
				System.out.println("Digite o valor correspondente à " + (l + 1) + "ª linha e "
						+ (c + 1) + "ª coluna da matriz N2:");
				N2[l][c] = input.nextDouble();
				
				M1[l][c] = N1[l][c] + N2[l][c];
				M2[l][c] = N1[l][c] - N2[l][c];				
			}
		}
		System.out.println();
		System.out.println("N1");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
			System.out.print(N1[l][c] + " | ");	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("N2");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
			System.out.print(N2[l][c] + " | ");	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Soma dos valores de N1 e N2");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
			System.out.print(M1[l][c] + " | ");	
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Diferença dos valores de N1 e N2");
		for(int l = 0; l < 4; l++) {
			for(int c = 0; c < 6; c++) {
			System.out.print(M2[l][c] + " | ");	
			}
			System.out.println();
		}
		input.close();
	}
}
