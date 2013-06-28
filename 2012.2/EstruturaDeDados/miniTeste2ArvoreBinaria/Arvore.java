package arvorepac;

public class Arvore implements Comparador{
	public NoTree raiz;
	private NoTree temp, temp2;
	private int i = 0;
	
	public void inserir(String valor){
		NoTree novo = new NoTree(valor);
		if(raiz == null){
			raiz = novo;
			System.out.println(valor);
			temp = raiz;
			return;
		}
		
		if(comparadorMaiorQ(valor)){
			if(temp.getFilhoDireita() != null){
				temp = temp.getFilhoDireita();
				inserir(valor);
			}
			else{				
				temp.setFilhoDireita(novo);
				temp.getFilhoDireita().setPai(temp);
				System.out.println(valor);
			}
		}
		
		else{if(raiz == null){
			raiz = novo;
			System.out.println(valor);
			temp = raiz;
			return;
		}
			if(temp.getFilhoEsquerda() != null){
				temp = temp.getFilhoEsquerda();
				inserir(valor);
			}
			else{				
				temp.setFilhoEsquerda(novo);
				temp.getFilhoEsquerda().setPai(temp);
				System.out.println(valor);
			}
		}
		temp = raiz;
		
	}
	
	public boolean contem(String valor, NoTree no){
		boolean c2 = false, c1 = false;
		if(no != null){
			
			if(no.getValor().equalsIgnoreCase(valor)){
				return true;
			}
			if(no.getFilhoDireita() != null){
				c1 = contem(valor, no.getFilhoDireita());
			}
			if(no.getFilhoEsquerda() != null){
				c2 = contem(valor, no.getFilhoEsquerda());
			}
			
		}
		return c1 || c2;
		
		
	}

	@Override
	public boolean comparadorMaiorQ(String valor) {
		if(temp.getValor().compareToIgnoreCase(valor) >= 0){
			return true;
		}
		return false;
	}
	
	public void verArvore(){
		System.out.println("Nó"+i+++": "+temp.getValor());
		if(temp.getFilhoDireita() != null){
			temp = temp.getFilhoDireita();
			verArvore();
		}
		
		if(temp.getFilhoEsquerda() != null){
			temp = temp.getFilhoEsquerda();
			verArvore();
		}
		
	}
	

}
