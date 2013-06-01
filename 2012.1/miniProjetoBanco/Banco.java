package pacBanco;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Banco {
	public ArrayList<Cliente> clientes;
	BuscaDeDados busca;
	
	public Banco(){
		clientes = new ArrayList<Cliente>();
		busca  = new BuscaDeDados();
		//this.CadastraCliente();
		
	}
	
	
	
    public void CadastraCliente(){
    	Tratamento t = new Tratamento();
    	
    	
//------------------------------------------------------------CADASTRNDO CLIENTE-------------------------------------------
    	String nome = JOptionPane.showInputDialog("Digite o nome");
    	System.out.println("nome = "+nome);
    	while(t.verificaNome(this, nome) == false){
    		nome = JOptionPane.showInputDialog("Digite o nome");
    	}
    	String dtNascimento = JOptionPane.showInputDialog("Digite a data de nascimento\nEx: 01/01/1901");
    	while(t.verificaNull(dtNascimento) == false){
    		dtNascimento = JOptionPane.showInputDialog("Digite a data de nascimento\nEx: 01/01/1901");
    		
    	}
    	String rg = JOptionPane.showInputDialog("Digite o Registro Geral");
    	while(t.verificaNull(rg) == false){
    		rg = JOptionPane.showInputDialog("Digite o Registro Geral");
    	}
    	String cpf = JOptionPane.showInputDialog("Digite o Cadastro de Pessoa Física");
    	while(t.verificaNull(cpf) == false){
    		cpf = JOptionPane.showInputDialog("Digite o Cadastro de Pessoa Física");
    	}
    	
    	String paramConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupança\n3 - Poupança e Corrente");
    	while((t.verificaNull(paramConta) == false) || (Integer.parseInt(paramConta) != 1 && Integer.parseInt(paramConta) != 2 && Integer.parseInt(paramConta) != 3)){
    		paramConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupança\n3 - Poupança e Corrente");
    	}
    	
 
    	
    	String senha = JOptionPane.showInputDialog("Digite uma senha");
    	while(senha.length()<4 || senha.length()>4){
    		JOptionPane.showMessageDialog(null, "Digite exatamente 4 caracteres incluindo letras ou números");
    		senha = JOptionPane.showInputDialog("Digite uma senha");
    	}
    	
    	
    	
    	
//------------------------------------------------------------Instanciando Cliente------------------------------------------ 
    	int confirm = JOptionPane.showConfirmDialog(null, "Informações:\nNome: "+nome+"\nRg: "+rg+"\nCPF: "+ cpf+"\nData de nascimento: "+ dtNascimento+"\nDseja realmente cadastrar?");
		if(confirm == JOptionPane.YES_OPTION){
			Cliente cliente = new Cliente(nome,dtNascimento,rg,cpf,Integer.parseInt(paramConta),senha);
			JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
	    	System.out.println(cliente);
	    	this.clientes.add(cliente);
		}
		else{
			JOptionPane.showMessageDialog(null, "Operação cancelada!");
		}
    	
    	
				
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

    
}
