package ala3EstruturaPac;


public class No {
	private Pessoa pessoa;
	private No proximoNo;
	
	
	
	public No(Pessoa P) {
		pessoa = P;
	}
	public No() {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public No getProximoNo() {
		return proximoNo;
	}
	public void setProximoNo(No proximoNo) {
		this.proximoNo = proximoNo;
	}
	

}
