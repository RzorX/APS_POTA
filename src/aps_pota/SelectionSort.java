package aps_pota;

public class SelectionSort extends AlgOrd{
    
    public SelectionSort(String nome) {
        super(nome);
    }

    public static int SelectionSort(int v[]) {
        int cont = 0;
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
            System.out.println("Comparações SelectionSort: " + cont);
            return cont;
        }
    
     @Override
    public void Orderna(int[] vet) {
        SelectionSort.SelectionSort(vet);
        this.tamanho = vet.length;
    }
    

    }
