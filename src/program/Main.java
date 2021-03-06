package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int n = sc.nextInt();
		
		int mat[][] = new int[m][n];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero: ");
		int x = sc.nextInt();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
						}
					else if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
						}
					else if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
						}
					else if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
						}
					}
				}
		sc.close();
		}
	}
}
