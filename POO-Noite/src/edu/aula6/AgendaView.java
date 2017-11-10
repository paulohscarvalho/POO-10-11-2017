package edu.aula6;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AgendaView {
	
	private JTextField txtNome = new JTextField();
	private JTextField txtTelefone = new JTextField();
	private JTextField txtEmail = new JTextField();
	private JButton btnSalvar = new JButton("Salvar");
	private JButton btnPesquisar = new JButton("Pesquisar");
	public AgendaView() { 
		JFrame janela = new JFrame("Agenda Telefonica");
		JPanel panPrincipal = new JPanel(new BorderLayout());
		JPanel panBotoes = new JPanel();
		JPanel panForm = new JPanel(new GridLayout(3, 2));
		panBotoes.add(btnSalvar);
		panBotoes.add(btnPesquisar);
		panForm.add(new JLabel("Nome"));
		panForm.add(txtNome);
		panForm.add(new JLabel("Telefone"));
		panForm.add(txtTelefone);
		panForm.add(new JLabel("Email"));
		panForm.add(txtEmail);
		panPrincipal.add(panForm, BorderLayout.CENTER);
		panPrincipal.add(panBotoes, BorderLayout.SOUTH);
		janela.setContentPane( panPrincipal );
		janela.setSize(400, 250);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public static void main(String[] args) {
		new AgendaView();
	}
}
