package listaDuplamenteEncadeadaPac;

public class NoDuplo {
	private NoDuplo proximo, anterior;
	private String str;
	
	public NoDuplo(String str) {
		this.str = str;
	}
	public NoDuplo getProximo() {
		return proximo;
	}
	public void setProximo(NoDuplo proximo) {
		this.proximo = proximo;
	}
	public NoDuplo getAnterior() {
		return anterior;
	}
	public void setAnterior(NoDuplo anterior) {
		this.anterior = anterior;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
}
