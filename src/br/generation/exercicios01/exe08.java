package br.generation.exercicios01;

import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabrica, custoConsumidor, valorFinal, imposto;
		
		System.out.println("Digite o custo de fábrica do carro em reais: ");
		custoFabrica = leia. nextDouble();
		
		custoConsumidor = custoFabrica + (custoFabrica * 0.28);
		
		imposto = custoConsumidor * 0.45;
		
		valorFinal = custoConsumidor + imposto;
		
		System.out.println("O custo do carro para o consumidor é: " + valorFinal);
		
		leia.close();

	}

}
