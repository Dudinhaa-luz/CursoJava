package Exercicios;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int resto = 0;
		
		for(int i = 1; i <= x; i++) {
			
			resto = i%2;
			
			if (resto == 1) {
				System.out.println(i);
			}

		}
        
		sc.close();
	}

}
