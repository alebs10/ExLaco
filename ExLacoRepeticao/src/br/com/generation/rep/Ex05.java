package br.com.generation.rep;

import java.util.Scanner;
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
public class Ex05 {
		
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i, soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			i = leia.nextInt();
			soma+=i;
		}
		while( i != 0);{
		}
		System.out.println("O valor �: "+soma);
		leia.close();
	}
}
