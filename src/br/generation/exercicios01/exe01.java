package br.generation.exercicios01;

import java.util.Scanner;	

public class exe01 {	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeEmDias;
		
		System.out.println("Digite quantos anos você tem: ");
		anos = leia. nextInt();
		
		System.out.println("Digite quantos meses você tem além dos anos: ");
		meses = leia. nextInt();
		
		System.out.println("Digite quantos dias você tem além dos meses");
		dias = leia. nextInt();
		
		idadeEmDias = dias + (meses * 30) + (anos * 360);
		
		System.out.println("Sua idade em dias é: " + idadeEmDias);
		
		leia.close();

	}

}
