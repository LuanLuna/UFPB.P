package listaDuplamenteEncadeadaPac;



public class ManipulacaoNoDuplo {
	private NoDuplo cabeca, calda;
	private int quantidade;
	
	public void removePorIndice(int posicao){
		
		NoDuplo temp = cabeca;
		int cont = 0;
		while(cont < posicao-1){
			temp = temp.getProximo();
			cont++;
		}
		temp.setProximo(temp.getProximo().getProximo());
		temp.getProximo().setAnterior(temp);
		
		quantidade--;
		this.atualizaCalda();
	}
	
	public void removeInicio(){
		NoDuplo temp = cabeca;
		this.setCabeca(temp.getProximo());
		cabeca.setAnterior(null);
		quantidade--;
		this.atualizaCalda();
	}
	public void removerFIm(){
		NoDuplo temp = calda.getAnterior();
		temp.setProximo(null);
		quantidade--;
		this.atualizaCalda();
	}
	
	public void addInicio(String str){
		NoDuplo novo = new NoDuplo(str);
		cabeca.setAnterior(novo);
		novo.setProximo(cabeca);
		this.setCabeca(novo);
		this.atualizaCalda();
		
	}
	
	public void addPosicao(String str, int posicao){
		if(posicao > quantidade-1){
			System.out.println("posição não existente!");
			return;
		}
		NoDuplo novo = new NoDuplo(str);
		if(cabeca == null){
			this.cabeca = novo;
			return;
		}
		NoDuplo temp = cabeca;
		int cont = 0;
		while(cont < posicao-1){
			temp = temp.getProximo();
			cont++;
		}
		novo.setProximo(temp.getProximo());
		novo.getProximo().setAnterior(novo);
		
		temp.setProximo(novo);
		novo.setAnterior(temp);
		this.atualizaCalda();
		quantidade++;
		
		
		
		
	}
	public void add(String str){
		NoDuplo novo = new NoDuplo(str);
		if(cabeca == null){
			this.cabeca = novo;
			quantidade++;
			return;
		}
		NoDuplo temp = cabeca;
		while(temp.getProximo() != null){
			temp = temp.getProximo();
		}
		novo.setAnterior(temp);
		temp.setProximo(novo);
		this.atualizaCalda();
		this.quantidade++;
		
	}
	
	private void atualizaCalda(){
		NoDuplo temp = cabeca;
		while(temp.getProximo() != null){
			temp = temp.getProximo();
		}
		calda = temp;
	}

	public NoDuplo getCabeca() {
		return cabeca;
	}

	public void setCabeca(NoDuplo cabeca) {
		this.cabeca = cabeca;
	}

	public NoDuplo getCalda() {
		return calda;
	}

	public void setCalda(NoDuplo calda) {
		this.calda = calda;
	}
	
	public void mostraPessoas(){
		System.out.println("atual: "+cabeca.getStr()+" proximo: "+cabeca.getProximo().getStr());
		NoDuplo temp = cabeca.getProximo();
		while(temp.getProximo() != null){
			System.out.println("atual: "+temp.getStr()+
								" anterior: "+temp.getAnterior().getStr()+
								" proximo: "+temp.getProximo().getStr());
			temp = temp.getProximo();
		}
		System.out.println("atual: "+temp.getStr()+
				" anterior: "+temp.getAnterior().getStr());
	}

}
