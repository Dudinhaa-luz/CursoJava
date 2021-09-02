package exercicios;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida");
			
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
        
		sc.close();
	}

}
