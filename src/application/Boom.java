package application;

public class Boom {

	public static void main(String[] args) {
		
		int vet1[] = {1, 2, 3, 4, 5, 6, 7};
		int vet2[] = {8, 6, 33, 100};
		int vet3[] = {2, 55, 60, 170, 86};
	
		sevenBoom(vet1);
		sevenBoom(vet2);
		sevenBoom(vet3);
	}
	
	public static void sevenBoom(int vet[]) {
		
		boolean containsSeven = false;
		
		for (int e : vet) {
            if(Integer.toString(e).contains("7")) {
                System.out.println("Boom!");
                containsSeven=true;
                break;
            }
		}
		if(!containsSeven) {
			System.out.println("there is no 7 in the array");
		}
	}
}
