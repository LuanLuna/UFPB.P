package pacBanco;

import java.util.ArrayList;


public class Poupanca extends Conta {
	ArrayList<String> transacoes = new ArrayList<String>();

	
	public Poupanca(){
		System.out.println("conta poupança ativada");
		this.saldo = 0;
		
	}
	
	
	public float getSaldo() {
		return saldo;
	}
	
	public void Depositar(float valor){
		Credito cred = new Credito(valor);
		Juro j = new Juro(valor);
		this.setSaldo((float)this.getSaldo()+valor + j.Juros(valor)); 
		this.transacoes.add(cred.extrato);
		this.transacoes.add(j.extrato);
		
	}
	public void Sacar(double valor){

		Debito d = new Debito(valor);
		this.saldo -= valor;
		this.transacoes.add(d.extrato);
		
		
	}


	public ArrayList<String> getTransacoes() {
		return transacoes;
	}
	
	

}
