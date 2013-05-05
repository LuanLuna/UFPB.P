package pacBanco;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cliente  {
	protected String nome;
	protected String rg;
	protected String cpf;
	protected String dtNascimento;
	protected Conta conta1;
	protected Conta conta2;
	protected String senha;
	protected ArrayList<String> contaExistente;
	
	public Cliente (String nome, String dtNascimento, String rg, String cpf, int tipoConta, String senha){
		this.nome = nome;
		this.rg = rg;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.senha = senha;
		this.contaExistente = new ArrayList<String>();
		this.contaExistente.add("0"); this.contaExistente.add("0");
		
		switch(tipoConta){
			case 1:
				conta1 = new Corrente();
				conta1.saldo = 0;
				this.contaExistente.add(0,"1");
				break;
			case 2:
				conta2 = new Poupanca();
				conta2.saldo = 0;
				this.contaExistente.add(1, "1");
				break;
			case 3:
				conta1 = new Corrente();
				conta1.saldo = 0;
				conta2 = new Poupanca();
				conta2.saldo = 0;
				
				this.contaExistente.add(0,"1");
				this.contaExistente.add(1, "1");
				break;
				
				
		}
	}
	
	public void adicionaConta(int parametro){
		switch(parametro){
		case 1:
			if(this.contaExistente.get(0).equals("0")){
			this.conta1 = new Corrente();
			this.contaExistente.add(0,"1");
			JOptionPane.showMessageDialog(null, "Conta Corrente criada com Sucesso!");
			this.conta1.saldo = 0;}
			break;
		case 2:
			if(this.contaExistente.get(1).equals("0")){
			this.conta2 = new Poupanca();
			this.contaExistente.add(1,"1");
			JOptionPane.showMessageDialog(null, "Conta Poupança criada com Sucesso!");
			this.conta2.saldo = 0;}
			break;
		}
	}

		



	

		public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

		public ArrayList<String> getContaExistente() {
		return contaExistente;
	}

	public void setContaExistente(ArrayList<String> contaExistente) {
		this.contaExistente = contaExistente;
	}

		public String toString(){
		String s = "";
		s += "Nome: " + this.nome + "\nData de nascimento: " + this.dtNascimento + "\nRegistro Geral: " + this.rg + "\nCPF: " + this.cpf;
		return(s);
	}

}
