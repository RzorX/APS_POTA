/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps_pota;

/**
 *
 * @author isantos
 */
public abstract class AlgOrd {
    private int comparacoes;
    private String nome;
    int tamanho;

    public AlgOrd(String nome) {
        this.nome = nome;
    }
        
    @Override
    public String toString(){
        return "Algoritmo: " + nome + "\n"
                +"Total de compações com vetor tamanho " + tamanho + " :" + comparacoes;
    }
    
    public int TotalDeComparacoes(){
        return comparacoes;
    }

    public String GetNome() {
        return nome;
    }
    
    
    
    public abstract void Orderna(int vet[]);
    
}
