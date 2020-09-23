package Solve_me_first;

import java.util.Scanner;

public class SolveMeFast {

	static int solveMeFirst(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a, b, sum;
		a = in.nextInt();
		b = in.nextInt();
		sum = solveMeFirst(a, b);
		System.out.println(sum);

	}
}
