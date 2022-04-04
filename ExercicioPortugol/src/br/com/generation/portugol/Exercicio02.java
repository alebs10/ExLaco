package br.com.generation.portugol;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int  idade, mes, dias;
		
		System.out.println("Digite sua idade em dias: ");
		dias = leia.nextInt();
		
		idade = dias/365;
		mes = dias/30;
		
		System.out.println("Sua idade em anos: "+idade);
		System.out.println("Sua idade em meses: "+mes);
		System.out.println("Sua idade em dias: "+ dias);
		
		leia.close();
		

	}

}
