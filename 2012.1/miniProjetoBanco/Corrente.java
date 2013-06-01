package pacBanco;

import java.util.ArrayList;

public class Corrente extends Conta {
	    ArrayList<String> transacoes = new ArrayList<String>();
	
	
	
	public Corrente(){
		this.saldo = 0;
		System.out.println("conta corrente ativada");
		
	}
	
	
	
	
	public void Sacar(double valor){
		Debito d = new Debito(valor);
		CPMF cpmf = new CPMF((float)valor);
		this.setSaldo((float)(saldo-valor-cpmf.valor));
		this.transacoes.add(d.extrato);
		this.transacoes.add(cpmf.extrato);
		
		
	}
	public void Depositar(float valor){
		Credito cred = new Credito(valor);
		this.setSaldo((float)this.getSaldo()+valor);  
		this.transacoes.add(cred.extrato);
		
	}
	public float getSaldo() {
		return saldo;
	}
	



	public ArrayList<String> getTransacoes() {
		return transacoes;
	}
	


}
