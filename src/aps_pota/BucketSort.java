package aps_pota;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort extends AlgOrd {

    public BucketSort(String nome) {
        super(nome);
    }
    
    public void bucketSort(int[] v){
        
    }

    public void bucketSort(){
        
        //Verifica o valor maximo
        int maxValue = vetor[0];
        comparacoes++;
        for (int i = 1; i < vetor.length; i++) {
            comparacoes++;
            if(maxValue<vetor[i])
                maxValue = vetor[i];
            
            comparacoes++;
        }
        int numBaldes = maxValue/5;
        
        //Cria os baldes
        ArrayList[] buckets = new ArrayList[numBaldes];
        
        comparacoes++;
        for (int i = 0; i < numBaldes; i++) {
            ArrayList<Object> b = new ArrayList();
            buckets[i] = b;
            comparacoes++;
        }
        
        //Popula os baldes
        comparacoes++;
        for (int i = 0; i < vetor.length; i++) {
           int j = numBaldes-1;
           comparacoes++; 
           while(true){
               comparacoes++; 
                if (j < 0) {
                    break;
                }
                comparacoes++; 
                if(vetor[i] >= (j * 5)){
                    buckets[j].add(vetor[i]);
                    break;
                }
                
                j--;
                comparacoes++; 
            }
        }
        
           
        int indice = 0;
        
        comparacoes++; 
        for (int i = 0; i < numBaldes; i++) {
             //Usa outro algoritmo como auxiliar
            int []v = new int[buckets[i].size()];
            
            comparacoes++; 
            for (int k = 0; k < v.length; k++) {
                v[k] = (Integer)buckets[i].get(k);
                comparacoes++; 
            }
            
            InsertionSort s = new InsertionSort("Insertion Sort");
            s.setVetor(v);
            s.Orderna();
            
            
            // Devolve os valores ao vetor de entrada:
            comparacoes++; 
            for (int n = 0; n < s.vetor.length; n++, indice++){
                    vetor[indice] = s.vetor[n];
                    comparacoes++; 
            }
            
            comparacoes = s.comparacoes + comparacoes; 
        }
           
    }
    
    @Override
    public void Orderna() {
        bucketSort();
        this.tamanho = vetor.length;
    }

}
