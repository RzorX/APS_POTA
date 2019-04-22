/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_pota;

/**
 *
 * @author gleisson.silva
 */
public class QuickSort extends AlgOrd {

    public QuickSort(String nome) {
        super(nome);
    }

    public void QuickSort(int[] v, int esquerda, int direita) {
        int esq = esquerda;
        int dir = direita;
        int pivo = v[(esq + dir) / 2];
        int troca;
        this.comparacoes++;
        while (esq <= dir) {
            this.comparacoes++;
            while (v[esq] < pivo) {
                esq = esq + 1;
                this.comparacoes++;
            }
            this.comparacoes++;
            while (v[dir] > pivo) {
                dir = dir - 1;
                this.comparacoes++;
            }
            this.comparacoes++;
            if (esq <= dir) {
                troca = v[esq];
                v[esq] = v[dir];
                v[dir] = troca;
                esq = esq + 1;
                dir = dir - 1;
                this.comparacoes++;
            }
            this.comparacoes++;
        }
        this.comparacoes++;
        if (dir > esquerda) {
            QuickSort(v, esquerda, dir);
        }
        this.comparacoes++;
        if (esq < direita) {
            QuickSort(v, esq, direita);
        }
    }
    
    
    @Override
    public void Orderna() {
        this.QuickSort(vetor,0,vetor.length-1);
        this.tamanho = vetor.length;
    }

}
