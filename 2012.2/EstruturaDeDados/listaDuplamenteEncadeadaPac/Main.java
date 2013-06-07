package listaDuplamenteEncadeadaPac;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManipulacaoNoDuplo mani = new ManipulacaoNoDuplo();
		
		mani.add("a");
		mani.add("b");
		mani.add("d");
		
		mani.addPosicao("c", 2);
		mani.addInicio("primeiro");
		mani.mostraPessoas();
		
		System.out.println("removendo o final");
		mani.removerFIm();
		mani.mostraPessoas();
		
		System.out.println("removendo o começo");
		mani.removeInicio();
		mani.mostraPessoas();
		
		System.out.println("removendo na posição");
		mani.removePorIndice(1);
		mani.mostraPessoas();
	}

}
