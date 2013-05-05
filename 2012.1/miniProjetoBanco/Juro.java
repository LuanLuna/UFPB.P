package pacBanco;
import java.util.Date;

public class Juro extends Transacao {
	
	
	public Juro(float valor){
		data = new Date(System.currentTimeMillis());
		this.valor =  this.Juros(valor);
		extrato = "" + data + ": Juro de Depósito ------------ " + this.valor+"\n";
		
	}
	
	public float Juros(float valor){
		float juros = (valor * 2)/100;
		return(juros);
		
	}

	@Override
	float CalcCPMF(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	


}