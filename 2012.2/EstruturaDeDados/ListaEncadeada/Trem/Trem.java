package ala3EstruturaPac;


public class Trem {
	private No cabeca, calda;
	private int quantNos = 0;
	
	public void removePorPessoa(String nome){
		No temp = this.cabeca;
		int cont = 0;
		while(cont < this.quantNos){
			if(nome.equalsIgnoreCase(temp.getPessoa().getNome())){
				this.removePorIndice(cont);
				this.defineCalda();
				this.atualizaQuantidade();
				return;
			}
			cont++;
			temp = temp.getProximoNo();
		}
		System.out.println("Nome não existente!!!");
	}
	
	public void removePorIndice(int indice){
		if(this.verificaIndiceVazio(indice)){
			return;
		}
		No temp = cabeca;
		int cont = 0;
		while(cont < indice-1){
			temp = temp.getProximoNo();
			cont++;
		}
		temp.setProximoNo(temp.getProximoNo().getProximoNo());
		this.defineCalda();
		this.atualizaQuantidade();
	}
	
	private boolean verificaIndiceVazio(int indice){
		if(this.verificaListaVazia() || indice > this.getQuantNos()){
			System.out.println(">>Indice não existe");
			return true;
		}
		return false;
	}
	
	public void removeInicio(){
		if(this.verificaListaVazia()){
			return;
		}
		cabeca = cabeca.getProximoNo();
		this.defineCalda();
		this.atualizaQuantidade();
		
	}
	
	private boolean verificaListaVazia(){
		if(this.cabeca == null ){
			System.out.println(">>A lista está vazia");
			return true;
		}
		return false;
	}
	
	public void remove(){
		if(this.verificaListaVazia()){
			return;
		}
		No temp = cabeca;
		int cont = 1;
		while(cont < this.getQuantNos()-1){
			temp = temp.getProximoNo();
			cont++;
		}
		temp.setProximoNo(null);
		this.atualizaQuantidade();
		this.defineCalda();
		
		
	}
	
	private void defineCalda(){
		No temp = cabeca;
		while(temp.getProximoNo() != null){
			temp = temp.getProximoNo();
		}
		calda = temp;
	}
	
	public void addPorIndice(Pessoa p, int indice){
		if(this.verificaIndiceVazio(indice)){
			return;
		}
		No novo = new No(p);
		No temp = cabeca;
		int contador = 0;
		while(contador < indice-1){
			temp = temp.getProximoNo();
			contador++;
		}
		No reserva = temp.getProximoNo();
		temp.setProximoNo(novo);
		temp = temp.getProximoNo();
		temp.setProximoNo(reserva);
		this.atualizaQuantidade();
		this.defineCalda();
		
		
		
	}
	private void atualizaQuantidade(){
		if(this.verificaListaVazia()){
			return;
		}
		No temp = cabeca;
		int contador = 1;
		while(temp.getProximoNo() != null){
			temp = temp.getProximoNo();
			contador++;
		}
		
		this.setQuantNos(contador);
	}
	
	public void add(Pessoa p){
		No novo = new No(p);
		if(this.preencheCbeca(novo)){
			return;
		}
		No temp = cabeca;
		while(temp.getProximoNo() != null){
			temp = temp.getProximoNo();
		}
		temp.setProximoNo(novo);
		this.defineCalda();
		this.atualizaQuantidade();
		
	}
	
	public void addInicio(Pessoa p){
		No novo = new No(p);
		if(this.preencheCbeca(novo)){
			return;
		}
		No temp = cabeca;
		cabeca = novo;
		novo.setProximoNo(temp);
		this.atualizaQuantidade();
		this.defineCalda();
		
	}
	
	public void mostraPessoas(){
		No temp = this.cabeca;
		while(temp != null){
			System.out.println(temp.getPessoa().getNome());
			temp = temp.getProximoNo();
		}
	}
	
	private boolean preencheCbeca(No novo){
		if(cabeca == null){
			cabeca = novo;
			this.atualizaQuantidade();
			return true;
		}
		return false;
		
	}
	

	public int getQuantNos() {
		return quantNos;
	}

	public void setQuantNos(int quantNos) {
		this.quantNos = quantNos;
	}

	

}
