package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Exec_arrays1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Informe quantos n�meros ir� digitar: ");
		int n = leia.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i < vect.length; i++) {
			System.out.println("Informe um n�mero inteiro: ");
			vect[i] = leia.nextInt();
		}
		
		System.out.println("N�meros negativos:");
		for (int i=0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		leia.close();
	}

}
