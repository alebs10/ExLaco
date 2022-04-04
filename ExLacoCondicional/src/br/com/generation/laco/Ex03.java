package br.com.generation.laco;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Ola! Voce faz parte da categoria infantil.");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Ola! Voce faz parte da categoria juvenil.");
		}
		else if(idade>=18 && idade<=25) {
			System.out.println("Ola! Voce faz parte da categoria adulto.");
		}
		else {
			System.out.println("Digite uma idade valida!");
		}
		entrada.close();
	}

}
