package Exercicios;

import java.util.Scanner;

public class EstruturaCondicional01 {
   //Teste...
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int resto;
		
		System.out.println("Insisra um n�mero:");
		numero = sc.nextInt();
		
		resto = numero%2;
		if (resto == 0){
			System.out.println("O n�mero " + numero + " � par");
		}
		else{
			System.out.println("O n�mero " + numero + " � impar");
		}
		
		sc.close();

	}

}
