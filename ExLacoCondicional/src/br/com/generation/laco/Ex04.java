package br.com.generation.laco;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] agrs) {
		
		Scanner leia = new Scanner(System.in);
		
		double n, raiz, pot;
		
		System.out.println("Digite o valor");
		n = leia.nextDouble();
	
		
		if(n % 2 == 0) {
			System.out.println("Seu valor e par.");
			raiz = Math.sqrt(n);
			System.out.println("O valor da sua raiz e: "+raiz);
		}
		else {
			System.out.println("Seu valor e impar");
			pot = Math.pow(n, 2);
			System.out.println("O valor do numero elevado ao quadrado e: "+pot);
		}
		
		leia.close();
	}
}
