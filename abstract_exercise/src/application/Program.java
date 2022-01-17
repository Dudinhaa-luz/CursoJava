package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.PrivateIndividual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payer:");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		
		for (int i=1; i<=n; i++ ) {
			System.out.println("Tax Payer #" + i + " data:");
			
			System.out.print("Individual or Company (i/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Healph expenditures: ");
				double healphCoust = sc.nextDouble();
				
				list.add(new PrivateIndividual(name, anualIncome, healphCoust));
			}
			else {
				System.out.print("Number od employees: ");
				int employeeNumber = sc.nextInt();
				
				list.add(new LegalEntity(name, anualIncome, employeeNumber));
			}
		}
		
		System.out.println("Taxes Paid:");
		
		double sum = 0;
		for(TaxPayer taxPayer : list) {
			System.out.printf(taxPayer.getName() + ": $ %.2f%n", taxPayer.taxCalculate());
			
			sum += taxPayer.taxCalculate();
		}
		
		System.out.printf("Total taxes: $ %.2f%n", sum);
		
		sc.close();
	}

}
