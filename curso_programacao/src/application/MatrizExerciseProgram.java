package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizExerciseProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[l][c];
		
		for (int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for (int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				if (mat[i][j] == n) {
					System.out.println("Position " + i + "," + j);
										
					int x = j-1;
					if(x > 0) {
						int Left  = mat[i][x];
						System.out.println("Left: " + Left);
					}
					
					x = j+1;
					if(x > 0) {
						int Right = mat[i][x];
						System.out.println("Right: " + Right);
					}
					
					x = i-1;
					if(x > 0) {
						int Up    = mat[x][j];
						System.out.println("Up: " + Up);
					}
					
					x = i+1;
					if(x > 0) {
						int Down  = mat[x][j];
						System.out.println("Left: " + Down);
					}
				}
			}
		}
		
		sc.close();
	}

}
