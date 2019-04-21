/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_pota;

/**
 *
 * @author Iran
 */
public class InsertionSort extends AlgOrd {

    public InsertionSort(String nome) {
        super(nome);
    }

    private void Insertion(){
        
        this.comparacoes++;
        for (int i = 1; i < vetor.length; i++) {
            
            int j = i;

            this.comparacoes++;
            while (j > 0 && vetor[j - 1] > vetor[j]) {
                int aux = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = aux;
                j = j - 1;
            }
        }

    }
    
    @Override
    public void Orderna() {
        Insertion();
        this.tamanho = vetor.length;
    }
}

