package br.com.generation.rep;

import java.util.Scanner;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
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
		System.out.println("O valor é: "+soma);
		leia.close();
	}
}
