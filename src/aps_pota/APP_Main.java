package aps_pota;

import java.util.ArrayList;

public class APP_Main {

    public static void main(String[] args) {

        ArrayList<int[]> vetores = new ArrayList();
        
        vetores.add(new int[5]);
        vetores.add(new int[10]);
        vetores.add(new int[50]);
        vetores.add(new int[100]);
        vetores.add(new int[1000]);
        vetores.add(new int[10000]);
             
        for(int i = 0; i<vetores.size(); i++){
            //Vetor que será utilizado para ordenação
            int v[];
            
            //Criar instancias para comparação
            
            //Bubble Sort
            BubbleSort bs = new BubbleSort("Bubble Sort");
            //Meger Sort
            MergeSort ms = new MergeSort("Merge Sort");
            //Selection Sort
            SelectionSort ss = new SelectionSort("Selection Sort");
            //Insertion Sort
            InsertionSort is = new InsertionSort("Insertion Sort");
            //Quick Sort
            QuickSort qs = new QuickSort("Quick Sort");
            //Count Sort
            CountSort cs = new CountSort("Count Sort");
            
            
            //Faz 50 ordenações com vetores de tamanho i
            for (int j = 0; j < 50; j++ ) {
                //Define o tamanho do vetor e gera um valor aleatorio
                v = new int [vetores.get(i).length];
                v = GenerateRandVet(v.length);
                
                //Executa cada script de comparação 50 vezes com o mesmo vetor
                            
                //Bubble Sort
                bs.setVetor(v);
                bs.Orderna();
                
                //Meger Sort
                ms.setVetor(v);
                ms.Orderna();
                
                //Selection Sort
                ss.setVetor(v);
                ss.Orderna();

                //Insertion Sort
                is.setVetor(v);
                is.Orderna();
                
                //Quick Sort
                qs.setVetor(v);
                qs.Orderna();
                
                //CountSort
                cs.setVetor(v);
                cs.Orderna();
                //Adicionar os demais...
            }            
            
            //Adicionar print dos ordenadotes
            System.out.println("=======================================================");
            System.out.println(bs.toString());
            System.out.println(ms.toString());
            System.out.println(ss.toString());
            System.out.println(is.toString());
            System.out.println(qs.toString());
            System.out.println(cs.toString());
            System.out.println("=======================================================");
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
            /*
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
