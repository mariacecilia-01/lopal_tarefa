package br.dev.cecilia.tarefas.ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.dev.cecilia.tarefas.dao.FuncionarioDAO;
import br.dev.cecilia.tarefas.model.Funcionario;

public class FrameListaFuncionario {
	private JLabel labelTitulo;
	private JTable tableFuncionarios;
	private JScrollPane scrollFuncionarios;
	private JButton btnNovo;
//	private JButton btnExcluir;
//	private JButton btnAlterar;
	private JButton btnSair;
	
	private Font fontTitulo = new Font("Arial", Font.BOLD, 18);
	
	public FrameListaFuncionario(){
		criarTela();
	}
	
	private void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle("Cadastro de funcionários");
		tela.setSize(600,600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		Container painel = tela.getContentPane();
		
		labelTitulo = new JLabel("Cadastro de Funcionários");
		labelTitulo.setBounds(10, 20, 500, 30);
		labelTitulo.setFont(fontTitulo);
		
		btnNovo = new JButton("Cadastrar");
		
		//criação de tabela
		String[] colunas = new String[3];
		colunas[0] = "Código";
		colunas[1] = "Nome";
		colunas[2] = "Email";
		
		//obter lista de funcionários
		FuncionarioDAO dao = new FuncionarioDAO(null);
		List<Funcionario> funcionarios = dao.showEmployees();
		
		Object[][] dados = new Object[funcionarios.size()][3];
		
		int linha = 0;
		for(Funcionario f : funcionarios) {
			dados[linha][0] = f.getCodigo();
			dados[linha][1] = f.getNome();
			dados[linha][2] = f.getEmail();
			linha++;
		}
		
		
		tableFuncionarios = new JTable(dados, colunas);
		scrollFuncionarios = new JScrollPane(tableFuncionarios);
		scrollFuncionarios.setBounds(10, 70, 500, 300);
		
		btnNovo.setBounds(10, 380, 150, 40);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(170, 380, 150, 40);
		
		painel.add(labelTitulo);
		painel.add(scrollFuncionarios);
		painel.add(btnNovo);
		painel.add(btnSair);
		
		btnNovo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameFuncionario(tela);
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tela.dispose();
				
			}
		});
		
		
		
		tela.setVisible(true);
		

	}
}
