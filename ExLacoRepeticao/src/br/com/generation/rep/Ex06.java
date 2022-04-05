package br.com.generation.rep;

import java.util.Scanner;
/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
public class Ex06 {
		
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i = 0, n, soma = 0, media = 0;
		
		do {
			System.out.println("Digite um valor: ");
			n = leia.nextInt();
			if(n%3 == 0 && n!= 0) {
				soma = soma+n;
				i++;
			}
			
		}while( n!= 0);{
			media = soma/i;
			System.out.println("O valor da media: "+media);
		}
	}
}
