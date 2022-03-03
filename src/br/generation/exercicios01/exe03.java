package br.generation.exercicios01;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int duracaoEvento, horas, minutos, segundos, resto;
		
		System.out.println("Digite a duração do eventeo em segundos ");
		duracaoEvento = leia. nextInt();
		
		horas = duracaoEvento / 3600;
		resto = duracaoEvento % 3600;
		minutos = resto / 60;
		segundos = resto % 60;
		
		
		
		System.out.println("A duração do wvwnto é: " + horas + " horas " 
		+ minutos + " minutos " + segundos + " segundos.");
				
		leia.close();

	}

}
