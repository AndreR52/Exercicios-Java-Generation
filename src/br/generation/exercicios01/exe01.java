package br.generation.exercicios01;

import java.util.Scanner;	

public class exe01 {	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, meses, dias, idadeEmDias;
		
		System.out.println("Digite quantos anos voc� tem: ");
		anos = leia. nextInt();
		
		System.out.println("Digite quantos meses voc� tem al�m dos anos: ");
		meses = leia. nextInt();
		
		System.out.println("Digite quantos dias voc� tem al�m dos meses");
		dias = leia. nextInt();
		
		idadeEmDias = dias + (meses * 30) + (anos * 360);
		
		System.out.println("Sua idade em dias �: " + idadeEmDias);
		
		leia.close();

	}

}
