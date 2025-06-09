package br.dev.cecilia.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Utilities;

import br.dev.cecilia.tarefas.dao.FuncionarioDAO;
import br.dev.cecilia.tarefas.model.Funcionario;
import br.dev.cecilia.tarefas.model.Tarefa;
import br.dev.cecilia.tarefas.ui.FrameFuncionario;
import br.dev.cecilia.tarefas.ui.FrameListaFuncionario;
import br.dev.cecilia.tarefas.ui.FrameListaTarefa;
import br.dev.cecilia.tarefas.ui.FrameTarefa;
import br.dev.cecilia.tarefas.ui.Home;
import br.dev.cecilia.tarefas.ui.FrameFuncionario;
import br.dev.cecilia.tarefas.utils.Utils;


public class Main {
	private static String path = "C:\\Users\\25132596\\tarefa\\tarefas.txt";

	public static void main(String[] args) {
		
//		new Home();
//		new FrameListaTarefa();
		new FrameTarefa();
//		new FrameListaFuncionario();
//		new FrameFuncionario();
		
		
		

	}
	
	


	private static void lerArquivo() {
		//Abrir o arquivo para leitura
		FileReader file = null;
		BufferedReader buffer = null;
		
		try {
			 file = new FileReader(path);
			 buffer  = new BufferedReader(file);
			 
			 String linha = buffer.readLine();
			 
			 while (linha != null) {
				 System.out.println(linha);
				 linha = buffer.readLine();
				 
			}

			 
		} catch (FileNotFoundException erro) {
			System.out.println("Arquivo não achado!");
			System.out.println(erro.getMessage());
		} catch (IOException erro) {
			System.out.println("Você não pode ler o arquivo!");
			System.out.println(erro.getMessage());
		} catch (Exception erro) {
			System.out.println("Erro genérico");
		}
	}

}
