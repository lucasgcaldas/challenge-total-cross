package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boom {

	public static void main(String[] args) {
		
		int vet1[] = {1, 2, 3, 4, 5, 6, 7};
		int vet2[] = {8, 6, 33, 100};
		int vet3[] = {2, 55, 60, 97, 86};
	
		sevenBoom(vet1);
	}
	
	public static void sevenBoom(int vet[]) {
		
		List test = new ArrayList<>(Arrays.asList(vet));

		int v[] = {7};
		boolean flag = false;
		
		for(int i=0; i< vet.length; i++) {
			if(vet[i] == v[0] || vet[i]%10 == v[0]) {
				System.out.println("Boom!");
				flag = true;
				break;
			}
		}
		if(!flag) {
		System.out.println("there is no 7 in the array");
		}
	}

}
