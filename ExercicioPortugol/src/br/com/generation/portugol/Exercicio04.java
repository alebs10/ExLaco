package br.com.generation.portugol;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		R = (A+B)*(A+B);
		S = (B+C)*(C+B);
		
		D = (R+S)/2;
		
		System.out.println("O valor de R: "+R);
		System.out.println("O valor de S:"+S);
		System.out.println("O valor de D: "+D);
		
		leia.close();

	}

}
