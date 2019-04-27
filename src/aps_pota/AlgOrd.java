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
    protected long comparacoes;
    private String nome;
    int tamanho;
    protected int vetor[];
    
    public AlgOrd(String nome) {
        this.nome = nome;
        this.comparacoes = 0;
    }
        
    @Override
    public String toString(){
        return "Algoritmo: " + nome + "\n"
                +"Total de compações com vetor tamanho " + tamanho + " :" + comparacoes;
    }
    
    public long TotalDeComparacoes(){
        return comparacoes;
    }

    public String GetNome() {
        return nome;
    }
    
    public void setVetor(int vet[]){        
        vetor = new int[vet.length];
        
        //Copia vetor para manter o original
        for (int i = 0; i < vet.length; i++) {
            vetor[i] = vet[i];
        }
    }
    
    public void ImprimeVetor(){        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }
    
    public abstract void Orderna();
    
}
