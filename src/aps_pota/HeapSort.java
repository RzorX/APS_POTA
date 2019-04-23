package aps_pota;

public class HeapSort extends AlgOrd {

    public HeapSort(String nome) {
        super(nome);
    }

    public void heapsort(int[]a, int tamanho ){
            CriarHeap(a, a.length-1);
            int fim = a.length-1;
            while (fim>0) {            
                troca(a, a[fim],a[0]);
                fim = fim -1;
                ArrumaHeap(a, 0, fim);
        }
    }
    
    void CriarHeap (int[]a, int tamanho){
        int inicio = Math.floorDiv((tamanho -2),2);
        while (inicio>=0) {            
            ArrumaHeap(a, inicio, tamanho-1);
            inicio = inicio -1;
        }
    }

    private void troca(int a[], int i, int j) {
       int temp = a[i];
       a[j] = a[i];
       a[i] = temp;
    }

    private void ArrumaHeap(int[] a, int i, int fim) {
        int raiz = i;
        int filho;
        int trocar;
        while ((raiz*2+1)<=fim) {            
            filho = raiz*2+1;
            trocar = raiz;
            if (a[trocar]<a[filho]) {
                trocar = filho;
            }
            if (filho+1<=fim && a[trocar]<a[filho+1]) {
                trocar = filho+1;
            }
            if (trocar == raiz) {
                break;
            }else{
                troca(a, raiz, trocar);
                raiz = trocar;
            }
            
        }
    }
    
    @Override
    public void Orderna() {
        heapsort(vetor, tamanho);
        this.tamanho = vetor.length;
        
    }
    
}
