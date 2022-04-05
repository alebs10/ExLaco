package br.com.generation.rep;

import java.util.Scanner;

public class Ex02 {
	//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
	public static void main(String[] args) {
		
		int contPar = 0, contImpar = 0;
		Scanner leia = new Scanner(System.in); 
		
		for(int i=0;i<=10;i++) {
			System.out.println("Digite um valor: ");
			i = leia.nextInt();
			
			if(i % 2 == 0) {
				contPar++;
			}
			else {
				contImpar++;
			}
		}
			System.out.println("Pares: "+contPar);
			System.out.println("Impares"+contImpar);
			leia.close();
	}

}
