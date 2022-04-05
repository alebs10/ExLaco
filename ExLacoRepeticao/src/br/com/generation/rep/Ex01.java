package br.com.generation.rep;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=1000;i<=1999;i++) {
			
			if(i % 11== 5) {
				System.out.println("O valor é: "+i);
				Thread.sleep(500);
			}
		}
	
	}

}
