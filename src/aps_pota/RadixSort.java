package aps_pota;

public class RadixSort extends AlgOrd {

    public RadixSort(String nome) {
        super(nome);
    }

    public int NumDigitos(int[] vet) {//retorna a quantidade de digitos Maximo em um array.
        int dig = 0;
        for (int i = 0; i < vet.length; i++) {
            int temp = String.valueOf(vet[i]).length();
            dig = dig > temp ? dig : temp;
        }
        return dig;
    }

    public void radixSort(int[] vet) {
        int[] temp;
        int dig = NumDigitos(vet);
        int decimal = 1;
        for (int i = 0; i < dig; i++) {
            int[] conteiner = new int[10];//sao 10 possiveis numeros 0-9

        }
    }

    @Override
    public void Orderna() {
        radixSort(vetor);
        this.tamanho = vetor.length;
    }

}
