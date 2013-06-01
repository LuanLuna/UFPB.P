package minitestEstrutura;

public class MiniTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String g = "hoje é dia 03/05/2013, sexta-feira";
		capturaData(g);*/
		int[] Int = {2,1,2,3,2,4,2,4};
		
		System.out.println(contaInteiros(Int , 4));
		// TODO Auto-generated method stub	
		/*Colecao c = new Colecao(10);
		for(int i = 0; i < 5; i++){
			c.add("N"+i);	
		
		}
		c.addInicio("luan1");
		c.add("luan2", -1);
		c.add("luan3", 1);
		c.add("luan4");
		//System.out.println(c.elementos.length);
		for(int i = 0; i< c.elementos.length; i++){
			System.out.println(c.elementos[i]);
		}
		System.out.println("-----------------");
		System.out.println("pop: "+c.removerInicio());
		System.out.println("pop: "+c.remover(2));
		for(int i = 0; i< c.elementos.length; i++){
			System.out.println(c.elementos[i]);
		}*/
	}
	
	public static void capturaData(String s){
		String temp = s.substring(11,21);
		s = "";
		
		for(int i = 0; i < temp.length(); i++){
			if((i == 2) || (i == 5)){
				s += "-";
			}
			else{
			s += temp.charAt(i);
			}
		}
		temp = "";
		for(int i = s.length()-1; i >= 0; i--){
			temp += s.charAt(i);
		}
		System.out.println(temp);
	}
	
	public static int contaInteiros(int[] array, int num){
		int cont = 0;
		for(int i: array){
			if(i == num){
				cont++;
			}
		}
		return cont;
		
	}
	

}
