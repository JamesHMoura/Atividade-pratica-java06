package atividade;

import java.util.Scanner;

public class AtividadeDoWhile {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, total = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero > 0) {
				total += numero;
			}
			}while(numero != 0);
		System.out.print("\nA soma dos números positivos é: "+ total);
		leia.close();
	}
	
}
