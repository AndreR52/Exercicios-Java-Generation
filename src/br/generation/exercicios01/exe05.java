package br.generation.exercicios01;

import java.util.Scanner;

public class exe05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
			
		System.out.println("Digite a nota do aluno que têm peso 2: ");
		nota1 = leia. nextDouble();
		
		while(nota1 > 10 || nota1 < 0) {
			System.out.println("A nota do aluno deve ter valor entre 0 e 10, digite novamente a nota com peso 2: ");
			nota1 = leia. nextDouble();
		}
		
		System.out.println("Digite a nota do aluno que têm peso 3: ");
		nota2 = leia. nextDouble();
		
		while(nota2 > 10 || nota2 < 0) {
			System.out.println("A nota do aluno deve ter valor entre 0 e 10, digite novamente a nota com peso 3: ");
			nota2 = leia. nextDouble();
		}
		
		System.out.println("Digite a nota do aluno que têm peso 5: ");
		nota3 = leia. nextDouble();
		
		while(nota3 > 10 || nota3 <0) {
			System.out.println("A nota do aluno deve ter valor entre 0 e 10, digite novamente a nota com peso 5: ");
			nota3 = leia. nextDouble();
			
		}
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média ponderada do aluno é: " + media);
		
		leia.close();

	}

}
