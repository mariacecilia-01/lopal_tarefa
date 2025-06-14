package br.dev.cecilia.tarefas.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTarefa {
	
	JLabel lblTitulo;
	JTextField txtTitulo;
	JLabel lblDescricao;
	JTextField txtDescricao;
	JLabel lblDataInicial;
	JTextField txtDataInicial;
	JLabel lblPrazo;
	JTextField txtPrazo;
	JLabel lblConclusao;
	JTextField txtConclusao;
	JLabel lblStatus;
	JComboBox<String> boxStatus;
	JLabel lblFuncionario;
	JComboBox<String> boxFuncionario;
	JButton btnSalvar;
	JButton btnSair;
	
	public FrameTarefa() {
		criarTela();
	}
	
	private void criarTela(){
		JFrame tela = new JFrame();
		tela.setTitle("Cadastro de Tarefas");
		tela.setSize(400, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		Container painel = tela.getContentPane();
		
		lblTitulo = new JLabel("Título");
		lblTitulo.setBounds(10, 10, 50, 50);
		txtTitulo = new JTextField();
		txtTitulo.setBounds(10, 50, 250, 35);
		
		lblDescricao = new JLabel("Descrição da tarefa");
		lblDescricao.setBounds(10, 80, 150, 50);
		txtDescricao = new JTextField();
		txtDescricao.setBounds(10, 120, 250, 35);
		
		lblDataInicial = new JLabel("Data de início");
		lblDataInicial.setBounds(10, 150, 150, 50);
		txtDataInicial = new JTextField();
		txtDataInicial.setBounds(10, 190, 250, 35);
		
		lblPrazo = new JLabel("Prazo");
		lblPrazo.setBounds(10, 220, 150, 50);
		txtPrazo = new JTextField();
		txtPrazo.setBounds(10, 260, 250, 35);
		
		lblConclusao = new JLabel("Data de conclusão");
		lblConclusao.setBounds(10, 290, 150, 50);
		txtConclusao = new JTextField();
		txtConclusao.setBounds(10, 330, 250, 35);
		
		lblStatus= new JLabel("Status");
		lblStatus.setBounds(10, 360, 150, 50);
		boxStatus = new JComboBox<String>();
		boxStatus.setBounds(10, 400, 130, 30);
		boxStatus.addItem("NÃO_INICIADA");
		boxStatus.addItem("EM_ANDAMENTO");
		boxStatus.addItem("FINALIZADA");
		boxStatus.addItem("EM_ATRASO");
		
		painel.add(lblTitulo);
		painel.add(txtTitulo);
		painel.add(lblDescricao);
		painel.add(txtDescricao);
		painel.add(lblDataInicial);
		painel.add(txtDataInicial);
		painel.add(lblPrazo);
		painel.add(txtPrazo);
		painel.add(lblConclusao);
		painel.add(txtConclusao);
		painel.add(lblStatus);
		painel.add(boxStatus);
//		painel.add(lblFuncionario);
//		painel.add(boxFuncionario);
//		
		tela.setVisible(true);
	}

}
