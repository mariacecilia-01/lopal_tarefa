package br.dev.cecilia.tarefas.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.dev.cecilia.tarefas.factory.FileFactory;
import br.dev.cecilia.tarefas.model.Funcionario;

public class FuncionarioDAO {
	
	private Funcionario funcionario;
	private FileFactory ff = new FileFactory();
	
	public Funcionario reconstruirFuncionario (String codigo, String nome, String telefone, String email) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setCodigo(codigo);
		funcionario.setNome(nome);
		funcionario.setTelefone(telefone);
		funcionario.setEmail(email);
		
		return funcionario;
	}
	
	
	//Método construtor
	public FuncionarioDAO(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public void gravar() {	
		try {
			
			BufferedWriter bw = ff.getBufferedWriter();
			
			bw.write(funcionario.toString());
			bw.flush();
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public List<Funcionario> showEmployees(){
		List<Funcionario> funcionarios = new ArrayList<>();
		
		try {
			BufferedReader br = ff.getBufferedReader();
			String linha = null;
			linha = br.readLine();
			do {
				linha = br.readLine();
				String[] funcionario = linha != null ? linha.split(",") : null;
				
				Funcionario f = new Funcionario();
				f.setCodigo(funcionario[0]);
				f.setNome(funcionario[1]);
				f.setTelefone(funcionario[2]);
				f.setEmail(funcionario[3]);
				
				funcionarios.add(f);
				
			} while(linha != null);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return funcionarios;
}

}
