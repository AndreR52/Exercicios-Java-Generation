package br.generation.exercicios01;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idadeEmDias, anos, meses, dias, resto;
		
		System.out.println("Digite sua idade em dias: ");
		idadeEmDias = leia. nextInt();
		
		anos = idadeEmDias / 360;
		resto = idadeEmDias % 360;
		meses = resto / 30;
		dias = resto % 30;
		
		
		
		System.out.println("Sua idade é: " + anos + " anos " + meses
				+ " meses " + dias + " dias.");
				
		leia.close();

	}

}
