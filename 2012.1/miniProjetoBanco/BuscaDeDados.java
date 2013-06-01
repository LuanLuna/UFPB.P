package pacBanco;

import java.util.ArrayList;

public class BuscaDeDados {
	
	public int buscaNome(ArrayList<Cliente> cliente, String dado){
		if(cliente.size() > 0){
			for(int i = 0; i < cliente.size(); ++i ){
				
				if(cliente.get(i).getNome().equalsIgnoreCase(dado) == true){
					return(i);
				}
			}
		}
		return(-1);
	}
	
	

}
