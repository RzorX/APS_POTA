package aps_pota;

public class BubbleSort extends AlgOrd{
	
	public BubbleSort(String nome) {
        super(nome);
    }
	
public int[] bubbleSort(int[] vet){      
    	
    	int n = vet.length-1;
    	int newn=0;
    	do {
    		newn=0;
    		this.comparacoes++;
			for (int i = 1; i < n ; i++) {
				this.comparacoes++;
				if (vet[i-1]>vet[i]) {					
					//swipe!! 
					int temp = vet[i-1];
					vet[i-1] = vet[i];
					vet[i]=temp;
				    //end of swipe						
					newn=i;//marcando a ultima troca
				}
			this.comparacoes++;
			}
			n=newn;
		this.comparacoes++;
		} while (newn!=0);        
        return vet;
    }

@Override
public void Orderna() {
    bubbleSort(vetor);
    this.tamanho = vetor.length;
    }

}
