package arvorepac;

import java.util.LinkedList;
import java.util.List;

public class Diretorio {
	private String nome;
	private Diretorio pai;
	private List<Diretorio> filhos;
	
	public Diretorio(String nome) {
		this.nome = nome;
		this.filhos = new LinkedList<Diretorio>();
	}
	
	public Diretorio criarSubDiretorio(String nome){
		Diretorio d = new Diretorio(nome);
		d.setPai(this);
		filhos.add(d);
		return d;
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
		return filhos;
	}

	public void setFilhos(List<Diretorio> filhos) {
		this.filhos = filhos;
	}

}
