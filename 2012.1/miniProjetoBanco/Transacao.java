package pacBanco;
import java.util.ArrayList;
import java.util.Date;

public abstract class Transacao {
	
	String extrato;
	Date data;
	float valor;
	ArrayList<Transacao> transacaoArmazenada = new ArrayList<Transacao>();
	ArrayList<String> transacoes = new ArrayList<String>();
	
	
	
	
	
	abstract float Juros(float valor);
	abstract float CalcCPMF(double valor) ;
	
	
	
	public String getExtrato() {
		return extrato;
	}
	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String toString(){
		String str = "";
		for(int i = 0; i < this.transacoes.size(); i++){
			str += this.transacoes.get(i) + "\n";
		}
		return(str);
	}
	
	

}
