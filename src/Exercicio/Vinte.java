package Exercicio;

import java.util.Scanner;

public class Vinte {

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int anoFabricacao = 0;
		float valorCarro = 0.0f;
		float porcentagemDesconto = 0.0f;
		float valorDesconto = 0.0f;
		float valorPagar = 0.0f;
		
		int totalCarros = 0;
		int totalSemiNovos = 0;
		
		char desejaRepetir = 's';
		
		
		while(desejaRepetir == 's' || desejaRepetir == 'S') {
			
			System.out.println("Digite o ano de fabricacao do veiculo: ");
			anoFabricacao = scan.nextInt();
			
			System.out.println("Digite o valor do veiculo: ");
			valorCarro = scan.nextFloat();
			
			if(anoFabricacao <= 2000) {
				porcentagemDesconto = 0.12f;
				totalSemiNovos++;
			} else {
				porcentagemDesconto = 0.07f;
				
				
			}
			
			totalCarros++;
			
			valorDesconto = valorCarro * porcentagemDesconto;
			valorPagar = valorCarro - valorDesconto;
			
			System.out.println("Valor do desconto foi de: "+valorDesconto);
			System.out.println();
			System.out.println("Valor a pagar do veiculo com desconto: "+valorPagar);
			
			
			
			System.out.println("Deseja fazer mais cadastros? S - Sim / N - Nao");
			
			desejaRepetir = scan.next().charAt(0);
			
		}
		
			System.out.println("Total de veiculos foram: "+totalCarros);
			System.out.println();
			System.out.println("Total de Semi-Novos foram: "+totalSemiNovos);
		
		
	}
}
