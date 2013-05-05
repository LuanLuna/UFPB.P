package pacBanco;

import java.util.Date;

public class Credito extends Transacao {
	
	public Credito(float valor){
		data = new Date(System.currentTimeMillis());
		this.valor =  valor;
		
		this.extrato = "" + data + ": Depósito ------------ " + this.valor+"\n"; 
		
	}
	
	

	@Override
	float Juros(float valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	float CalcCPMF(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

}
