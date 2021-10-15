package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class ContaBancariaProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		System.out.println("Is there an Initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		double initialValue;
		if (initialDeposit == 'y') {
			System.out.println("Enter initiial deposit values: ");
			initialValue = sc.nextDouble();
		}else {
			initialValue = 0;
		}
		
		ContaBancaria cb = new ContaBancaria(number, name, initialValue);
		
		System.out.println("Account data:");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", cb.getNumero(), cb.getTitular(), cb.getSaldo());
		
		System.out.println("Enter a deposit value: ");
		double valor = sc.nextDouble();
		cb.depositar(valor);
		System.out.println("Updated account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", cb.getNumero(), cb.getTitular(), cb.getSaldo());
		
		System.out.println("Enter a withdraw value: ");
		valor = sc.nextDouble();
		cb.sacar(valor);
		System.out.println("Updated account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", cb.getNumero(), cb.getTitular(), cb.getSaldo());
		
		sc.close();
	}

}
