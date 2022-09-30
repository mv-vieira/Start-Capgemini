package ComandoLeituraGravacao;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		
		// float cotacaoDolar = scan.nextFloat();
		
		
		// double cotacaoEuro = scan.nextDouble();
		
		System.out.println("Digite o seu nome: ");
		String nome = scan.next(); // Frases completas
		
		
		// String codigoRua = scan.next();
		
		
		System.out.println("Sua idade: "+idade+ "Seu nome: "+nome);
		
		
	}
}
