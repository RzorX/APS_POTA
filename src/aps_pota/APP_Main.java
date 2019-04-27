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
            //Merge Sort
            MergeSort ms = new MergeSort("Merge Sort");
            //Selection Sort
            SelectionSort ss = new SelectionSort("Selection Sort");
            //Insertion Sort
            InsertionSort is = new InsertionSort("Insertion Sort");
            //Quick Sort
            QuickSort qs = new QuickSort("Quick Sort");
            
            //Count Sort
            CountSort cs = new CountSort("Count Sort");
            
            //Heap Sort
            HeapSort hs = new HeapSort("Heap Sort");
            
            //Radix Sort
            RadixSort rs = new RadixSort("Radix Sort");

            
            //Faz 50 ordenações com vetores de tamanho i
            for (int j = 0; j < 50; j++ ) {
                //Define o tamanho do vetor e gera um valor aleatorio
                v = new int [vetores.get(i).length];
                v = GenerateRandVet(v.length);
                
                //Executa cada script de comparação 50 vezes com o mesmo vetor
                            
                //Bubble Sort
                bs.setVetor(v);
                bs.Orderna();
                
                //Merge Sort
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
                
                //Heap Sort
                hs.setVetor(v);
                hs.Orderna();
                
                //BubbleSort
                bs.setVetor(v);
                bs.Orderna();
                
                //Radix
                rs.setVetor(v);
                rs.Orderna();

                //Adicionar os demais...
            }            
            
            //Adicionar print dos ordenadotes
            System.out.println("=======================================================");
            System.out.println(bs.toString());
            System.out.println(ms.toString());
            System.out.println(ss.toString());
            System.out.println(is.toString());
            System.out.println(qs.toString());
            System.out.println(hs.toString());
            System.out.println(cs.toString());
            System.out.println(rs.toString());
            System.out.println("=======================================================");


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

