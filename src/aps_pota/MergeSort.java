package aps_pota;

public class MergeSort {
    
    public static void MergeSort(int v[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            MergeSort(v, inicio, meio);
            MergeSort(v, meio + 1, fim);
            Intercala(v, inicio, meio, fim);
        }
    }

    public static void Intercala(int v[], int inicio, int meio, int fim) {
        int b[] = new int[v.length];
        for (int i = inicio; i < meio; i++) {
            b[i] = v[i];
            for (int j = meio + 1; j < fim; j++) {
                b[fim + meio + 1 - j] = v[j];
                inicio = i;
                fim = j;
                for (int k = inicio; k < fim; k++) {
                    if (b[i] <= b[j]) {
                        v[k] = b[i];
                        inicio = inicio + 1;
                    } else {
                        v[k] = b[j];
                        fim = fim - 1;
                    }
                }
            }
        }
    }

    
}
