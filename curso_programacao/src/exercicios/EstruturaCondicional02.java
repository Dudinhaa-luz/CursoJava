package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int item;
		int quantidade;
		double total;
		
		System.out.println("O que você deseja? Insira código e quantidade");
		System.out.printf("1  Cachorro Quente RS4.00 %n"
				        + "2  X-Salada        R$4.50 %n"
				        + "3  X-Bacon         R$5.00 %n"
				        + "4  Torrada Simples R$2.00 %n"
				        + "5  Refrigerante    R$1.50 %n");
		
		item = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(item == 1){
			total = 4*quantidade;
		}else if(item == 2){
			total = 4.5*quantidade;
		}else if(item == 3){
			total = 5*quantidade;
		}else if(item == 4){
			total = 2*quantidade;
		}else{
			total = 1.5*quantidade;
		}
		
		System.out.println("TOTAL: R$" + total);
		
		sc.close();
	}
}
