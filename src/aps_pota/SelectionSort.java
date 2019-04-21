package aps_pota;

public class SelectionSort extends AlgOrd {

    public SelectionSort(String nome) {
        super(nome);
    }

    public void SelectionSort(int v[]) {
            
        this.comparacoes++;
        for (int i = 0; i < v.length - 1; i++) {
            int minimo = i;
            this.comparacoes++;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[minimo]) {
                    minimo = j;
                    this.comparacoes++;
                }
                this.comparacoes++;
            }
            int aux = v[i];
            v[i] = v[minimo];
            v[minimo] = aux;
            
            this.comparacoes++;
        }
        //System.out.println("Número de comparações Selection: " +cont);
    }

    @Override
    public void Orderna() {
        this.SelectionSort(vetor);
        this.tamanho = vetor.length;
    }

}
