package tddPac;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class TesteDivisao {
	private String[] numeros;
	
	
	@Before
	public void recebe(){
		//recebo os números
		System.out.println("Proximo Test: ");
		numeros = DivideDois.recebeNumeros();
	}

	@Test
	public void receberNumerosVazios() {
		//verifico se os numeros estão preenchidos
		Assert.assertTrue("Um ou mais números estão vazios", DivideDois.verificaNumeroVazio(numeros));
		
	}
	
	@Test
	public void receberLetraEmvezNumero() {
		//verifico se recebeu letra em vez de numero
		Assert.assertFalse("O valor dado não é um digito", DivideDois.isDigite(numeros));
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void receberZero(){
		//verifica divisão por 0
		DivideDois.dividir(numeros);
	}
	
	@Test
	public void confereDivisao(){
		//verifica se o método de divisão está certo
		Assert.assertFalse("divisão errada", DivideDois.verificaDivisao(numeros));
	}
	

}
