package br.dev.cecilia.tarefas.ui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.dev.cecilia.tarefas.dao.TarefaDAO;
import br.dev.cecilia.tarefas.model.Tarefa;

public class FrameListaTarefa {
	
	private JLabel lblTarefaTitulo;
	private JTable tblListaTarefas;
	private JButton btnNovaTarefa;
	private JButton btnSair;
	private JScrollPane scrollLista;
	
	private Font fontTitulo = new Font("Arial", Font.BOLD, 24);
		
	public FrameListaTarefa() {
		criarTela();
	}
	
	private void criarTela(){
		JFrame tela = new JFrame();
		tela.setTitle("Tarefas");
		tela.setSize(600, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		
		Container painel = tela.getContentPane();
		
		lblTarefaTitulo = new JLabel("Lista de Tarefas");
		lblTarefaTitulo.setBounds(10, 20, 500, 30);
		lblTarefaTitulo.setFont(fontTitulo);
		
		//criar tabela
		String[] colunas = new String[3];
		colunas[0] = "Código";
		colunas[1] = "Nome da tarefa";
		colunas[2] = "Responsável";

		
		TarefaDAO dao = new TarefaDAO(null);
		List<Tarefa> tarefas = dao.showTarefas();
		
		Object[][] dados = new Object[tarefas.size()][3];
		int linha = 0;
		for (Tarefa t : tarefas) {
			dados[linha][0] = t.getCodigo();
			dados[linha][1] = t.getTitulo();
			dados[linha][2] = t.getResponsavel();
			linha++;
		}
		
		
		tblListaTarefas = new JTable(dados, colunas);
		scrollLista = new JScrollPane(tblListaTarefas);
		scrollLista.setBounds(10, 70, 500, 300);
		
		btnNovaTarefa = new JButton("Nova Tarefa +");
		btnNovaTarefa.setBounds(10, 400, 200, 50);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(220, 400, 200, 50);
		
		btnNovaTarefa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameTarefa();
			}
		});
		
		btnSair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tela.dispose();
			}
		});
		
		
		painel.add(lblTarefaTitulo);
		painel.add(tblListaTarefas);
		painel.add(scrollLista);
		painel.add(btnNovaTarefa);
		painel.add(btnSair);
		
		
		tela.setVisible(true);
	}
		

}
