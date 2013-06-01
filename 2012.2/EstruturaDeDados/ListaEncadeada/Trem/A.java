package ala3EstruturaPac;


public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trem t = new Trem();
		t.add(new Pessoa("luan"));
		t.add(new Pessoa("raphael"));
		t.add(new Pessoa("ittalo"));
		t.addInicio(new Pessoa("robson"));
		t.addInicio(new Pessoa("cristiane"));
		t.addPorIndice(new Pessoa("moabio"), 3);
		t.mostraPessoas();
		System.out.println(t.getQuantNos());
		System.out.println("removendo calda");
		t.remove();
		t.mostraPessoas();
		System.out.println(t.getQuantNos());
		System.out.println("removendo cabeça");
		t.removeInicio();
		t.mostraPessoas();
		System.out.println(t.getQuantNos());
		System.out.println("removendo por indice");
		t.removePorIndice(2);
		t.mostraPessoas();
		System.out.println(t.getQuantNos());
		System.out.println("removendo por nome");
		t.removePorPessoa("luan");
		t.mostraPessoas();
		System.out.println(t.getQuantNos());
		

	}

}
