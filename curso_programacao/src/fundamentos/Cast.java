package fundamentos;

public class Cast {

	public static void main(String[] args) {
		int a, b;
		double resultado, resultado1;
		
		a=5;
		b=2;
		
		resultado = a/b;
		resultado1 = (double) a/b; //Cast
		
		System.out.println(resultado);
		System.out.println(resultado1);
	}

}
