package aps_pota;

public class CountSort extends AlgOrd{
	
	public CountSort(String nome) {
        super(nome);
    }
	
	public int indiceMaiorValor(int[] v){	
		int m = 0;
		this.comparacoes++;
		for (int i=0; i<v.length; i++){
			this.comparacoes++;
			if(v[i]>v[m]){
				m = i;
			}
			this.comparacoes++;
		}
		return m;
	}
	public void countSort(int vetor[]){
		int maior = indiceMaiorValor(vetor);
		int[] aux = new int[vetor[maior]+1];
		int[] resposta = new int[vetor.length];
		this.comparacoes++;
		for (int i=0; i < vetor.length; i++){
			aux[vetor[i]]+=1;
			this.comparacoes++;
		}
		this.comparacoes++;
		for(int i = 1; i<aux.length;i++){
			aux[i]+= aux[i-1];
			this.comparacoes++;
		}
		this.comparacoes++;
		for(int i=0; i< vetor.length;i++){
			resposta[aux[vetor[i]]-- -1] = vetor[i];
			this.comparacoes++;
		}
		this.comparacoes++;
		for(int i = 0; i< vetor.length; i++){
			vetor[i]=resposta[i];
			this.comparacoes++;
		}
	}
	@Override
	public void Orderna() {
	    countSort(vetor);
	    this.tamanho = vetor.length;
	    }
}
