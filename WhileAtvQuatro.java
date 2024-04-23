package atividade;

import java.util.Scanner;

public class WhileAtvQuatro {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int genero, dev, totalPesquisa = 0;
		int devBackEnd = 0, mulherCTdevFe = 0, homemCTdevM40 = 0, nbDevFull30 = 0;
		float total = 0, idade = 0;
		String comparador = "S";
		
		while(!comparador.equals("N")) {
			System.out.println("""
					
					|1 - Mulher Cis   |
					|2 - Homem Cis    |
					|3 - Não Binário  |
					|4 - Mulher Trans |
					|5 - Homem Trans  |
					|6 - Outros       |
					""");
			System.out.println("""
					|1 - Backend  |
					|2 - Frontend |
					|3 - Mobile   |
					|4 - FullStack|
					""");
			
			System.out.print("Idade: ");
			idade = leia.nextInt();
			
			System.out.print("Identidade de Gênero: ");
			genero = leia.nextInt();

			System.out.print("Pessoa Desenvolvedora: ");
			dev = leia.nextInt();
			
			if (dev == 1) {
				devBackEnd++;
			}else if((genero == 1 || genero == 4) && dev == 2){
				mulherCTdevFe++;
			}else if((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
				homemCTdevM40++;
			}else if((genero == 3 && dev == 4) && idade < 30) {
				nbDevFull30++;
			}
			total += idade;
			totalPesquisa++;
			
			System.out.print("Deseja continuar (S/N): ");
			comparador = leia.next();
		}
		float mediaIdade = total / totalPesquisa;
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + devBackEnd);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+ mulherCTdevFe);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+ homemCTdevM40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+ nbDevFull30);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+ totalPesquisa);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", mediaIdade);
		leia.close();
	}
}
