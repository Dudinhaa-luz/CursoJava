package Fundamentos;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		
		// (condição) ? valor se verdadeiro : valor se falso
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);

	}

}
