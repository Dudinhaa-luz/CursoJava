package Exercicios;

import java.util.Scanner;

public class EstruturaCondicional01 {
    //file:///C:/Users/eduarda.luz/Downloads/02-exercicios2-estrutura-condicional.pdf
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int resto;
		
		System.out.println("Insisra um número:");
		numero = sc.nextInt();
		
		resto = numero%2;
		if (resto == 0){
			System.out.println("O número " + numero + " é par");
		}
		else{
			System.out.println("O número " + numero + " é impar");
		}
		
		sc.close();

	}

}
