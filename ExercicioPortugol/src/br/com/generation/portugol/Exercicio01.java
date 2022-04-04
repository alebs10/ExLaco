package br.com.generation.portugol;

import java.util.Scanner;

public class Exercicio01 {
		
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int meses, dias, diasMeses = 30, anos, diasAnos = 365;
		
		System.out.println("Digite sua idade!");
		System.out.println("Digite os anos: ");
		anos = leia.nextInt();
		
		System.out.println("Digie os meses: ");
		meses = leia.nextInt();
		
		System.out.println("Digite os dias: ");
		dias = leia.nextInt();
		
		
		dias = (anos*diasAnos)+(meses*diasMeses)+dias;
		
		System.out.println("Sua idade em dias é: "+dias);
		
		leia.close();
	}
}
