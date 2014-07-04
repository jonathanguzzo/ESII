import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame {


	JFrame jf_frame;
	JPanel pn_painelBotoes, pn_principal, pn_organizaEmail, pn_organizaSenha;
	JLabel lb_email,lb_senha;
	JTextField tx_email, tx_senha;
	JButton bt_logar, bt_sair;
	String[] email,senha;

	public void iniciacomponentes(){
		lb_email = new JLabel("Email: ");
		lb_senha = new JLabel("Senha: ");
		tx_email = new JTextField(14);
		tx_senha = new JTextField(14);
		bt_logar = new JButton("Logar");
		bt_sair = new JButton("Sair");
		pn_painelBotoes = new JPanel();
		pn_organizaEmail = new JPanel(new FlowLayout());
		pn_organizaSenha = new JPanel(new FlowLayout());
		pn_principal = new JPanel(new GridLayout(8,8));
		jf_frame = new JFrame();
		bt_logar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Logar();
				boolean saida=false;
				for (int i = 0; i < email.length; i++) {
					if((tx_email.getText().equals(email[i]))&&(tx_senha.getText().equals(senha[i]))){
						saida=true;
						break;
					}else{
						saida=false;
					}
				}
				if(saida == true){
					JOptionPane.showMessageDialog(null,"Seja bem vindo ");
				}else{
					JOptionPane.showMessageDialog(null,"Usuario Incorreto.");
				}
			}
		});
		bt_sair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		pn_organizaEmail.add(lb_email);
		pn_organizaEmail.add(tx_email);
		pn_principal.add(pn_organizaEmail);
		pn_organizaSenha.add(lb_senha);
		pn_organizaSenha.add(tx_senha);
		pn_principal.add(pn_organizaSenha);
		pn_painelBotoes.add(bt_logar);
		pn_painelBotoes.add(bt_sair);

		jf_frame.add(pn_painelBotoes, BorderLayout.SOUTH);
		jf_frame.add(pn_principal);

		jf_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf_frame.setResizable(false);
		jf_frame.setLocationRelativeTo(null);
        jf_frame.setSize(300,280);
        jf_frame.setVisible(true);
        jf_frame.setTitle("Login");
	}

	private void Logar(){
		this.email = new String[4];
		this.senha = new String[4];

		this.email[0] = "user"; 
		this.senha[0] = "1234"; 
	
	}


	public static void main(String[] args) {
		Login teste = new Login();
		teste.iniciacomponentes();
	}
}