package aps_pota;

public class HeapSort extends AlgOrd {

    public HeapSort(String nome) {
        super(nome);
    }

    void ArrumarHeap(int[] A, int pai) {
        int esq = 2 * pai + 1;
        int dir = (2 * pai) + 2;
        int maior = pai;
        this.comparacoes++;
        if (esq <= tamanho && A[esq] > A[maior]) {
            maior = esq;
            this.comparacoes++;
        }
        this.comparacoes++;
        if (dir <= tamanho && A[dir] > A[maior]) {
            maior = dir;
            this.comparacoes++;
        }
        this.comparacoes++;
        if (maior != pai) {
            int aux = A[pai];
            A[pai] = A[maior];
            A[maior] = aux;
            ArrumarHeap(A, maior);
            this.comparacoes++;
        }
    }

    void CriarHeap(int[] A) {
        tamanho = A.length - 1;
        this.comparacoes++;
        for (int pai = tamanho / 2; pai >= 0; pai--) {
            ArrumarHeap(A, pai);
            this.comparacoes++;
        }
    }

    void heapSort(int[] A, int tamanho) {
        CriarHeap(A);
        this.comparacoes++;
        for (int i = tamanho; i > 0; i--) {
            int aux = A[i];
            A[i] = A[0];
            A[0] = aux;
            tamanho--;
            ArrumarHeap(A, 0);
            this.comparacoes++;
        }
    }

    @Override
    public void Orderna() {
        heapSort(vetor, vetor.length - 1);
        this.tamanho = vetor.length;
    }

}
