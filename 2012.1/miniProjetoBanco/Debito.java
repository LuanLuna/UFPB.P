package pacBanco;

import java.util.Date;

public class Debito extends Transacao {
	
	public Debito(double valor){
		data = new Date(System.currentTimeMillis());
		this.valor =  (float)valor;
		extrato = "" + data + ": Saque ------------ " + this.valor+"\n"; 
		
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
