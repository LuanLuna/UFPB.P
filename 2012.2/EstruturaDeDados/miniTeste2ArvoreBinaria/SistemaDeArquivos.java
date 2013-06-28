package arvorepac;

public class SistemaDeArquivos {
	private Diretorio raiz;
	
	
	public void SistemaDeArquivo(){
		raiz = new Diretorio("/");
	}


	public Diretorio getRaiz() {
		return raiz;
	}


	public void setRaiz(Diretorio raiz) {
		this.raiz = raiz;
	}
	
	

}
