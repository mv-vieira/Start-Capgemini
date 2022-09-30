package Exercicio;

import java.util.Scanner;

public class Quinze {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite o numero para a procura");
		numero = scan.nextInt();
		
		if(numero >=100 && numero <=200) {
			System.out.println("O numero - "+numero+" está entre 100 e 200");
		}else {
			System.out.println("Numero digitado não se encontra no intervalo do algoritimo");
		}
		

	}

}
