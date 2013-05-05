package minitest1poo;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Aluno[] alunos = new Aluno[10];
		for(int i = 0; i < 10; i++){
			System.out.println("Digite o nome do aluno: ");
			alunos[i] = new Aluno(input.next());
		}
		System.out.println("Digite o nome da disciplina: ");
		Disciplina matematica = new Disciplina(alunos,input.next());
		
		matematica.InformacoesDaDisciplina();

	}

}
