package br.com.generation.portugol;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, soma;
		
		System.out.println("Digite a 1ªnota: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite a 2ªnota: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite a nota do trabalho: ");
		n3 = leia.nextDouble();
		
		soma = (n1+n2+n3)/3;
		
		System.out.println("Sua media final e: "+soma);
		
		if(soma>=7 && soma<=10) {
			System.out.println("Parabens voce foi aprovado");
		}
		else if(soma>=4 && soma<=6) {
			System.out.println("Voce esta de recuperacao");
		}
		else if(soma>=0 && soma<=3) {
			System.out.println("Sinto muito, voce foi reprovado");
		}
		else {
			System.out.println("Valor invalido, tente novamente");
		}
		
		leia.close();
	}

}
