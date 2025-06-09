package br.dev.cecilia.tarefas.factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileFactory {

	private FileWriter fw;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;

	private String pathFuncionarios = "C:\\Users\\25132596\\tarefa\\funcionarios.csv";
	private String pathTarefas = "C:\\Users\\25132596\\tarefa\\tarefas.csv";
	
	public BufferedReader getBufferedReader() throws FileNotFoundException, IOException {
		fr = new FileReader(pathFuncionarios);
		br = new BufferedReader(fr);
		return br;
	}

	public BufferedWriter getBufferedWriter() throws FileNotFoundException, IOException{
		
		fw = new FileWriter(pathFuncionarios, true);
		bw = new BufferedWriter(fw);

		return bw;

	}
	
	public BufferedReader getBufferedReader2() throws FileNotFoundException, IOException {
		fr = new FileReader(pathTarefas);
		br = new BufferedReader(fr);
		return br;
	}
	
	public BufferedWriter getBufferedWriter2() throws FileNotFoundException, IOException{
		fw = new FileWriter(pathTarefas, true);
		bw = new BufferedWriter(fw);
		return bw;
	}
	
}
