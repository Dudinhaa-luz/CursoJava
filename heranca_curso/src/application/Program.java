package application;

import entities.Account;
import entities.BusinessAcount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		//Account acc = new Account(1001, "Alex", 0.0);
		//BusinessAcount bacc = new BusinessAcount(1002, "Maria", 0.0, 500.0);
		
		//Upcasting
		//Account acc1 = bacc;
		Account acc2 = new BusinessAcount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

		//Downcasting
		BusinessAcount acc4 = (BusinessAcount)acc2;
		acc4.loan(100.0);
		
		//Situação não permitida, dá erro no momento da execução
		//BusinessAcount acc5 = (BusinessAcount)acc3; 
		
		if (acc3 instanceof BusinessAcount) {
			BusinessAcount acc5 = (BusinessAcount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1001, "Alex", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAcount(1003, "Bob", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		//Polimorfismo - variáveis do mesmo tipo com comportamentos diferentes (de acordo com os objetos que elas apontam)
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
