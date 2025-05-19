package br.dev.cecilia.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.cecilia.tarefas.dao.FuncionarioDAO;
import br.dev.cecilia.tarefas.model.Funcionario;
import br.dev.cecilia.tarefas.model.Tarefa;


public class Main {
	private static String path = "C:\\Users\\25132596\\tarefa\\tarefas.txt";

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<>();
		List<String> frutas = new ArrayList<>();
		List<Double> numeros = new ArrayList<>();
		
		frutas.add("banana");
		frutas.add("maçã");
		frutas.add("abacaxi");
		frutas.add("laranja");
		
		numeros.add(4.9);
		numeros.add(12.78);
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCodigo(4);
		funcionario.setNome("Luzia Maravilha");
		funcionario.setMatricula("9908765");
		funcionario.setEmail("maraviluzia@email.com");
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCodigo(5);
		funcionario2.setNome("Rodolfo Cassagolfo");
		funcionario2.setMatricula("22132244");
		funcionario2.setEmail("cassagolfo@email.com");
		
		funcionarios.addAll(List.of(funcionario, funcionario2));
		
		
		System.out.println(frutas);
		System.out.println(funcionarios);
		
		for(Funcionario f : funcionarios) {
			System.out.println(f.getNome() + " - " + f.getEmail());
		}
	
		
		
//		Funcionario funcionario = new Funcionario();
//		funcionario.setCodigo(4);
//		funcionario.setNome("Luzia Maravilha");
//		funcionario.setMatricula("9908765");
//		funcionario.setEmail("maraviluzia@email.com");
//		
//		FuncionarioDAO dao = new FuncionarioDAO(funcionario);
//		dao.gravar();
//		
//		System.out.println(funcionario.toString());
				
	}
	
	private static void gravarArquivo() {
		FileWriter arquivo = null;
		BufferedWriter escritor = null;
		
		try {
			
			arquivo = new FileWriter(path, true);
			escritor = new BufferedWriter(arquivo);
			
			escritor.write("Essa é a ultima linha, por enquanto!!!\n");
			escritor.flush();
			
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
		
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
