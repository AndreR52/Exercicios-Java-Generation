/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

package br.generation.exercicios03;

public class Exe01 {

	public static void main(String[] args) {
		
		System.out.println("=====Números inteiros entre 1000 e 1999 que quando divididos por 11 tem o resto igual a 5=====");
		
		for(int numero = 1000; numero <= 1999; numero++) {
			
			if(numero % 11 == 5 ) {
				
				System.out.println(numero);
				
			}			
		}
	}
}
