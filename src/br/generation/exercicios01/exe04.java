package br.generation.exercicios01;

import java.util.Scanner;

public class exe04 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int a, b, c, r, s;
		double d;
		
		System.out.println("Digite os valores inteiros e positivos de A, B e C nessa ordem" );
		a = leia. nextInt();
		b = leia. nextInt();
		c = leia. nextInt();
		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (double) (r + s) / 2;
		
		System.out.println("O valor de D é: " + d);
		
		leia.close();
	

	}

}
