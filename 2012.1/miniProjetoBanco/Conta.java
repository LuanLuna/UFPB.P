package pacBanco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public abstract class Conta {
	protected float saldo;
	private Transacao transacao;
	private ArrayList<String> transacoes;





	public void Extrato(){
		String ext = "";
		String line1 = "";

		for(int i = 0;i < 60; i++){
			line1 = line1 + "-";
		}

		for(int i = 0; i < this.getTransacoes().size(); i++){
			ext = ext + this.getTransacoes().get(i);
		}


		JOptionPane.showMessageDialog(null,line1+"\n"+"\nEXTRATO\n"+ ext+"\nSaldo Atual: "+this.saldo+"\n"+line1);
	}



	public ArrayList<String> getTransacoes() {
		return transacoes;
	}



	public abstract void Sacar(double valor);

	abstract void Depositar(float valor);

	public float getSaldo() {
		return saldo;
	}
	public Transacao getTransacao() {
		return transacao;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



}
