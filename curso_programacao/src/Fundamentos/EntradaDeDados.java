package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
        Locale.setDefault(Locale.US);
	    //Object to read data entered on the screen 
		Scanner sc = new Scanner(System.in);
		
//		String s;
//		//**To read one word**
//		s = sc.next();
//		System.out.println("Você digitou: " + s);
		
//      int i;
//      //**To read integer**
//      i = sc.nextInt();
//      System.out.println("Voce digitou: " + i);

//      double d;
//      //**To read double**
//      d = sc.nextDouble();
//      System.out.printf("Voce digitou: %.2f%n", d);
		
//		char c;
//		//**To read char**
//      c = sc.next().charAt(0);
//      System.out.println("Voce digitou: " + c);
        
//      String x;
//      int y;
//      double z;
//      //**To read many data separated by space** 
//      x = sc.next();
//      y = sc.nextInt();
//      z = sc.nextDouble();
        
//      System.out.println("Dados digitados: ");
//      System.out.println(x);
//      System.out.println(y);
//      System.out.println(z);
		
//		String s1, s2, s3;
//		//**To read data separated by line**
//		s1 = sc.nextLine();
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("Dados Digitados: ");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		//When it's used a different command with next line it's necessary to do a break line pending
		//Just add a sc.nextLine() command before others nextLine commands
		int i;
		String s4, s5, s6;
		i = sc.nextInt();
		sc.nextLine();
		s4 = sc.nextLine();
		s5 = sc.nextLine();
		s6 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(i);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
        
		sc.close();		
	}

}
