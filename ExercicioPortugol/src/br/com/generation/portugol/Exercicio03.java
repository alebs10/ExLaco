package br.com.generation.portugol;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int seg, min, horas;

		System.out.println("Escreva o tempo em segundos: ");
		seg = leia.nextInt();
		
		min = seg/60;
		horas = min/60;
		
		System.out.println("Em segundos e: "+seg+" segundos");
		System.out.println("Em minutos e: "+min+" minutos");
		System.out.println("Em horas e: "+horas+" horas");
		
		leia.close();
	}

}
