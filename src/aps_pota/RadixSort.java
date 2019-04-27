package aps_pota;
public class RadixSort extends AlgOrd{
	public RadixSort(String nome) {
		super(nome);
	}
	
	
	public int NumDigitos(int[] vet){//retorna a quantidade máxima de digitos em um array.
		int dig=0;
		this.comparacoes++;
		for (int i = 0; i < vet.length; i++) {
			int temp = String.valueOf(vet[i]).length();
			dig=dig>temp?dig:temp;
			this.comparacoes++;
		}
		return dig;
	}
	
	public int[] CountingSort(int[] vet,int dec) { //count parcial olha apenas a dezena atual. logo so olha numeros de 0 ate 9.
		int[] contador= new int[10];//o contador vai guardar quantas vezes um numero apareceu em uma dezena numa varredura de vet.		
		int[] saida=new int[vet.length];
		
		this.comparacoes++;
		for (int i = 0; i < vet.length; i++) {
			contador[ (vet[i]/dec)%10 ]++; // guarda a contagem da ocorrencia da dezena atual
			this.comparacoes++;
		}
            
		this.comparacoes++;
		for (int i = 1; i < 10; i++) {
			contador[i] += contador[i - 1]; //transforma um contador num array de apontamentos para indices do vetor saída descobrindo quantos numeros menores existem para o indice atual.
			this.comparacoes++;
		}
            
		this.comparacoes++;
		for (int i = vet.length - 1; i >= 0; i--) 
        { 
            saida[contador[ (vet[i]/dec)%10 ] - 1] = vet[i]; //conclui 	ordenando o vetor saida usando apenas a dezena atual.
            contador[ (vet[i]/dec)%10 ]--; 
            this.comparacoes++;
        } 
		
		this.comparacoes++;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = saida[i];  // copia os valores para vet
            this.comparacoes++;    
        }
        return vet; // retorna vet
	}
	
	public void radixSort(int[] vet) {
		int[]temp;
		int dig = NumDigitos(vet);
		int decimal=1;
		this.comparacoes++;
		for (int i = 0; i < dig; i++) { //para cada dígito do maior numero de vet, este for itera uma vez. ex: 300 iteraria 3 vezes.
				CountingSort(vet, decimal);
				decimal*=10;
				this.comparacoes++;
		}
	}
	
	@Override
	public void Orderna() {
    radixSort(vetor);
    this.tamanho = vetor.length;
    }
		
}
