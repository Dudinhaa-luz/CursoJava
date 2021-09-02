package fundamentos;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		//& - operador E em bitwise
		//| - operador OU em bitwise
		//^ - operador OU EXCLUSIVO em bitwise
		//Será realizada a comparação bit a bit
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000; //32
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");//113
		}else {
			System.out.println("6th bit is false!");//89
		}
		
		sc.close();
	}

}
