package br.com.generation.rep;

import java.util.Scanner;

public class Ex03 {
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/
	public static void main(String[] args) {
		 
		Scanner leia = new Scanner(System.in);
		
		int velhos=0, novos =0, i=0;
		
		while(i != -3) {
			System.out.println("Digite sua idade: ");
			i = leia.nextInt();
			
			if(i>=0 && i<21) {
				novos++;
			}
			else if(i>50) {
				velhos++;
			}
			else {
				System.out.println("Idade inválida!");
			}
		}
			System.out.println("Total de pessoas com menos de 21 anos: "+novos);
			System.out.println("Total de pessoas com mais de 50 anos: "+velhos);
			leia.close();
	}
		
}
