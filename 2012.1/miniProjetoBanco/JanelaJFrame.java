package pacBanco;
import java.awt.Container;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public  class JanelaJFrame extends JApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//-------------------------------------------------------------------ATRIBUTOS-------------------------------------------------------
	private JButton[] b = { new JButton("Cadastrar"),new JButton("LogIn"),  new JButton("Editar"), new JButton("Sacar"), new JButton("Depositar"), new JButton("Extrato"), new JButton("Info"), new JButton("LogOut") };
	JLabel label1;
	Banco banco = new Banco();
	int idUsuario = -1;
	String usuario;
	String escolhaDeConta;
	Tratamento trat = new Tratamento();
	private ActionListener al = new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			Tratamento t = new Tratamento();
			String valor;
			String id = ((JButton) e.getSource()).getText();
			//----------------------------------------------------------cadastro-------------------------------------------------------------
			if (id.equals("Cadastrar")){


				banco.CadastraCliente();

			}
			//-----------------------------------------------------------------EDI��O DE INFORMA��ES------------------------------------------			
			else if (id.equals("Editar")){
				if(idUsuario == -1){
					JOptionPane.showMessageDialog(null, "N�o existe usu�rio logado");
				}
				else{
					String parametro = JOptionPane.showInputDialog("Digite:\n0-Nome\n1-Rg\n2-CPF\n3-Data de nascimento\n4-Senha");
					while(t.verificaNull(parametro) == false){
						parametro = JOptionPane.showInputDialog("Digite:\n0-Nome\n1-Rg\n2-CPF\n3-Data de nascimento\n4-Senha");

					}


					if(parametro.equals("0")){
						String nome = JOptionPane.showInputDialog("Digite o nome");
						while(t.verificaNull(nome) == false){
							nome = JOptionPane.showInputDialog("Digite o nome");

						}
						banco.clientes.get(idUsuario).setNome(nome);
						JOptionPane.showMessageDialog(null, "Opera�� realizada");
					}
					else if(parametro.equals("1")){
						String RG = JOptionPane.showInputDialog("Digite o RG");
						while(t.verificaNull(RG) == false){
							RG = JOptionPane.showInputDialog("Digite o RG");

						}
						banco.clientes.get(idUsuario).setRg(RG);
						JOptionPane.showMessageDialog(null, "Opera�� realizada");
					}
					else if(parametro.equals("2")){
						String CPF = JOptionPane.showInputDialog("Digite o CPF");
						while(t.verificaNull(CPF) == false){
							CPF = JOptionPane.showInputDialog("Digite o CPF");

						}
						banco.clientes.get(idUsuario).setRg(CPF);
						JOptionPane.showMessageDialog(null, "Opera�� realizada");
					}
					else if(parametro.equals("3")){
						String dataN = JOptionPane.showInputDialog("Digite a Data de Nascimento");
						while(t.verificaNull(dataN) == false){
							dataN = JOptionPane.showInputDialog("Digite a Data de Nascimento");

						}
						banco.clientes.get(idUsuario).setRg(dataN);
						JOptionPane.showMessageDialog(null, "Opera�� realizada");
					}
					else if(parametro.equals("4")){
						String senha1 = JOptionPane.showInputDialog("Digite a Senha antiga");
						while(t.verificaNull(senha1) == false){
							senha1 = JOptionPane.showInputDialog("Digite a Senha antiga");

						}
						String senha2 = JOptionPane.showInputDialog("Digite a nova Senha");
						while(t.verificaNull(senha2) == false){
							senha2 = JOptionPane.showInputDialog("Digite a nova Senha");

						}
						if(banco.clientes.get(idUsuario).getSenha().equalsIgnoreCase(senha1)){
							banco.clientes.get(idUsuario).setSenha(senha2);
							JOptionPane.showMessageDialog(null, "Opera�� realizada");
						}
						else{
							JOptionPane.showMessageDialog(null,"As senhas n�o conferem");
						}

					}



					/*JOptionPane.showConfirmDialog(null, "or no", "choose yes",
		            JOptionPane.YES_NO_OPTION);*/
					else{
						JOptionPane.showMessageDialog(null,"N�mero errado digite novamente");
					}
				}
			}
			//--------------------------------------------------------------------SAQUE------------------------------------------------------------------
			else if (id.equals("Sacar")) {

				int escNewCont;
				if(idUsuario == -1){
					JOptionPane.showMessageDialog(null, "N�o existe usu�rio logado");
				}

				else{
					System.out.println(idUsuario);
					escolhaDeConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupan�a");
					while(t.verificaNull(escolhaDeConta) == false){
						escolhaDeConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupan�a");

					}
					if(escolhaDeConta.equals("1")){
						if(banco.clientes.get(idUsuario).getContaExistente().get(Integer.parseInt(escolhaDeConta)-1).equals("1")){
							if(banco.clientes.get(idUsuario).conta1.saldo <= 0){
								JOptionPane.showMessageDialog(null, "Saldo insuficiente");
							}
							else{
								valor = JOptionPane.showInputDialog("Digite o valor");
								while(t.verificaNull(valor) == false){
									valor = JOptionPane.showInputDialog("Digite o valor");

								}
								banco.clientes.get(idUsuario).conta1.Sacar(Double.parseDouble(valor));
								JOptionPane.showMessageDialog(null, "Seu saldo � "+banco.clientes.get(idUsuario).conta1.getSaldo());
							}
						}
						else{
							escNewCont = JOptionPane.showConfirmDialog(null, "Conta inexistente\nDeseja criar uma conta Corrente?");
							if(escNewCont == JOptionPane.YES_OPTION){
								banco.clientes.get(idUsuario).adicionaConta(1);}
							else{
								JOptionPane.showMessageDialog(null, "Opera��o cancelada!");
							}
						}

					}

					else if(escolhaDeConta.equals("2")){
						if(banco.clientes.get(idUsuario).getContaExistente().get(Integer.parseInt(escolhaDeConta)-1).equals("1")){
							if(banco.clientes.get(idUsuario).conta2.saldo <= 0){
								JOptionPane.showMessageDialog(null, "Saldo insuficiente");
							}
							else{
								valor = JOptionPane.showInputDialog("Digite o valor");
								while(t.verificaNull(valor) == false){
									valor = JOptionPane.showInputDialog("Digite o valor");

								}
								banco.clientes.get(idUsuario).conta2.Sacar(Double.parseDouble(valor));
								JOptionPane.showMessageDialog(null, "Seu saldo � "+banco.clientes.get(idUsuario).conta2.getSaldo());
							}
						}
						else{
							escNewCont = JOptionPane.showConfirmDialog(null, "conta inexistente\nDeseja criar uma conta Poupan�a?");
							if(escNewCont == JOptionPane.YES_OPTION){
								banco.clientes.get(idUsuario).adicionaConta(2);}
							else{
								JOptionPane.showMessageDialog(null, "Opera��o cancelada!");
							}
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "Escolha inv�lida, tente novamente");
					}

				}
			} 
			//-----------------------------------------------------------DEP�SITO-------------------------------------------------------			
			else if (id.equals("Depositar")) {
				int escNewCont;
				if(idUsuario == -1){
					JOptionPane.showMessageDialog(null, "N�o existe usu�rio logado");
				}
				else{

					escolhaDeConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupan�a");
					while(t.verificaNull(escolhaDeConta) == false){
						escolhaDeConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupan�a");

					}
					if(escolhaDeConta.equals("1")){
						if(banco.clientes.get(idUsuario).getContaExistente().get((Integer.parseInt(escolhaDeConta))-1).equals("1")){
							valor = JOptionPane.showInputDialog("Digite o valor");
							while(t.verificaNull(valor) == false){
								valor = JOptionPane.showInputDialog("Digite o valor");

							}
							banco.clientes.get(idUsuario).conta1.Depositar(Float.parseFloat(valor));
							JOptionPane.showMessageDialog(null, "Seu saldo � "+banco.clientes.get(idUsuario).conta1.getSaldo());
						}
						else{
							escNewCont = JOptionPane.showConfirmDialog(null, "conta inexistente\nDeseja criar uma conta Poupan�a?");
							if(escNewCont == JOptionPane.YES_OPTION){
								banco.clientes.get(idUsuario).adicionaConta(1);}
							else{
								JOptionPane.showMessageDialog(null, "Opera��o cancelada!");
							}
						}
					}
					else if(escolhaDeConta.equals("2")){
						if(banco.clientes.get(idUsuario).getContaExistente().get((Integer.parseInt(escolhaDeConta))-1).equals("1")){
							valor = JOptionPane.showInputDialog("Digite o valor");
							while(t.verificaNull(valor) == false){
								valor = JOptionPane.showInputDialog("Digite o valor");

							}
							banco.clientes.get(idUsuario).conta2.Depositar(Float.parseFloat(valor));
							JOptionPane.showMessageDialog(null, "Seu saldo � "+banco.clientes.get(idUsuario).conta2.getSaldo());
						}
						else{
							escNewCont = JOptionPane.showConfirmDialog(null, "conta inexistente\nDeseja criar uma conta Poupan�a?");
							if(escNewCont == JOptionPane.YES_OPTION){

								banco.clientes.get(idUsuario).adicionaConta(2);
							}
							else{
								JOptionPane.showMessageDialog(null, "Opera��o cancelada!");
							}
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "Escolha inv�lida, tente novamente");
					}

				}
			}
			//-------------------------------------------------------------EXTRATO DE CONTA---------------------------------------------------------------

			else if (id.equals("Extrato")) {
				if(idUsuario == -1){
					JOptionPane.showMessageDialog(null, "N�o existe usu�rio logado");
				}
				else{

					escolhaDeConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupan�a");
					while(t.verificaNull(escolhaDeConta) == false){
						escolhaDeConta = JOptionPane.showInputDialog("Digite:\n1 - Corrente\n2 - Poupan�a");

					}


					if(escolhaDeConta.equals("1")){
						if(banco.clientes.get(idUsuario).getContaExistente().get((Integer.parseInt(escolhaDeConta))-1).equals("1")==false || banco.clientes.get(idUsuario).conta1.getTransacoes().size() < 0  ){
							JOptionPane.showMessageDialog(null, "Nenhuma transa��o existente");
						}
						else{
							if(banco.clientes.get(idUsuario).contaExistente.get(Integer.parseInt(escolhaDeConta)-1).equals("1")){
								banco.clientes.get(idUsuario).conta1.Extrato();
							}

						}
					}

					else if(escolhaDeConta.equals("2")){

						if(banco.clientes.get(idUsuario).getContaExistente().get((Integer.parseInt(escolhaDeConta))-1).equals("1")==false || banco.clientes.get(idUsuario).conta2.getTransacoes().size() < 0){

							JOptionPane.showMessageDialog(null, "Nenhuma transa��o existente");

						}

						else{

							if(banco.clientes.get(idUsuario).contaExistente.get(Integer.parseInt(escolhaDeConta)-1).equals("1")){

								banco.clientes.get(idUsuario).conta2.Extrato();  

							}

						}
					}
					else{
						JOptionPane.showMessageDialog(null, "Escolha inv�lida\nDigite:\n1 - Corrente\n2 - Poupan�a");
					}



				}




			}
			//--------------------------------------------------LOGIN DE USU�RIO----------------------------------------------------
			else if (id.equals("LogIn")){
				System.out.println(banco.clientes.size());
				usuario = JOptionPane.showInputDialog("Digite o nome de usuario");
				while(t.verificaNull(usuario) == false){
					usuario = JOptionPane.showInputDialog("Digite o nome de usuario");

				}


				String senhaLogin = JOptionPane.showInputDialog("Digite a senha");
				while(t.verificaNull(senhaLogin) == false){
					senhaLogin = JOptionPane.showInputDialog("Digite a senha");

				}
				idUsuario = banco.busca.buscaNome(banco.clientes, usuario);
				System.out.println(idUsuario);
				if(idUsuario == -1){
					JOptionPane.showMessageDialog(null, "O usu�rio n�o existe");
				}

				else if(senhaLogin.equals(banco.clientes.get(idUsuario).getSenha()))
				{



					JOptionPane.showMessageDialog(null, "Bem vindo Sr(a) "+banco.clientes.get(idUsuario).nome);

				}
				else{
					JOptionPane.showMessageDialog(null, "Senha errada");
					idUsuario = -1;
				}




			}
			//-----------------------------------------------INFO DA CONTA-----------------------------------------------------------			
			else if (id.equals("Info")){
				if(idUsuario == -1){
					JOptionPane.showMessageDialog(null, "N�o existe usu�rio logado");
				}
				else{
					JOptionPane.showMessageDialog(null, banco.clientes.get(idUsuario).toString());
				}
			}
			//------------------------------------------------logout-----------------------------------------------------------------
			else if (id.equals("LogOut")){
				if(idUsuario > -1){
					idUsuario = -1;
					JOptionPane.showMessageDialog(null, "Logout efetuado com sucesso");}
				else{
					JOptionPane.showMessageDialog(null, "N�o existe Usu�rio logado");
				}
			}
		}

	};


	public void init() {
		label1 = new JLabel("Bem vindo ao Banco!!!\n");
		Container pane = this.getContentPane(); //captura o painel do JFrame
		pane.setLayout(new GridLayout(4, 1));//define o layout do painel
		pane.add(label1);
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		for (int i = 0; i < b.length; i++) {
			b[i].addActionListener(al);
			cp.add(b[i]);
		}

	}



	public static void run(JApplet applet, int width, int height) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}


}