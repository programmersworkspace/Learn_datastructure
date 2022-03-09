package pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int k = 1; k <=n - i; k++)
					System.out.print(" ");
			} else {
				for (int k = 1; k < i - n; k++)
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
