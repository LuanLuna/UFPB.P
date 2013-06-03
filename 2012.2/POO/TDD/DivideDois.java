package tddPac;

import java.util.Scanner;

public class DivideDois {
	public static final Scanner input = new Scanner(System.in);
	/*
	 * recebe dois números do usuário e divide, mostrando o resultado na tela.
	 * 1. receber os números(v)
	 * 2. receber letra em vez de digito(v)
	 * 3. receber 0 no segundo numero(v)
	 * 4. dividir(v)
	 * 5. mostrar resultado(v)
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){			
			System.out.println(botarPraGerar());
		}
	}
	
	public static String botarPraGerar(){//fluxo do programa
		System.out.println("Dividir 2 números");
		String[] numeros = recebeNumeros();
		if(verificaNumeroVazio(numeros) == false){
			System.out.println("Um dos números está vazio");
		}
		else if(isDigite(numeros) == false){
			System.out.println("você digitou uma letra em vez de um número");
		}
		else{
			try{
				double divisao = dividir(numeros);
				if(verificaDivisao(numeros)==true){
					return "Resutado: "+divisao;
				}
			}catch(ArithmeticException e){
				System.out.println("É impossivel dividir por 0");
			}
		}
		return "'Deste jeito fica dificil de trabalhar'(Calculadora)";
		
	}
	
	public static String[] recebeNumeros(){//recebe os números
		String[] numeros = new String[2];
		System.out.println("1 digite um numero: ");
		numeros[0] = input.next();
		System.out.println("2 digite um numero: ");
		numeros[1] = input.next();
		return numeros;
		
	}
	
	public static boolean verificaNumeroVazio(String[] numeros){//verifica se há algum número vazio
		if(numeros[0] == null || numeros[1] == null){
			return false;
		}
		return true;
	}

	public static boolean isDigite(String[] numeros) {//verifica se algum dos números é um character
		try{
			Integer.parseInt(numeros[0]);
			try{
				Integer.parseInt(numeros[1]);
			}catch(NumberFormatException e1){
				return false;
			}
		}catch(NumberFormatException e2){
			return false;
		}
		
		return true;
	}

	public static double dividir(String[] numeros) {//faz a divisão dos npumeros
		int[] numerosInt = {Integer.parseInt(numeros[0]),Integer.parseInt(numeros[1])};
		if(numerosInt[1]==0){			
			throw new ArithmeticException();
		}
		double result = numerosInt[0]/numerosInt[1];
		return result;
	}

	public static boolean verificaDivisao(String[] numeros) {//verifica se a divisão foi certa
		if(dividir(numeros) != Integer.parseInt(numeros[0])/Integer.parseInt(numeros[1])){
			return false;
		}
		return true;
	}

}
