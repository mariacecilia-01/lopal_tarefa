package br.dev.cecilia.tarefas.ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Home {
	private JLabel labelTitulo;
	private JButton buttonFuncionarios;
	private JButton buttonTarefas;
	
	private Font fontTitulo = new Font("Arial", Font.BOLD, 24);
	private Font fontButton = new Font("Arial", Font.BOLD, 16);
	
	public Home () {
		criarTela();
	}
	
	private void criarTela(){
		JFrame tela = new JFrame();
		tela.setTitle("Organizador de tarefas");
		tela.setSize(500, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		Container painel = tela.getContentPane();
		
		labelTitulo = new JLabel("Organizador de tarefas");
		labelTitulo.setBounds(115, 5, 350, 100);
		labelTitulo.setFont(fontTitulo);
		
		buttonFuncionarios = new JButton();
		buttonFuncionarios.setBounds(30, 150, 200, 50);
		buttonFuncionarios.setText("Funcionários");
		buttonFuncionarios.setFont(fontButton);
		
		buttonTarefas = new JButton();
		buttonTarefas.setBounds(260, 150, 200, 50);
		buttonFuncionarios.setText("Tarefas");
		buttonFuncionarios.setFont(fontButton);
		
		painel.add(labelTitulo);
		painel.add(buttonFuncionarios);
		painel.add(buttonTarefas);
		
		buttonFuncionarios.addActionListener(new ActionListener() {
			
			

			@Override
			public void actionPerformed(ActionEvent e) {
//				buttonFuncionarios;
				
				
			}
		});
		
		
		tela.setVisible(true);
	}

}
