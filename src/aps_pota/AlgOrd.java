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
    protected int comparacoes;
    private String nome;
    int tamanho;
    protected int vetor[];
    
    public AlgOrd(String nome, int vet[]) {
        this.nome = nome;
        
        vetor = new int[vet.length];
        
        //Copia vetor para manter o original
        for (int i = 0; i < vet.length; i++) {
            vetor[i] = vet[i];
        }
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
    
    
    
    public abstract void Orderna();
    
}
