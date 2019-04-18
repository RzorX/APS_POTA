package aps_pota;

import static aps_pota.SelectionSort.SelectionSort;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class APS_POTA {

    public static void main(String[] args) {

        ArrayList<int[]> vetores = new ArrayList();
        
        vetores.add(new int[5]);
        vetores.add(new int[10]);
        vetores.add(new int[50]);
        //vetores.add(new int[100]);
        //vetores.add(new int[1000]);
        //vetores.add(new int[10000]);
             
        for(int i = 0; i<vetores.size(); i++){
            
            //Define o tamanho do vetor e gerar um valor aleatorio
            int v[] = new int [vetores.get(i).length];
            v = GenerateRandVet(v.length);
            
            //Criar instancias para comparação
            //Meger Sort
            MergeSort ms = new MergeSort("Merge Sort");
            
            for (int j = 0; j < 50; j++ ) {
                //Executa cada script de comparação 50 vezes com o mesmo vetor
                
                //Meger Sort
                ms.Orderna(v);
                
                //Selection Sort
                SelectionSort(v);
                //Adicionar os demais...
            }            
            
            System.out.println(ms.toString());
        }
    }

    public static int[] GenerateRandVet(int tamanho){
       
       int vetor[] = new int[tamanho];

       for (int e = 0; e < 50; e++) {
            
            for (int i = 0; i < vetor.length; i++) {
                int random = (int) (Math.random() * 101);
                vetor[i] = random;
            }
        }

        return vetor; 
    }

}

