package pacBanco;
import java.util.Date;

public class CPMF extends Transacao {
	
	public CPMF(float valor){
		this.valor =  this.CalcCPMF(valor);
		
		data = new Date(System.currentTimeMillis());
		extrato = "" + data + ": CPMF ------------ " + this.valor + "\n"; 
		
	}
	
	public float CalcCPMF(double valor){
		float ValorCpmf = (float) ((valor * 1.5)/100);
		return(ValorCpmf);
	}
	
	@Override float Juros(float valor) {
		return 0;
	}
	

	

	
}
