package Fundamentos;

import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		//Does not break the line
				System.out.print("Olá mundo!");
				//Break the line
				System.out.println("Bom dia");
					
				int y = 32;
				double x = 10.35784;
				System.out.println(y);
				System.out.println(x);
						
				//Printf to format
				//%.2f, 2- the decimal places quantities that will be printed
				//%n - to break line
				System.out.printf("%.2f%n", x);
				System.out.printf("%.4f%n", x);
						
				//To change the default language, now the number will be print with dot
				Locale.setDefault(Locale.US);
				System.out.printf("%.2f%n", x);
						
				//Concatenate strings
				System.out.println("Resultado = " + x + " metros");
				//Concatenate with format
				System.out.printf("Resultado = %.2f metros%n", x);
						
				String nome = "Maria";
				int idade = 31;
				double renda = 4000.5;
				//%f = float | %d = int | %s = string
				System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
