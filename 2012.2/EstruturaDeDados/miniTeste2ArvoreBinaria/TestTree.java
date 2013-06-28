package arvorepac;

public class TestTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arvore tree = new Arvore();
		int i = 0;
		
		tree.inserir("m");
		
		tree.inserir("f");
		
		tree.inserir("o");
		
		tree.inserir("a");
		
		tree.inserir("h");
		
		tree.inserir("q");

		tree.inserir("n");
		
		System.out.println("z:"+tree.contem("z", tree.raiz));
		System.out.println("m:"+tree.contem("m", tree.raiz));
		System.out.println("f:"+tree.contem("f", tree.raiz));
		System.out.println("o:"+tree.contem("o", tree.raiz));
		System.out.println("a:"+tree.contem("a", tree.raiz));
		System.out.println("h:"+tree.contem("h", tree.raiz));
		System.out.println("q:"+tree.contem("q", tree.raiz));
		System.out.println("n:"+tree.contem("n", tree.raiz));
		
		tree.inserir("z");
		
		System.out.println("z:"+tree.contem("z", tree.raiz));
		
		

	}

}
