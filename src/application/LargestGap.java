package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestGap {
	// exercise link: https://edabit.com/challenge/qSJ5hZfG52Nf2hXWS
	public static void main(String[] args) {

		int vet1[] = { 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 };
		int vet2[] = { 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 };
		int vet3[] = { 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 };

		largestGap(vet1);
		largestGap(vet2);
		largestGap(vet3);
	}

	private static void largestGap(int[] vet) {
		
		int maior = 0;
		Arrays.sort(vet);
		List<Integer> gaps = new ArrayList<>();	
		for (int i = 0; i < vet.length; i++) {
			if (i + 1 != vet.length) {
				gaps.add(vet[i+1] - vet[i]);
				
				if(gaps.get(i) > maior){
					maior = gaps.get(i);  
                }  
			}
		}
		System.out.println("Largest gap: " + maior);
	}

}
