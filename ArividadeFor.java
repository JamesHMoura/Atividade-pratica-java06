package atividade;

import java.util.Scanner;

public class ArividadeFor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("Digite o primeiro número do intervalo: ");
		num1= leia.nextInt();
		System.out.print("\nDigite o segundo número do intervalo: ");
		num2= leia.nextInt();
		
		if (num1 > num2) {
			System.out.println("Intervalo invalido:");
		}else {
		
			for (int i=num1; i <= num2; i++) {
				
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.print("o número "+i+" é multiplo de 3 e 5\n");
				}
		}
		
		leia.close();
		}
	}

}
