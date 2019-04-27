package aps_pota;

public class Test {
	public static void main(String[] args) {
		RadixSort s = new RadixSort("hue");
		CountSort cs= new CountSort("count");
		
		int[] vet = {21,333,9,2312,3};
		cs.countSort(vet);
		for (int j = 0; j < vet.length; j++) {
			System.out.print(vet[j]+" ");;
		}
		
	}
}
