package br.com.generation.laco;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1°valor: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2° valor");
		n2 = leia.nextInt();
		
		System.out.println("Digite o 3° valor: ");
		n3 = leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			System.out.println("O valor "+n1+" e o maior");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("O valor "+n2+" e o maior");
		}
		else if(n3>n1 && n3>n2) {
			System.out.println("O valor "+n3+" e o maior");
		}
		else {
			System.out.println("O valores sao iguais");
		}
		leia.close();
	}
}
