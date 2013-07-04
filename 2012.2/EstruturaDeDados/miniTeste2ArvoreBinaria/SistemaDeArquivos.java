package arvorepac;

public class SistemaDeArquivos {
	private Diretorio raiz;
	
	
	
	public void SistemaDeArquivo(){
		raiz = new Diretorio("/");
	}
	
	public double  espacoOcupadoEmDisco(){
		
		if(raiz==null){
			return 0;
		}
		return RecEspacoOcupadoEmDisco(raiz);
	}
	
	private double RecEspacoOcupadoEmDisco(Diretorio d){
		double tamanhoTotal = 0;
		if(d.getArquivos().size() > 0){		
			for(Arquivo i: d.getArquivos()){
				tamanhoTotal += i.getTamanho();
			}
		}
		if(d.getSubDiretorios().size() > 0){
			for(Diretorio i: d.getSubDiretorios()){
				d = i;
				tamanhoTotal += RecEspacoOcupadoEmDisco(d);
			}
		}
				
				
		return tamanhoTotal;
	}


	public Diretorio getRaiz() {
		return raiz;
	}


	public void setRaiz(Diretorio raiz) {
		this.raiz = raiz;
	}
	
	

}
