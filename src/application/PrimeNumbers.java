package application;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	public static void main(String[] args) {

		primeNumbers(10);
		primeNumbers(20);
		primeNumbers(30);
	}

	public static void primeNumbers(int number) {

		boolean isPrime = true;
		List<Integer> list = new ArrayList<>();
		
		for (int i = 2; i <= number; i++) {
			isPrime = true;
			for (int j = 1; j < i; j++) {
				if (i % j == 0 && (j != i && j != 1)) {
					isPrime = false;
				}
			}
			if (isPrime) {
				list.add(i);
			}
		}
		System.out.println("Are there " + list.size() + " prime numbers!");
		for(int x = 0; x < list.size(); x++) {
			if(x == list.size() - 2) {
				System.out.print(list.get(x) + " and ");
			} 
			else if(x == list.size() - 1) {
				System.out.println(list.get(x));
				System.out.println();
			}else {
				System.out.print(list.get(x) + ", ");
			}
		}
	}
}
