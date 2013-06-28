package arvorepac;

public class NoTree {
	private NoTree pai, filhoEsquerda, filhoDireita;
	private String valor;
	
	
	public NoTree(String valor) {
		this.valor = valor;
	}
	
	
	
	public String getValor() {
		return valor;
	}




	public void setValor(String valor) {
		this.valor = valor;
	}




	
	
	
	
	
	public NoTree getPai() {
		return pai;
	}
	public void setPai(NoTree pai) {
		this.pai = pai;
	}
	public NoTree getFilhoEsquerda() {
		return filhoEsquerda;
	}
	public void setFilhoEsquerda(NoTree filhoEsquerda) {
		this.filhoEsquerda = filhoEsquerda;
	}
	public NoTree getFilhoDireita() {
		return filhoDireita;
	}
	public void setFilhoDireita(NoTree filhoDireita) {
		this.filhoDireita = filhoDireita;
	}
	
	

}
