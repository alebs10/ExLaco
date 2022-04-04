package br.com.generation.laco;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] agrs) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite o 1° valor: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o 2° valor: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o 3° valor: ");
		n3 = leia.nextDouble();
		
		if(n1<n2 && n2<n3) {
			System.out.println("Os valores são: "+n1+n2+n3);
		}
		else if(n1<n3 && n3<n2) {
			System.out.println("Os valores são: "+n1+n3+n2);
		}
		else if (n2<n1 && n1<n3) {
			System.out.println("O valores são: "+n2+n1+n3);
		}
		else if (n2<n3 && n3<n1) {
			System.out.println("Os valores são: "+n2+n3+n1);
		}
		else if (n3<n2 && n2<n1) {
			System.out.println("Os valores são: "+n3+n2+n1);
		}
		else if (n3<n1 && n1<n2) {
			System.out.println("Os valores são: "+n3+n2+n1);
		}
		leia.close();
	}
}
