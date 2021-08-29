package Exercicios;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int qtdAlcool = 0;
		int qtdGasolina = 0;
		int qtdDiesel = 0;
		
		int tipoCombustivel = sc.nextInt();
		
		while (tipoCombustivel != 4) {
			
			switch(tipoCombustivel) {
			case 1:
				qtdAlcool += 1;
				break;
			case 2:
				qtdGasolina += 1;
				break;
			case 3:
				qtdDiesel += 1;
				break;
			default:
				System.out.println("Número inválido");
			}
			
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + qtdAlcool);
		System.out.println("Gasolina: " + qtdGasolina);
		System.out.println("Diesel: " + qtdDiesel);
		
		sc.close();
	}
}
