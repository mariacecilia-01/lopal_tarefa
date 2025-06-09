package br.dev.cecilia.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.dev.cecilia.tarefas.factory.FileFactory;
import br.dev.cecilia.tarefas.model.Funcionario;
import br.dev.cecilia.tarefas.model.Tarefa;

public class TarefaDAO {
		
	private Tarefa tarefa;
	private FileFactory ff = new FileFactory();
	private Funcionario funcionario = new Funcionario();
	
	public TarefaDAO (Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public void gravar() {
		
		try {
			BufferedWriter bw = ff.getBufferedWriter();
			bw.write(tarefa.toString());
			bw.flush();
		} catch (Exception e) {
			System.out.println(e.getMessage());}
	}
		
		public List<Tarefa> showTarefas(){
			
			List<Tarefa> tarefas = new ArrayList<>();
			
			try {
				BufferedReader br = ff.getBufferedReader();
				String linha = null;
				linha = br.readLine();
				do {
					linha = br.readLine();
					String[] tarefa = linha != null ? linha.split(",") : null;
					
					Tarefa t = new Tarefa();
					t.setTitulo(tarefa[0]);
					t.setDescricao(tarefa[1]);
//					t.setResponsavel(funcionario[2]);
				
					tarefas.add(t);
				} while(linha != null);
			} catch (Exception e) {
				System.out.println(e.getMessage()); 
			
		}
			return tarefas;
		

	
		}
}
