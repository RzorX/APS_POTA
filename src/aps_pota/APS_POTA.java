package aps_pota;

import static aps_pota.MergeSort.MergeSort;
import static aps_pota.SelectionSort.SelectionSort;

public class APS_POTA {

    public static void main(String[] args) {

        int tam5 = 5;
        int tam10 = 10;
        int tam50 = 50;
        int tam100 = 100;
        int tam1000 = 1000;
        int tam10000 = 10000;


        int[] vetor1 = GenerateRandVet(tam5);
        int[] vetor2 = GenerateRandVet(tam10);
        int[] vetor3 = GenerateRandVet(tam50);
        int[] vetor4 = GenerateRandVet(tam100);
        int[] vetor5 = GenerateRandVet(tam1000);
        int[] vetor5 = GenerateRandVet(tam10000);

        SelectionSort(vetor1);
        //MergeSort(vetor1, 0, vetor1.length - 1);
        System.out.println("\n");
        System.out.println("Número médio de comparações (SELECTION SORT): ");

    }

    public static int[] GenerateRandVet(int tamanho){
       
       int vetor[] = new int[tamanho];

       for (int e = 0; e < tamanho; e++) {
            
            for (int i = 0; i < vetor.length; i++) {
                int random = (int) (Math.random() * 101);
                vetor[i] = random;
            }
        }

        return vetor; 
    }

}

