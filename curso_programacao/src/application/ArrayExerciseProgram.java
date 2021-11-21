package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ArrayExerciseProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("How many rooms will be rented?");
		n = sc.nextInt();
		Student[] vect = new Student[10];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Email:");
			String email = sc.nextLine();
			System.out.println("Room:");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Student(name, email, roomNumber);
		}
		
		System.out.println("Busy Rooms:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i].getRoomNumber() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();
	}

}
