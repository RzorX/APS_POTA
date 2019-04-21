package aps_pota;

public class MergeSort extends AlgOrd {

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

        int B[] = new int[A.length];
        this.comparacoes++;
        for (int k = p; k <= r; k++) {
            B[k] = A[k];
            this.comparacoes++;
        }
        int i = p;
        int j = q + 1;
        this.comparacoes++;
        for (int k = p; k <= r; k++) {

            if (i > q) {
                A[k] = B[j++];
                this.comparacoes++;
            } else if (j > r) {
                A[k] = B[i++];
                this.comparacoes++;
            } else if (B[i] < B[j]) {
                A[k] = B[i++];
                this.comparacoes++;
            } else {
                A[k] = B[j++];
                this.comparacoes++;
            }
            
           this.comparacoes++;
        }
        //System.out.println("Número de comparações Merge: " +cont);
    }

    @Override
    public void Orderna() {
        this.MergeSort(vetor, 0, vetor.length - 1);
        this.tamanho = vetor.length;
    }

}
