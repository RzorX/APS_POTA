package aps_pota;

public class Test {
	public static void main(String[] args) {
		RadixSort rs = new RadixSort("hue");
		
		int[] vet = {21,333,9,2312,3,0,21931};
		rs.radixSort(vet);
		
		
		for (int j = 0; j < vet.length; j++) {
			System.out.print(vet[j]+" ");;
		}
		
	}
}
