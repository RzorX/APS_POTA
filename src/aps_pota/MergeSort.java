package aps_pota;

public class MergeSort {

    public static void MergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            MergeSort(A, p, q);
            MergeSort(A, q + 1, r);
            Intercala(A, p, q, r);
        }
    }

    public static void Intercala(int[] A, int p, int q, int r) {
        int B[] = new int[A.length];
        for (int i = p; i < q; i++) {
            B[i] = A[i];
        }
        for (int j = q + 1; j < r; j++) {
            B[r + q + 1 - j] = A[j];
        }
        int i = p;
        int j = r;
        for (int k = p; k < r; k++) {
            if(B[i] <= B[j]){
                A[k] = B[i];
                i = i + 1;
            } else {
                A[k] = B[j];
                j = j - 1;
            }
        }
    }
}
