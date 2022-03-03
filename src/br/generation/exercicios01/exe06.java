package br.generation.exercicios01;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int xA, xB, yA, yB;
		double distancia;
		
		System.out.println("Digite as coordenadas de A na ordem x e depois y: ");
		xA = leia. nextInt();
		yA = leia. nextInt();
		
		System.out.println("Digite as coordenadas de B na ordem x e depois y: ");
		xB = leia. nextInt();
		yB = leia. nextInt();
		
		distancia = Math.sqrt(((xB - xA) * (xB - xA)) + ((yB - yA) * (yB - yA)));
		
		System.out.println("A distância entre os dois pontos é: " + distancia);
		
		leia.close();
		
	}

}
