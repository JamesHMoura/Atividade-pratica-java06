package atividade;

import java.util.Scanner;

public class AtividadeWhil {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idmenor = 0, idmaior = 0, idade = 1;
		
		
		
		while(idade >= 0) {
			System.out.print("digite sua idade: ");
			idade = leia.nextInt();			
			if(idade > 50) {
				idmaior++;
			}else if(idade < 21 && idade > 0) {
				idmenor++;
			}
		}
		System.out.println("Total de pessoas menores de 21 anos: "+idmenor);
		System.out.println("Total de pessoas maiores de 50 anos: "+idmaior);
		leia.close();
	}
	
}
