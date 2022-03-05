/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto */

package br.generation.exercicios02;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int idade;
		String nome; 
		
		System.out.println("Digite o nome da pessoa: ");
		nome = leia. next();
		
		System.out.println("Digite a idade da pessoa: ");
		idade = leia. nextInt();
		
		if(idade >= 10 && idade <= 14) {
			
			System.out.println(nome + " está na categoria infantil.");
		}
		
		else if(idade >= 15 && idade <= 17) {
			
			System.out.println(nome + " está na categoria juvenil.");
		}
		
		else if(idade >= 18 && idade <= 25) {
			
			System.out.println(nome + " está na categoria adulta.");
		}
		
		else {
			
			System.out.println(nome + " não se encaixa em nenhuma categoria.");
		}
		
		
		leia.close();

	}

}
