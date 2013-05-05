package minitest1poo;

public class Disciplina {
	private String nome;
	private Aluno[] listaDeAlunos;
	
	public Disciplina(Aluno[] alunos, String nome){
		this.nome = nome;
		listaDeAlunos = alunos;
	}
	
	public void InformacoesDaDisciplina(){
		System.out.println("Discplina: "+nome+"\n\n");
		System.out.println("Alunos: ");
		for(int i = 0; i < this.listaDeAlunos.length; i++){
			System.out.println((i+1)+": "+this.listaDeAlunos[i].getNome());
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public Aluno[] getListaDeAlunos() {
		return listaDeAlunos;
	}
	
	
	
	public void setListaDeAlunos(Aluno[] listaDeAlunos) {
		this.listaDeAlunos = listaDeAlunos;
	}
	
	
	
	
	

}
