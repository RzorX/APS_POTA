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

        int vetor1[] = new int[tam5];
        for (int i = 0; i < vetor1.length; i++) {
            int random = (int) (Math.random() * 101);
            vetor1[i] = random;
            System.out.print(vetor1[i] + ", ");
        }
        
        MergeSort(vetor1, 0, vetor1.length - 1);
      
        
        System.out.println("Nova sequencia com Merge Sort: ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + ", ");
        }
        System.out.println();
        
        int vetor2[] = new int[tam10];
        for (int i = 0; i < vetor2.length; i++) {
            int random = (int) (Math.random() * 101);
            vetor2[i] = random;
        }

        int vetor3[] = new int[tam50];
        for (int i = 0; i < vetor3.length; i++) {
            int random = (int) (Math.random() * 101);
            vetor3[i] = random;
        }

        int vetor4[] = new int[tam100];
        for (int i = 0; i < vetor4.length; i++) {
            int random = (int) (Math.random() * 101);
            vetor4[i] = random;
        }
        int vetor5[] = new int[tam1000];
        for (int i = 0; i < vetor5.length; i++) {
            int random = (int) (Math.random() * 101);
            vetor5[i] = random;
        }

        int vetor6[] = new int[tam10000];
        for (int i = 0; i < vetor6.length; i++) {
            int random = (int) (Math.random() * 101);
            vetor6[i] = random;
        }
         
    }
    
}
