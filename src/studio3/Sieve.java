package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String args[]) {

		Scanner in = new Scanner (System.in); 
		System.out.println("How many numbers do you want to go through?");
		int n = in.nextInt();

		int [] numbers; 
		numbers = new int [n-1];
		int b = 2;
		for (int i = 0; i < n-1; i++) {
			numbers[i]=b;
			b++;
		}
		for (int i = 0; i < n-1; i++) {
			if (numbers[i] != -1) {
				for (int j = 2*numbers[i]; j <= n; j+=numbers[i]) {
					numbers [j-2] = -1;
				}


			}

		}


		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != -1) {
				System.out.println(numbers[i]);
			}
		}


	}
}
