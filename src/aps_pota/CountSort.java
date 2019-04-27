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
		int maior = indiceMaiorValor(vetor);//retorna o indice de maior valor
		int[] aux = new int[vetor[maior]+1];//cria um vetor auxiliar com o tamanho do valor do maior elemento+1
		int[] resposta = new int[vetor.length];
		this.comparacoes++;
		for (int i=0; i < vetor.length; i++){//percorre vetor e conta o numero de ocorrencias correspondente em aux . "quantos X tem no vetor?" e incrementa aux[X]. 
			aux[vetor[i]]+=1;
			this.comparacoes++;
		}
		this.comparacoes++;
		for(int i = 1; i<aux.length;i++){//
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
