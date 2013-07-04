package arvorepac;

import java.util.LinkedList;
import java.util.List;

public class Diretorio {
	private String nome;
	private Diretorio pai;
	private List<Diretorio> subdiretorios = new LinkedList<Diretorio>();
	private List<Arquivo> arquivos = new LinkedList<Arquivo>();
	
	public Diretorio(String nome) {
		this.nome = nome;
		this.subdiretorios = new LinkedList<Diretorio>();
	}
	
	public void setArquivos(List<Arquivo> arquivos) {
		this.arquivos = arquivos;
	}

	public void addSubDiretorio(Diretorio diretorio){
		this.subdiretorios.add(diretorio);
		diretorio.setPai(this);
	}
	
	public List<Arquivo> getArquivos() {
		return arquivos;
	}

	public void addArquivo(Arquivo arquivo){
		arquivos.add(arquivo);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Diretorio getPai() {
		return pai;
	}

	public void setPai(Diretorio pai) {
		this.pai = pai;
	}

	public List<Diretorio> getSubDiretorios() {
		return subdiretorios;
	}

	public void setSubDiretorios(List<Diretorio> filhos) {
		this.subdiretorios = filhos;
	}

}
