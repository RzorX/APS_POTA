package aps_pota;

public class SelectionSort extends AlgOrd {

    public SelectionSort(String nome) {
        super(nome);
    }

    public void SelectionSort(int v[]) {
        int cont = 0;
        cont++;
        for (int i = 0; i < v.length - 1; i++) {
            int minimo = i;
            cont++;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[minimo]) {
                    minimo = j;
                    cont++;
                }
            }
            int aux = v[i];
            v[i] = v[minimo];
            v[minimo] = aux;
        }

        this.comparacoes = cont;
        //System.out.println("Número de comparações Selection: " +cont);
    }

    @Override
    public void Orderna(int[] vet) {
        this.SelectionSort(vet);
        this.tamanho = vet.length;
    }

}
