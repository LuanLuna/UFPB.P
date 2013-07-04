package arvorepac;

public class Arquivo {
	private String nome;
	private double tamanho;
	
	public Arquivo(String nome, double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
