package application;

import java.util.Arrays;

public class ConsecutiveNumbers {
	// exercise link: https://edabit.com/challenge/Md6usCHQ7Xsj2fQi3
	public static void main(String[] args) {

		int vet1[] = { 5, 1, 4, 3, 2};
		int vet2[] = {5, 1, 4, 3, 2, 8};
		int vet3[] = {5, 6, 7, 8, 9, 9};

		cons(vet1);
		cons(vet2);
		cons(vet3);
	}

	public static void cons(int vet[]) {

		Arrays.sort(vet);
		boolean consec = true;

		for (int i = 0; i < vet.length; i++) {
			if (i + 1 != vet.length) {
				if (vet[i] + 1 != vet[i + 1]) {
					consec = false;
					break;
				}
			}
		}
		System.out.println(consec);
	}
}
