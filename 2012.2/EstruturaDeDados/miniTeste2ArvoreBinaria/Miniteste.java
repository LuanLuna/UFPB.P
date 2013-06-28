package arvorepac;

public class Miniteste {
	
	public static void main(String[] args){
		
		SistemaDeArquivos sist = new SistemaDeArquivos();
		
		sist.setRaiz(new Diretorio("home"));
		
		Diretorio u = sist.getRaiz().criarSubDiretorio("usuario");
		Diretorio app = sist.getRaiz().criarSubDiretorio("apilcativos");
		
		
		Diretorio joao = u.criarSubDiretorio("joão");
		Diretorio maria= u.criarSubDiretorio("maria");
		
		joao.criarSubDiretorio("documentos");
		joao.criarSubDiretorio("musicas");
		
		
		maria.criarSubDiretorio("documentos");
		maria.criarSubDiretorio("musicas");
		maria.criarSubDiretorio("fotos");
	
		app.criarSubDiretorio("word");
		app.criarSubDiretorio("exel");
		

		
		
		
	}
	

}
