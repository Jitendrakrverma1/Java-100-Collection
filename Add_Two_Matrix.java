
             // Add Two Matrix
package Jitendra;
import java.util.Scanner;
public class Add_Two_Matrix {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first Matrix element:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.print("Enter the second Matrix element:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.print("\nFirst Matrix:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\nSecond Matrix:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("\nSum of Matrix:");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				c[i][j] = a[i][j] + b[i][j];
			System.out.print(c[i][j]+" ");
			}
			System.out.print("\n");
		}
		s.close();
	}
}
