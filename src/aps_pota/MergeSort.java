package aps_pota;

public class MergeSort extends AlgOrd{

    public MergeSort(String nome) {
        super(nome);
    }

    private void MergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            MergeSort(A, p, q);
            MergeSort(A, q + 1, r);
            Intercala(A, p, q, r);
        }
    }

    private void Intercala(int[] A, int p, int q, int r) {
        int cont = 0;
        int B[] = new int[A.length];
        for (int k = p; k <= r; k++) {
            B[k] = A[k];
            cont++;
        }
            int i = p;
            int j = q+1;
            for (int k = p; k <= r; k++) {
                if (i > q) {
                    A[k] = B[j++];
                    cont++;
                } else if (j > r){
                    A[k] = B[i++];
                    cont++;
                } else if (B[i] < B[j]){
                    A[k] = B[i++];
                    cont++;
                } else {
                    A[k] = B[j++];
                    cont++;
                }
                cont++;
            }
            System.out.println("Comparações MergeSort: " +cont);
        }

    @Override
    public void Orderna(int[] vet) {
        this.MergeSort(vet, 0, 0);
        this.tamanho = vet.length;
    }
    
    }
