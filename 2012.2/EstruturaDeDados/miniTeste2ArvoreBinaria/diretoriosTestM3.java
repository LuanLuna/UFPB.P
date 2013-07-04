package arvorepac;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class diretoriosTest {
	SistemaDeArquivos sist;
	
	@Before
	public void iniciar(){
		sist = new SistemaDeArquivos();
		
		sist.setRaiz(new Diretorio("home"));
		
		List<Diretorio> d1 = new LinkedList<>();
		d1.add(new Diretorio("1"));
		d1.add(new Diretorio("2"));
		d1.add(new Diretorio("3"));
		
		List<Diretorio> d2 = new LinkedList<>();
		d2.add(new Diretorio("4"));
		d2.add(new Diretorio("5"));
		d2.add(new Diretorio("6"));
		
		List<Diretorio> d3 = new LinkedList<>();
		d3.add(new Diretorio("7"));
		d3.add(new Diretorio("8"));
		d3.add(new Diretorio("9"));
		
		List<Arquivo> a1 = new LinkedList<>();
		a1.add(new Arquivo("1", 2.0));
		a1.add(new Arquivo("2", 2.0));
		
		List<Arquivo> a2 = new LinkedList<>();
		a2.add(new Arquivo("3", 3.0));
		a2.add(new Arquivo("4", 3.0));
		
		List<Arquivo> a3 = new LinkedList<>();
		a3.add(new Arquivo("5", 4.0));
		a3.add(new Arquivo("6", 4.0));
		
		sist.getRaiz().setSubDiretorios(d1);
		sist.getRaiz().setArquivos(a1);
		sist.getRaiz().getSubDiretorios().get(1).setSubDiretorios(d2);
		sist.getRaiz().getSubDiretorios().get(1).setArquivos(a2);
		sist.getRaiz().getSubDiretorios().get(1).getSubDiretorios().get(1).setSubDiretorios(d3);
		sist.getRaiz().getSubDiretorios().get(1).getSubDiretorios().get(1).setArquivos(a3);
	}
	@Test
	public void testTamanhoDiretorios() {
		Assert.assertEquals(sist.espacoOcupadoEmDisco(), 18.0);
	}

}
