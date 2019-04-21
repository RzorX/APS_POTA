package aps_pota;

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
            //Vetor que será utilizado para ordenação
            int v[];
            
            //Criar instancias para comparação
            
            //Meger Sort
            MergeSort ms = new MergeSort("Merge Sort");
            //Selection Sort
            SelectionSort ss = new SelectionSort("Selection Sort");
            
            for (int j = 0; j < 50; j++ ) {
                //Define o tamanho do vetor e gera um valor aleatorio
                v = new int [vetores.get(i).length];
                v = GenerateRandVet(v.length);
                
                //Executa cada script de comparação 50 vezes com o mesmo vetor
                            
                //Meger Sort
                ms.setVetor(v);
                ms.Orderna();
                
                //Selection Sort
                ss.setVetor(v);
                ss.Orderna();

                //Adicionar os demais...
            }            
            
            System.out.println(ms.toString());
            System.out.println(ss.toString());
        }
    }

    public static int[] GenerateRandVet(int tamanho){
       
       int vetor[] = new int[tamanho];

       for (int e = 0; e < 50; e++) {
            
            for (int i = 0; i < vetor.length; i++) {
                int random = (int) (Math.random() * 101);
                vetor[i] = random;
            }/*
            System.out.println("SEQUENCIA ORIGINAL");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]+ ", ");
           }
            System.out.println("\n");
            MergeSort ms = new MergeSort("Merge Sort");
            SelectionSort ss = new SelectionSort("Selection Sort");
            ms.Orderna(vetor);
            ss.Orderna(vetor);
            
            System.out.println("SEQUENCIA APÓS ORDERNAÇÂO");
            for (int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i]+ ", ");
           }
            System.out.println("\n");
            //System.out.println(ms.toString());
            //System.out.println(ss.toString());
            */
        }

        return vetor; 
    }

}

