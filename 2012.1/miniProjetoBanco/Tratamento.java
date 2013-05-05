package pacBanco;

import javax.swing.JOptionPane;

public class Tratamento {

	public boolean verificaNome(Banco objeto, String nome){

		for(int i = 0; i < objeto.clientes.size();i++){
			if(nome.equals(objeto.clientes.get(i).nome)){
				JOptionPane.showMessageDialog(null, "Já existe um usuário resistrado com esse nome, tente um login diferente!!!");
				return(false);

			}
			

		}
		if(nome == null || nome.length() == 0){
			JOptionPane.showMessageDialog(null, "Você não digitou a informação solcitada\nPor favor digite novamente!");
			return(false);
		}
		else{

		return(true);}
	}
	public boolean verificaNull(String var){
		if(var == null || var.length() == 0){
			JOptionPane.showMessageDialog(null, "Você não digitou a informação solcitada\nPor favor digite novamente!");
			return(false);
		}
		else{
			return(true);
		}
		
		
	}

}
