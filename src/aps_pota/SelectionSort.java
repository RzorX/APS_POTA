package aps_pota;

public class SelectionSort {   
    
    public static void SelectionSort(int v[]) {
        for (int i = 0; i < v.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[minimo]) {
                    minimo = j;
                }
            }
            int aux = v[i];
            v[i] = v[minimo];
            v[minimo] = aux;
        }

    }

}
