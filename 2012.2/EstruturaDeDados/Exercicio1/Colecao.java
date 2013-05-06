package minitestEstrutura;

public class Colecao {
	String[] elementos;
	int indiceVazio;
	static final int incremento = 1;
	
	public Colecao(int tam){
		elementos = new String[tam];
		indiceVazio = 0;
	}
	
	public String get(int posicao){
		return (elementos[posicao]);
	}
	
	
	public void add(String E){
		if(indiceVazio < elementos.length && (elementos[indiceVazio] == null)){
			elementos[indiceVazio ++] = E;
			
		}
		else if(indiceVazio < elementos.length && (elementos[indiceVazio] != null)){
			elementos[this.buscaIndiceNull()] = E;
		}
		else{
			this.redmencionaArray();
			elementos[indiceVazio ++] = E;
			}
		
	}
	
	private int buscaIndiceNull(){
		int indiceNull = indiceVazio;
		while(elementos[indiceNull++] != null){
		}
		return indiceNull;
		
	}
	
	
	private void redmencionaArray(){
		String[] elementosTemp = elementos;
		elementos = new String[indiceVazio + 1];
		for(int i = 0; i < elementos.length; i++){
			elementos[i] = elementosTemp[i];}
	}
	
	public void addInicio(String valor){
		if(indiceVazio < elementos.length){
			String temp;
			for(int i = 0; i < indiceVazio+1; i++){
				temp = elementos[i];
				elementos[i] = valor;
				valor = temp;
				
			}
		}
		else if(indiceVazio == elementos.length){
			this.redmencionaArray();
			this.addInicio(valor);
		}
		
	}
	
	public void add(String valor, int posicao) throws IndiceInvalidoException{
		if((posicao > this.elementos.length) || (posicao < 0)){
			throw new IndiceInvalidoException();
		}
		if((posicao < elementos.length) && (elementos[posicao] == null)){
			elementos[posicao] = valor;
		}
		else if((posicao < elementos.length) && (elementos[posicao] != null)){
			String temp = null;
			int i = posicao;
			while(valor != null){
				temp = elementos[i];
				elementos[i++] = valor;
				valor = temp;
				
			}
		}
	}
	
	public String removerInicio(){
		String strTemp = elementos[0];
		for(int i = 1; i < elementos.length; i++){
			elementos[i-1] = elementos[i];
		}
		elementos[elementos.length - 1] = null;
		return strTemp;
	}
	
	public String remover(int indice) throws IndiceInvalidoException{
		if((indice > this.elementos.length) || (indice < 0)){
			throw new IndiceInvalidoException();
		}
		String strTemp = elementos[indice];
		for(int i = indice; i < elementos.length-1; i++){
			elementos[i] = elementos[i+1];
			
		}
		elementos[elementos.length - 1] = null;
		return strTemp;
		
	}
	
}
